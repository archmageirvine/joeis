package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A046134 p, p+2 and p+8 are primes.
 * @author Sean A. Irvine
 */
public class A046134 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(8).isProbablePrime()) {
        return p;
      }
    }
  }
}
