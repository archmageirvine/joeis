package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A048936 Subset of vampire numbers A014575 having exactly two representations of the desired form.
 * @author Sean A. Irvine
 */
public class A048936 implements Sequence {

  private Z mN = Z.valueOf(1259);
  private Z mJump = Z.valueOf(10000);
  private int mHalfLength = 2;

  protected int target() {
    return 2;
  }

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
      int cnt = 0;
      // We need sorted divisors for A048933 which extends this class
      for (final Z d : Cheetah.factor(mN).divisorsSorted()) {
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
            if (ok && ++cnt > target()) {
              break;
            }
          }
        }
      }
      if (cnt == target()) {
        return mN;
      }
    }
  }
}
