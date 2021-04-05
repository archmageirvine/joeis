package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A046135 Primes p such that p+2 and p+12 are primes.
 * @author Sean A. Irvine
 */
public class A046135 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(12).isProbablePrime()) {
        return p;
      }
    }
  }
}
