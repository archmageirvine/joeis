package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014472 Triangular array formed from even elements to right of middle of rows of the triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014472 extends A014467 {

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
