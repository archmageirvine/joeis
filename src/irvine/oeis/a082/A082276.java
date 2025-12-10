package irvine.oeis.a082;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A082276 Smallest number whose digits can be permuted to get exactly n distinct palindromes.
 * @author Sean A. Irvine
 */
public class A082276 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;
  private final TreeSet<int[]> mS = new TreeSet<>((x, y) -> {
    final int c = Integer.compare(x.length, y.length);
    if (c != 0) {
      return c;
    }
    return Arrays.compare(x, y);
  });
  {
    mS.add(new int[] {0});
    mS.add(new int[] {1});
    mS.add(new int[] {0, 0});
    mS.add(new int[] {1, 1});
  }

  private Z toN(final int[] m) {
    boolean leadingZero = m.length > 1 && m[0] == 0;
    Z res = leadingZero ? Z.ONE : Z.ZERO;
    for (final int v : m) {
      if (leadingZero && v == 1) {
        leadingZero = false;
      } else {
        res = res.multiply(10).add(v);
      }
    }
    return res;
  }

  private Z countSimple(final int[] m) {
    final int[] c = new int[m[m.length - 1] + 1];
    IntegerPartition.toCountForm(m, c);
    for (int k = 0; k < c.length; ++k) {
      c[k] /= 2;
    }
    return Binomial.multinomial(m.length / 2, c);
  }

//  private int countBruteForce(final int[] m) {
//    int cnt = 0;
//    final Permutation perm = new Permutation(m);
//    int[] p;
//    while ((p = perm.next()) != null) {
//      if (Predicates.PALINDROME.is(Permutation.permToZ(p))) {
//        ++cnt;
//      }
//    }
//    return cnt;
//  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final int[] m = mS.pollFirst();
      int j = 0;
      while (j < m.length && m[j] == 0) {
        ++j;
      }
      final Z cnt;
      if (m[m.length - 1] != 0) { // Don't bother if entire set is 0
        if (j == 0) {
          // No 0s
          cnt = countSimple(m);
        } else if ((j & 1) == 1) {
          // Odd number of 0s, either a 0 in the middle or one 0 is not used.
          cnt = countSimple(Arrays.copyOfRange(m, 1, m.length)).multiply2();
        } else {
          // Even number of 0s, either use them all, or discard one 0 and use the other in the middle
          cnt = countSimple(m).add(countSimple(Arrays.copyOfRange(m, 1, m.length)));
        }
        if (cnt.bitLength() < Integer.SIZE) {
          final int ci = cnt.intValueExact();
          if (mFirsts.get(ci) == null) {
            final Z val = toN(m);
            mFirsts.set(ci, val);
            if (mVerbose) {
              StringUtils.message("Solution for " + cnt + " is " + val);
            }
          }
        }
      }
      final int last = m[m.length - 1];
      if (m[m.length - 1] < 10) {
        final int[] m2 = Arrays.copyOf(m, m.length + 2);
        m2[m.length] = last + 1;
        m2[m.length + 1] = last + 1;
        mS.add(m2);
      }
      boolean ok = true;
      if (last > 1) {
        int c = 1;
        int k = m.length - 1;
        while (m[--k] == last) {
          ++c;
        }
        int d = 1;
        while (--k >= 0 && m[k] == last - 1) {
          ++d;
        }
        if (d <= c) {
          ok = false;
        }
      }
      if (ok) {
        final int[] m1 = Arrays.copyOf(m, m.length + 2);
        m1[m.length] = last;
        m1[m.length + 1] = last;
        mS.add(m1);
      }
    }
    return mFirsts.get(mN);
  }
}
