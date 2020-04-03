package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030480 Primes with property that when squared all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030480 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!A030475.isMixed(p.square())) {
        return p;
      }
    }
  }
}
