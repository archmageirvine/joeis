package irvine.oeis.a047;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A047272 Primes p such that p == 1 (mod 4) and Fibonacci((p-1)/4) is divisible by p.
 * @author Sean A. Irvine
 */
public class A047272 extends A002144 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z f = Fibonacci.fibonacci((p.subtract(1).divide(4).intValueExact()));
      if (f.mod(p).isZero()) {
        return p;
      }
    }
  }
}
