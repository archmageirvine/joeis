package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086367 (1/p)*(F(p^2+1)-1) where p runs through the primes (except p = 5) and F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A086367 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    if (p.equals(Z.FIVE)) {
      p = super.next();
    }
    return Functions.FIBONACCI.z(p.square().add(1)).subtract(1).divide(p);
  }
}

