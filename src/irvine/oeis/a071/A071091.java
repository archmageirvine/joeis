package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071091 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.POCHHAMMER.z(mN + 2, 2L * mN).pow(6)
      .multiply(Functions.SUPERFACTORIAL.z(2L * mN).pow(3))
      .multiply(Functions.SUPERFACTORIAL.z(6L * mN + 2))
      .multiply((mN + 1L) * (mN + 1L) * (mN + 1L))
      .multiply(3L * mN + 1)
      .multiply((3L * mN + 2) * (3L * mN + 2))
      .divide(Functions.SUPERFACTORIAL.z(4L * mN + 2).pow(3));
  }
}
