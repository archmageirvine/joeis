package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030984 2-automorphic numbers: final digits of 2*n^2 agree with n.
 * @author Sean A. Irvine
 */
public class A030984 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, mF.add(1).divide2()}, new Z[] {Z.ONE.shiftLeft(mN), mF});
  }
}
