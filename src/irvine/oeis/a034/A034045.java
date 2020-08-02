package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000378;

/**
 * A034045 Numbers that are imprimitively but not primitively represented by <code>x^2+y^2+z^2</code>.
 * @author Sean A. Irvine
 */
public class A034045 extends A000378 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(4) == 0) {
        return n;
      }
    }
  }
}
