package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049481 Both p and p+30 are primes.
 * @author Sean A. Irvine
 */
public class A049481 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(30).isProbablePrime()) {
        return p;
      }
    }
  }
}
