package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048392 Squares resulting from procedure described in A048391.
 * @author Sean A. Irvine
 */
public class A048392 extends A048390 {

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
