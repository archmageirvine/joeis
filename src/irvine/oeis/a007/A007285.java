package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A384640.
 * @author Sascha Kurz
 * @author Sean A. Irvine (Java port)
 */
public class A007285 extends Sequence3 {

  // Ported from https://www.mathe2.uni-bayreuth.de/sascha/source/minimum.cpp

  // ####################################################################
// #                                                                  #
// #      Minimum diameters of plane integral point sets              #
// #      =============================================               #
// #                                                                  #
// #      filename:     cpmp.cpp                                      #
// #      last changed: 01.11.2004                                    #
// #      author:       Sascha Kurz                                   #
// #      email:        sascha.kurz@uni-bayreuth.de                   #
// #      internet:     www.mathe2.uni-bayreuth.de/sascha             #
// #      compiler:     g++ 3.3.3                                     #
// #      os:           Suse Linux 9.1                                #
// #                                                                  #
// #      Algorithm                                                   #
// #      ---------                                                   #
// #      Based on the article "On the minimum diameter of plane      #
// #      integral point sets"                                        #
// #                                                                  #
// ####################################################################

  private static final int MAX_PRIME_DIVISORS = 100;

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mResults = new DynamicIntArray();
  {
    // Small results
    mResults.set(3, 1);
    mResults.set(4, 4);
    mResults.set(5, 7);
    mResults.set(6, 8);
    mResults.set(7, 17);
    mResults.set(8, 21);
  }
  private int mN = 2;
  private int mD = 2;

  private int[][] mFactorization1;
  private int[][] mFactorization2;
  private int mMaxPoints = 0;
  private int mMaxDiameter = 0;

  // Potentially all this could be replaced with FactorSequence
  private void initFactorization(final int d) {
    mFactorization1 = new int[d + 1][];
    mFactorization2 = new int[d + 1][];
    mFactorization1[0] = new int[] {1};
    mFactorization2[0] = new int[] {1};
    mFactorization1[1] = new int[] {1};
    mFactorization2[1] = new int[] {1};

    for (int i = 2; i <= d; ++i) {
      int r = i;
      final List<Integer> f1 = new ArrayList<>();
      final List<Integer> f2 = new ArrayList<>();
      long p = 2;
      while (p <= d && p * p <= r) {
        if (r % p == 0) {
          int count = 0;
          while (r % p == 0) {
            r /= p;
            ++count;
          }
          f1.add((int) p);
          f2.add(count);
        }
        p = Functions.NEXT_PRIME.l(p);
      }
      if (r > 1) {
        f1.add(r);
        f2.add(1);
      }
      f1.add(1);
      f2.add(1);
      mFactorization1[i] = f1.stream().mapToInt(Integer::intValue).toArray();
      mFactorization2[i] = f2.stream().mapToInt(Integer::intValue).toArray();
    }
  }

  private void merge(final int[] m11, final int[] m12, final int[] m21, final int[] m22, final int[] r1, final int[] r2) {
    int pos = 0;
    int pos1 = 0;
    int pos2 = 0;
    while (pos1 < m11.length && pos2 < m21.length && m11[pos1] != 1 && m21[pos2] != 1) {
      if (m11[pos1] == m21[pos2]) {
        r1[pos] = m11[pos1];
        r2[pos] = m12[pos1] + m22[pos2];
        ++pos1;
        ++pos2;
      } else if (m11[pos1] < m21[pos2]) {
        r1[pos] = m11[pos1];
        r2[pos] = m12[pos1];
        ++pos1;
      } else {
        r1[pos] = m21[pos2];
        r2[pos] = m22[pos2];
        ++pos2;
      }
      ++pos;
    }
    while (pos1 < m11.length && m11[pos1] != 1) {
      r1[pos] = m11[pos1];
      r2[pos] = m12[pos1];
      ++pos1;
      ++pos;
    }
    while (pos2 < m21.length && m21[pos2] != 1) {
      r1[pos] = m21[pos2];
      r2[pos] = m22[pos2];
      ++pos2;
      ++pos;
    }
    r1[pos] = 1;
    r2[pos] = 1;
  }

  private boolean unmerge(final int[] m11, final int[] m12, final int[] m21, final int[] m22, final int[] r1, final int[] r2) {
    int pos = 0;
    int pos1 = 0;
    int pos2 = 0;
    while (pos1 < m11.length && pos2 < m21.length && m11[pos1] != 1 && m21[pos2] != 1) {
      if (m11[pos1] == m21[pos2]) {
        if (m12[pos1] < m22[pos2]) {
          return false;
        }
        r1[pos] = m11[pos1];
        r2[pos] = m12[pos1] - m22[pos2];
        ++pos1;
        ++pos2;
      } else if (m11[pos1] < m21[pos2]) {
        r1[pos] = m11[pos1];
        r2[pos] = m12[pos1];
        ++pos1;
      } else {
        return false;
      }
      ++pos;
    }
    while (pos1 < m11.length && m11[pos1] != 1) {
      r1[pos] = m11[pos1];
      r2[pos] = m12[pos1];
      ++pos1;
      ++pos;
    }
    if (pos2 < m21.length && m21[pos2] != 1) {
      return false;
    }
    r1[pos] = 1;
    r2[pos] = 1;
    return true;
  }

  private boolean searchTriangle(final int a, final int b, final int c) {
    final long r1 = (long) b * b - (long) c * c + (long) a * a;
    final long r2 = 2L * a;
    final int g = Functions.GCD.i(r1, r2);
    final long q = r1 / g;
    final int zoomFactor = (int) (r2 / g);

    final int[] fa1 = new int[MAX_PRIME_DIVISORS];
    final int[] fa2 = new int[MAX_PRIME_DIVISORS];
    final int[] fb1 = new int[MAX_PRIME_DIVISORS];
    final int[] fb2 = new int[MAX_PRIME_DIVISORS];
    final int[] f1 = new int[MAX_PRIME_DIVISORS];
    final int[] f2 = new int[MAX_PRIME_DIVISORS];

    merge(mFactorization1[a + b + c], mFactorization2[a + b + c], mFactorization1[a + b - c], mFactorization2[a + b - c], fa1, fa2);
    merge(mFactorization1[a - b + c], mFactorization2[a - b + c], mFactorization1[-a + b + c], mFactorization2[-a + b + c], fb1, fb2);
    merge(fa1, fa2, fb1, fb2, f1, f2);
    unmerge(f1, f2, mFactorization1[g], mFactorization2[g], fa1, fa2);
    if (!unmerge(fa1, fa2, mFactorization1[g], mFactorization2[g], f1, f2)) {
      return false;
    }

    int numPrimeDiv = 0;
    while (numPrimeDiv < f1.length && f1[numPrimeDiv] != 1) {
      numPrimeDiv++;
    }

    final int[] divisorSet = new int[MAX_PRIME_DIVISORS];
    divisorSet[0] = -1;

    long h = 1;
    int numLeft = 0;
    int numRight = 0;
    int numMiddle = 0;
    int numExtra = 0;
    int maxABC = Math.max(a, Math.max(b, c));
    final int[] darst = new int[1000];
    int posDarst = 0;

    if (zoomFactor <= 2) {
      boolean ok = true;
      for (int i = 0; i < numPrimeDiv; i++) {
        if ((f2[i] & 1) != 0) {
          ok = false;
          break;
        }
        for (int j = 0; j < f2[i] / 2; j++) {
          h *= f1[i];
        }
      }
      if (ok) {
        numExtra = 1;
      }
    }

    boolean cont = true;
    while (true) {
      ++divisorSet[0];
      int j = 0;
      while (j < numPrimeDiv && divisorSet[j] > f2[j]) {
        divisorSet[j] = 0;
        ++divisorSet[++j];
      }
      if (j >= numPrimeDiv) {
        cont = false;
      }
      if (!cont) {
        break;
      }

      long factor1 = 1;
      long factor2 = 1;
      boolean ok = true;
      for (int i = 0; i < numPrimeDiv; ++i) {
        for (int k = 0; k < divisorSet[i]; ++k) {
          factor1 *= f1[i];
        }
        for (int k = 0; k < f2[i] - divisorSet[i]; ++k) {
          factor2 *= f1[i];
        }
      }
      if (factor1 > factor2 || factor2 > 2L * maxABC * zoomFactor || ((factor1 & 1) != (factor2 & 1))) {
        ok = false;
      }

      final long x = (factor1 + factor2) / 2;
      final long y = factor2 - x;
      if (x % zoomFactor != 0) {
        ok = false;
      }
      if (ok) {
        if (x >= (long) b * zoomFactor || y >= q || y <= q - (long) a * zoomFactor || ((q - y) % zoomFactor) != 0) {
          ok = false;
        }
        if (ok && y == 0) {
          if (q != (long) a * zoomFactor) {
            ++numMiddle;
            darst[posDarst++] = (int) (q / zoomFactor);
          }
          ok = false;
        }
        if (ok) {
          ++numLeft;
          darst[posDarst++] = (int) ((q - y) / zoomFactor);
        }
        ok = x < (long) c * zoomFactor && y < (long) a * zoomFactor - q && (((long) a * zoomFactor - q - y) % zoomFactor) == 0;
        if (ok && y != 0) {
          ++numRight;
          darst[posDarst++] = (int) ((q + y) / zoomFactor);
        }
      }
    }

    if (numExtra == 1) {
      if (zoomFactor == 1) {
        h *= 2;
      }
      if (h > maxABC) {
        maxABC = (int) h;
      }
    }

    final int total = numLeft + numRight + numMiddle + numExtra + 3;
    if (total > mMaxPoints || (total == mMaxPoints && maxABC <= mMaxDiameter)) {
      mMaxPoints = total;
      mMaxDiameter = maxABC;

      if (mResults.get(total) == 0) {
        mResults.set(total, maxABC);
      }
      if (mVerbose) {
        Arrays.sort(darst, 0, posDarst);
        final StringBuilder sb = new StringBuilder();

        sb.append("Point set with ").append(total).append(" points and diameter ").append(maxABC).append(" : (").append(a).append(",").append(b).append(",").append(c).append(")");
        if (numExtra == 1) {
          sb.append(" (extra point)");
        }
        sb.append(' ');

        long car = 1;
        for (int i = 0; i < numPrimeDiv; ++i) {
          if ((f2[i] & 1) == 1) {
            car *= f1[i];
          }
        }
        for (int i = 0; i < numPrimeDiv; ++i) {
          if (i > 0) {
            sb.append('*');
          }
          sb.append(f1[i]);
          if (f2[i] > 1) {
            sb.append('^').append(f2[i]);
          }
        }
        sb.append(" zoom_factor = ").append(zoomFactor).append(" [");
        for (int i = 0; i < posDarst; ++i) {
          if (i > 0) {
            sb.append(' ');
          }
          sb.append(darst[i]);
        }
        sb.append("] car = ").append(car);
        StringUtils.message(sb.toString());
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (mResults.get(mN) == 0) {
      ++mD;
      initFactorization(3 * mD);
      mMaxPoints = 3;
      mMaxDiameter = 1;

      if (mVerbose) {
        StringUtils.message("check diameter " + mD);
      }
      final int s1 = (mD + 1) / 2;
      for (int b = s1; b <= mD; ++b) {
        for (int c = mD + 1 - b; c <= b; ++c) {
          searchTriangle(mD, b, c);
          searchTriangle(b, mD, c);
          searchTriangle(c, mD, b);
        }
      }
    }
    return Z.valueOf(mResults.get(mN));
  }
}
