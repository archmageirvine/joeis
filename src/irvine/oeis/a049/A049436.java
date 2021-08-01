package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a023.A023202;

/**
 * A049436 p, p+8 and either p+2 or p+6 or both are all primes.
 * @author Sean A. Irvine
 */
public class A049436 extends A023202 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(2).isProbablePrime() || p.add(6).isProbablePrime()) {
        return p;
      }
    }
  }
}
