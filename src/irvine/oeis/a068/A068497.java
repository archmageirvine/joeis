package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068497 Primes p such that 2*p+1 and 2*p-1 are composites.
 * @author Sean A. Irvine
 */
public class A068497 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.multiply2();
      if (!p2.subtract(1).isProbablePrime() && !p2.add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

