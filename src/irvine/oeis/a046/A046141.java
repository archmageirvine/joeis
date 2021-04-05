package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023202;

/**
 * A046141 p, p+8 and p+12 are primes.
 * @author Sean A. Irvine
 */
public class A046141 extends A023202 {

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
