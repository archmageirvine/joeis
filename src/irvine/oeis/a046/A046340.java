package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;

/**
 * A046340 Odd composite numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046340 extends A071904 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Jaguar.factor(t).bigOmega() & 1) == 1) {
        return t;
      }
    }
  }
}
