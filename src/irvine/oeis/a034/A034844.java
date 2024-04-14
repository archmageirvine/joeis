package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034844 Primes with only nonprime decimal digits.
 * @author Sean A. Irvine
 */
public class A034844 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((Functions.SYNDROME.i(p) & 0b10101100) == 0) {
        return p;
      }
    }
  }
}
