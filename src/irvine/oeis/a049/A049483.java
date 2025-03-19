package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049483 Primes p such that p + 2310 is also prime, where 2310 is the 5th primorial number A002110(5).
 * @author Sean A. Irvine
 */
public class A049483 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(2310).isProbablePrime()) {
        return p;
      }
    }
  }
}
