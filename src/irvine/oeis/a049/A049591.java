package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A049591 Odd primes p such that p+2 is composite.
 * @author Sean A. Irvine
 */
public class A049591 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!p.add(2).isProbablePrime()) {
        return p;
      }
    }
  }
}

