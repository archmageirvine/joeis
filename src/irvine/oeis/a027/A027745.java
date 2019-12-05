package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027745 Number of primitive polynomials of degree n over <code>GF(9)</code>.
 * @author Sean A. Irvine
 */
public class A027745 implements Sequence {

  private int mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mT = mT.multiply(9);
    return Jaguar.factor(mT.subtract(1)).phi().divide(mN);
  }
}
