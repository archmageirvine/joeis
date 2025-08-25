package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080050 Primes p such that 2^p-1 and the p-th Fibonacci number have a common factor. Prime terms of A074776.
 * @author Sean A. Irvine
 */
public class A080050 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Z.ONE.shiftLeft(p.longValueExact()).subtract(1).gcd(Functions.FIBONACCI.z(p)).isOne()) {
        return p;
      }
    }
  }
}

