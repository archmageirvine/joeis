package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023201;

/**
 * A046138 Primes p such that p+6 and p+8 are also primes.
 * @author Sean A. Irvine
 */
public class A046138 extends A023201 {

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
