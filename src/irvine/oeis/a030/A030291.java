package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030291 Primes with at most two different digits.
 * @author Sean A. Irvine
 */
public class A030291 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Integer.bitCount(Functions.SYNDROME.i(p)) <= 2) {
        return p;
      }
    }
  }
}
