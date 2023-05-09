package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063697 Positions of positive coefficients in cyclotomic polynomial Phi_n(x), A063696 in binary.
 * @author Sean A. Irvine
 */
public class A063697 extends A063696 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
