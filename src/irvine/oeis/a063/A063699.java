package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063699 Positions of negative coefficients in cyclotomic polynomial Phi_n(x), A063698 in binary.
 * @author Sean A. Irvine
 */
public class A063699 extends A063698 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
