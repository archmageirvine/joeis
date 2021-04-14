package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014469 Triangular array formed from odd elements to right of middle of rows of the triangle of Eulerian numbers (A008292).
 * @author Sean A. Irvine
 */
public class A014469 extends A014467 {

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
