package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A046137 Primes p such that p+4 and p+12 are also prime.
 * @author Sean A. Irvine
 */
public class A046137 extends A023200 {

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
