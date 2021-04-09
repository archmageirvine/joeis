package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;

/**
 * A046347 Odd composite numbers divisible by the sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046347 extends A071904 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.mod(Cheetah.factor(c).sopfr()).isZero()) {
        return c;
      }
    }
  }
}
