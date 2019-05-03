package irvine.oeis.a014;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014575 Vampire numbers (definition <code>2)</code>: numbers n with an even number of digits which have a factorization <code>n = i*j</code> where i and j have the same number of digits and the multiset of the digits of n coincides with the multiset of the digits of i and j.
 * @author Sean A. Irvine
 */
public class A014575 implements Sequence {

  private Z mN = Z.valueOf(1259);
  private Z mJump = Z.valueOf(10000);
  private int mHalfLength = 2;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mJump.equals(mN)) {
        mN = mN.multiply(10);
        mJump = mJump.multiply(100);
        ++mHalfLength;
      }
      final int[] counts = ZUtils.digitCounts(mN);
      final Z s = mN.sqrt();
      for (final Z d : Cheetah.factor(mN).divisors()) {
        if (d.compareTo(s) <= 0 && d.toString().length() == mHalfLength) {
          final Z e = mN.divide(d);
          if (d.mod(10) != 0 || e.mod(10) != 0) {
            final int[] cd = ZUtils.digitCounts(d);
            final int[] ce = ZUtils.digitCounts(e);
            boolean ok = true;
            for (int k = 0; k < counts.length; ++k) {
              if (counts[k] != cd[k] + ce[k]) {
                ok = false;
                break;
              }
            }
            if (ok) {
              return mN;
            }
          }
        }
      }
    }
  }
}
