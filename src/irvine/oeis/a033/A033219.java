package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033219 Primes of form x^2+29*y^2.
 * @author Sean A. Irvine
 */
public class A033219 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z y2;
      for (Z x = Z.ONE; (y2 = x.square().multiply(29)).compareTo(p) <= 0; x = x.add(1)) {
        if (p.subtract(y2).isSquare()) {
          return p;
        }
      }
    }
  }
}

