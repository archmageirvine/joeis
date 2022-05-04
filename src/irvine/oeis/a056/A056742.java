package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056742 phi[(2^n - 1)]/2.
 * @author Sean A. Irvine
 */
public class A056742 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.multiply2();
    return Jaguar.factor(mN.subtract(1)).phi().divide2();
  }
}
