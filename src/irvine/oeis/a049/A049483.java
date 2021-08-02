package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049483 Both p and p+Q(5) are primes, where Q(5)=2310 is the 5th primorial number (A002110[ 5 ]).
 * @author Sean A. Irvine
 */
public class A049483 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(2310).isProbablePrime()) {
        return p;
      }
    }
  }
}
