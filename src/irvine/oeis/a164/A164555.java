package irvine.oeis.a164;
// manually deris2/essent at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a027.A027641;

/**
 * A164555 Numerators of the "original" Bernoulli numbers; also the numerators of the Bernoulli polynomials at x=1.
 * Apart from a sign flip in a(1), the same as A027641.
 * @author Georg Fischer
 */
public class A164555 extends A027641 {

  protected int mN = -1;
  
  @Override
  public Z next() {
    return ++mN <= 1 ? super.next().abs() : super.next();
  }
}
