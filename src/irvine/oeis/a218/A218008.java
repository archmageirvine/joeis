package irvine.oeis.a218;

import irvine.math.z.Z;
import irvine.oeis.a014.A014495;

/**
 * A218008 Sum of successive absolute differences of the binomial coefficients = 2*A014495(n).
 * @author Georg Fischer
 */
public class A218008 extends A014495 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
