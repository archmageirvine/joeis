package irvine.oeis.a134;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A134858 Numbers that can be written as (a^2 - 1)(b^2 - 1) in five or more distinct ways.
 * @author Sean A. Irvine
 */
public class A134858 extends Sequence1 {

  private static final int MOD = 134217757;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mProducts = new TreeSet<>();
  private final int[] mHashCounts = new int[MOD];
  private long mN = 1;

  private int getExactCount(final Z n) {
    int cnt = 0;
    for (final Z a : mProducts) {
      final Z[] qr = n.divideAndRemainder(a);
      if (qr[0].compareTo(a) < 0) {
        break;
      }
      if (qr[1].isZero() && mProducts.contains(qr[0])) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().subtract(1);
      mProducts.add(t);
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n=" + mN);
      }
      for (long k = 2; k <= mN; ++k) {
        final Z s = t.multiply(k - 1).multiply(k + 1);
        final int hash = (int) s.mod(MOD);
        if (++mHashCounts[hash] >= 5) {
          final int cnt = getExactCount(s);
          if (cnt >= 5) {
            mHashCounts[hash] -= cnt;
            return s;
          }
        }
      }
    }
  }
}
