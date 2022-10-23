package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A030994 9-automorphic numbers ending in 4: final digits of 9*n^2 agree with n.
 * @author Sean A. Irvine
 */
public class A030994 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, Z.NINE.modInverse(mF)}, new Z[] {Z.ONE.shiftLeft(mN), mF});
  }
}
