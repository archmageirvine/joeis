package irvine.oeis.a115;
// manually deris/essent at 2022-04-27 19:28

import irvine.math.z.Z;
import irvine.oeis.a053.A053117;

/**
 * A115322 Triangle of coefficients of Pell polynomials.
 * @author Georg Fischer
 */
public class A115322 extends A053117 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
