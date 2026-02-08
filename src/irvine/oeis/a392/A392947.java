package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392947 Primes p such that the multiplicative order of -2 modulo p is a multiple of 4.
 * @author Sean A. Irvine
 */
public class A392947 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((Functions.ORDER.l(p.longValueExact(), p.subtract(2)) & 3) == 0) {
        return p;
      }
    }
  }
}
