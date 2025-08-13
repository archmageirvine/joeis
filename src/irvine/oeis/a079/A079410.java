package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A079410 Number of ways to lace a shoe that has n pairs of eyelets such that the lace does not cross itself between the eyelet rows.
 * @author Sean A. Irvine
 */
public class A079410 extends Sequence3 {

  // After Hugo Pfortner, http://www.randomwalk.de/shoelace/lacros.txt
  // Differences:
  //  Rather that copying the permutation array into a larger array
  //  out permutation generator directly only modifies mPerm[1]..mPerm[mPerm.length-2]

  private static final float EPS0 = 0.001F;
  private static final float EPS1 = 0.999F;

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 2; // number of eyelets per side
  private int mN2;
  private int mN2p;
  private int mN2m;
  private int[] mPerm;

  private boolean nextPermutation() {
    int i = mPerm.length - 3;
    while (i > 0 && mPerm[i] >= mPerm[i + 1]) {
      --i;
    }
    if (i <= 0) {
      return false;
    }
    int j = mPerm.length - 2;
    while (mPerm[j] <= mPerm[i]) {
      --j;
    }
    final int tmp = mPerm[i];
    mPerm[i] = mPerm[j];
    mPerm[j] = tmp;
    for (int l = i + 1, r = mPerm.length - 2; l < r; ++l, --r) {
      final int tmp1 = mPerm[l];
      mPerm[l] = mPerm[r];
      mPerm[r] = tmp1;
    }
    return true;
  }

  private boolean isLoaded(final int[] e) {
    for (int i = 1; i < mN2 - 1; ++i) {
      if (e[i] <= mN) {
        if (e[i - 1] > mN || e[i + 1] > mN) {
          continue; // OK: at least one neighbor across
        }
      } else {
        if (e[i - 1] <= mN || e[i + 1] <= mN) {
          continue; // OK: at least one neighbor across
        }
      }
      return false; // unloaded eyelet: abandon path
    }
    return true;
  }

  private int countCrossings(final int[] e) {
    int k = 0; // crossing count
    for (int i = 1; i < mN2m; ++i) {
      // If both points of g1 on same side, skip
      final int em1 = e[i - 1];
      final int ei = e[i];
      final int ii;
      final int jj;
      if (em1 <= mN) {
        if (ei <= mN) {
          continue; // both left
        }
        ii = em1; // left y
        jj = mN2p - ei; // right y (mirrored!)
      } else {
        if (ei > mN) {
          continue;  // both right
        }
        ii = ei; // left y
        jj = mN2p - em1; // right y (mirrored!)
      }

      for (int j = i; j < mN2m; ++j) {
        final int ej = e[j];
        final int ejp1 = e[j + 1];
        final int kk;
        final int ll;
        if (ej <= mN) {
          if (ejp1 <= mN) {
            continue; // both left
          }
          kk = ej; // left y
          ll = mN2p - ejp1; // right y (mirrored!)
        } else {
          if (ejp1 > mN) {
            continue; // both right
          }
          kk = ejp1; // left y
          ll = mN2p - ej; // right y (mirrored!)
        }

        final int num = ii - kk;
        final int nen = ll - jj + num;
        if (nen == 0) {
          continue; // parallel in y vs x (no unique intersection)
        }
        final float q = (float) num / (float) nen; // intersection x-position in [0,1] if within
        if (q <= EPS0) {
          continue;
        }
        if (q >= EPS1) {
          continue;
        }
        ++k; // valid crossing strictly between the columns (not at endpoints)
      }
    }
    return k;
  }

  @Override
  public Z next() {
    // Note this code computes more than the 0 crossing cases, but only outputs the 0 number by default
    ++mN;
    mN2 = mN + mN;
    mN2p = mN2 + 1;
    mN2m = mN2 - 1;
    final int m = mN2 - 2;
    mPerm = new int[m + 2]; // Only elements 1..m-2 change
    for (int k = 0; k < mPerm.length; ++k) {
      mPerm[k] = k + 1;
    }
    final int nn = mN * mN + mN * mN;
    final long[] crossingCounts = new long[nn + 1];
    long l = 0; // number of legal lacings
    do {
      // Insert permuted path between fixed start and end
      if (!isLoaded(mPerm)) {
        continue; // abandon this path
      }
      final int k = countCrossings(mPerm);

      // Count lacings and update histogram
      ++l;
      ++crossingCounts[k];

      // Print crossing-free lacings
//      if (k == 0) {
//        for (int v : mE) {
//          System.out.printf("%2d ", v);
//        }
//        System.out.println();
//      }

    } while (nextPermutation());

    if (mVerbose) {
      System.out.printf("%n l=%d%n", l);
      System.out.println(" Crossings, #");
      for (int i = 0; i <= nn; ++i) {
        if (crossingCounts[i] > 0) {
          System.out.printf(" %3d  %d%n", i, crossingCounts[i]);
        }
      }
    }

    return Z.valueOf(crossingCounts[0] / 2);
  }
}

