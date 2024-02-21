package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A068507 Highly composite numbers sandwiched between twin primes.
 * @author Sean A. Irvine
 */
public class A068507 extends A002182 {

  @Override
  public Z next() {
    while (true) {
      final Z hc = super.next();
      if (hc.subtract(1).isProbablePrime() && hc.add(1).isProbablePrime()) {
        return hc;
      }
    }
  }
}

