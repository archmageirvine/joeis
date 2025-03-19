package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049484 Primes p such that p + 30030 is also prime, where 30030 is the 6th primorial number A002110(6).
 * @author Sean A. Irvine
 */
public class A049484 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(30030).isProbablePrime()) {
        return p;
      }
    }
  }
}
