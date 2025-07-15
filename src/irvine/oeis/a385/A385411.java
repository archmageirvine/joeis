package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a007.A007916;

/**
 * A385411 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A385411 extends A007916 {

  private boolean is(final Z n) {
    for (Z b = Z.TWO; b.compareTo(n) < 0; b = b.add(1)) {
      if (!n.mod(b).isZero()) {
        final String s = n.toString();
        Z c = Z.ONE;
        while (c.compareTo(n) < 0) {
          if (s.endsWith(c.toString())) {
            return true;
          }
          c = c.multiply(b);
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n)) {
        return n;
      }
    }
  }
}

