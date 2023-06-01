package irvine.oeis.a359;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359698 Least k &gt; 0 such that the first n digits of 2^k and 3^k are identical.
 * @author Sean A. Irvine
 */
public class A359698 extends Sequence1 {

  private static final CR PI_FRAC = CR.PI.subtract(CR.THREE);
  private int mN = 0;
  private CR mRecord = CR.HALF;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      final CR delta = PI_FRAC.subtract(CR.valueOf(mA).shiftRight(mN).frac()).abs();
      if (delta.compareTo(mRecord) < 0) {
        mRecord = delta;
        return Z.valueOf(mN);
      }
    }
  }
}
