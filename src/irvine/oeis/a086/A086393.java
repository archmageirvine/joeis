package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086393 (1/p)*(F(4p^2+1)-5) where F(k) denotes the k-th Fibonacci number and p runs through the primes (except p = 5).
 * @author Sean A. Irvine
 */
public class A086393 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    if (p.equals(Z.FIVE)) {
      p = super.next();
    }
    return Functions.FIBONACCI.z(p.square().multiply(4).add(1)).subtract(5).divide(p);
  }
}

