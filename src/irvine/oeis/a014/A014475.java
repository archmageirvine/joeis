package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014475 Triangular array formed from odd elements to right of middle of rows of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A014475 extends A014413 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
