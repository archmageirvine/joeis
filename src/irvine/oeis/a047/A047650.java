package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047650 Primes for which golden mean tau is a quadratic residue.
 * @author Sean A. Irvine
 */
public class A047650 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      for (Z s, b = Z.ZERO; (s = p.subtract(b.square().multiply(20))).signum() >= 0; b = b.add(1)) {
        if (s.isSquare()) {
          return p;
        }
      }
    }
  }
}
