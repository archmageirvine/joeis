package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053227 extends A053222 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.signum() < 0) {
        return t.negate();
      }
    }
  }
}
