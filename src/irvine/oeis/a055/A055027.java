package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055027 Number of inequivalent Gaussian primes of successive norms (indexed by A055025).
 * @author Sean A. Irvine
 */
public class A055027 extends A055029 {

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
