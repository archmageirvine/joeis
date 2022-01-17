package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053795 Composite numbers ending in 1, 3, 7 or 9.
 * @author Sean A. Irvine
 */
public class A053795 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final long r = c.mod(10);
      if (r == 1 || r == 3 || r == 7 || r == 9) {
        return c;
      }
    }
  }
}
