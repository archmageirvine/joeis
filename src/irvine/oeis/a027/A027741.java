package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027741 Number of primitive polynomials of degree n over <code>GF(5)</code>.
 * @author Sean A. Irvine
 */
public class A027741 implements Sequence {

  private int mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mT = mT.multiply(5);
    return Jaguar.factor(mT.subtract(1)).phi().divide(mN);
  }
}
