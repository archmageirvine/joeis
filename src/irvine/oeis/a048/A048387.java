package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048387 Squares resulting from procedure described in A048386.
 * @author Sean A. Irvine
 */
public class A048387 extends A048385 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isSquare()) {
        return t;
      }
    }
  }
}
