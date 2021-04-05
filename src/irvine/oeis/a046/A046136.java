package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A046136 Primes p such that p, p+4 and p+10 are primes.
 * @author Sean A. Irvine
 */
public class A046136 extends A023200 {

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
