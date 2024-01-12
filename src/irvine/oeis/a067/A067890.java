package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067890 Primes p such that phi(p+1) = phi(p-1).
 * @author Sean A. Irvine
 */
public class A067890 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Euler.phi(p.subtract(1)).equals(Euler.phi(p.add(1)))) {
        return p;
      }
    }
  }
}
