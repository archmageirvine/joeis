package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063671 Positions of nonzero coefficients in cyclotomic polynomial Phi_n(x), A063670 in binary.
 * @author Sean A. Irvine
 */
public class A063671 extends A063670 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
