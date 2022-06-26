package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057736 Primes p such that 2^p + 3 is prime.
 * @author Sean A. Irvine
 */
public class A057736 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.ONE.shiftLeft(p.intValueExact()).add(3).isProbablePrime()) {
        return p;
      }
    }
  }
}
