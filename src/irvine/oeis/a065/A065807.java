package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A065807 Squares with a smaller square as final digits.
 * @author Sean A. Irvine
 */
public class A065807 extends A000290 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      Z t = Z.TEN;
      while (t.compareTo(s) < 0) {
        if (s.mod(t).isSquare()) {
          return s;
        }
        t = t.multiply(10);
      }
    }
  }
}
