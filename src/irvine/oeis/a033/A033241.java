package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033241 Primes of form x^2+65*y^2.
 * @author Sean A. Irvine
 */
public class A033241 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z y2;
      for (Z x = Z.ONE; (y2 = x.square().multiply(65)).compareTo(p) <= 0; x = x.add(1)) {
        if (p.subtract(y2).isSquare()) {
          return p;
        }
      }
    }
  }
}

