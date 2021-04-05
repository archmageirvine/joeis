package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023201;

/**
 * A046139 p, p+6 and p+10 are primes.
 * @author Sean A. Irvine
 */
public class A046139 extends A023201 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(10).isProbablePrime()) {
        return p;
      }
    }
  }
}
