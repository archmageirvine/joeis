package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033560 Primes p such that <code>4!+p</code> is also prime.
 * @author Sean A. Irvine
 */
public class A033560 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(24).isProbablePrime()) {
        return p;
      }
    }
  }
}
