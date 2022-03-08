package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055026 Number of Gaussian primes of successive norms (indexed by A055025).
 * @author Sean A. Irvine
 */
public class A055026 extends A055028 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
