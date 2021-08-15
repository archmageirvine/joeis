package irvine.oeis.a217;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A217737 a(n) = Fibonacci(n) mod n*(n+1).
 * @author Georg Fischer
 */
public class A217737 extends A000045 {

  private Z mN = Z.ZERO;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().mod(mN.multiply(mN.add(1)));
  }
}
