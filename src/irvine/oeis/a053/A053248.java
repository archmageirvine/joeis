package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053248 Second differences of sigma(n) that are negative.
 * @author Sean A. Irvine
 */
public class A053248 extends A053223 {

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
