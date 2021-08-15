package irvine.oeis.a182;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.a002.A002708;

/**
 * A182167 Min( f(n), n-f(n) ), where f(n) = A002708(n) = Fibonacci(n) mod n.
 * @author Georg Fischer
 */
public class A182167 extends A002708 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z fn = super.next();
    return fn.min(mN.subtract(fn));
  }
}
