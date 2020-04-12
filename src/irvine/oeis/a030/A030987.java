package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030987 4-automorphic numbers: final digits of <code>4*n^2</code> agree with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A030987 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, Z.FOUR.modInverse(mF)}, new Z[] {Z.ONE.shiftLeft(mN), mF});
  }
}
