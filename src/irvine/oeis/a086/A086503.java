package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086503 (Fibonacci(p^2) - 1)/p where p runs through the primes (except p = 5).
 * @author Sean A. Irvine
 */
public class A086503 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    if (Z.FIVE.equals(p)) {
      p = super.next();
    }
    return Functions.FIBONACCI.z(p.square()).subtract(1).divide(p);
  }
}

