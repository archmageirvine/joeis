package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000415.
 * @author Sean A. Irvine
 */
public class A000415 extends A000404 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ZERO.equals(t.sqrtAndRemainder()[1])) {
        return t;
      }
    }
  }
}

