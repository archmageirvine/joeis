package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014476 Triangular array formed from even elements to right of middle of rows of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A014476 extends A014413 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isEven()) {
        return t;
      }
    }
  }
}
