package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030482 Primes with property that when cubed all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030482 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!A030475.isMixed(p.pow(3))) {
        return p;
      }
    }
  }
}
