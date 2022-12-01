package irvine.oeis.a236;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A236395 a(n) = Fibonacci(p) mod p^2, where p = prime(n).
 * @author Georg Fischer
 */
public class A236395 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Fibonacci.fibonacci(p.intValue()).mod(p.square());
  }
}
