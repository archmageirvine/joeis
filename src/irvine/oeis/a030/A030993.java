package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A030993 8-automorphic numbers: final digits of 8*n^2 agree with n.
 * @author Sean A. Irvine
 */
public class A030993 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, Z.EIGHT.modInverse(mF)}, new Z[] {Z.ONE.shiftLeft(mN), mF});
  }
}
