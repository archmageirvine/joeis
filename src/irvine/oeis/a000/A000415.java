package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000415 Numbers that are the sum of 2 but no fewer nonzero squares.
 * @author Sean A. Irvine
 */
public class A000415 extends A000404 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isSquare()) {
        return t;
      }
    }
  }
}

