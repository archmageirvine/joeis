package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;

/**
 * A046364 Odd numbers whose sum of prime factors is prime (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046364 extends A071904 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Cheetah.factor(t).sopfr().isProbablePrime()) {
        return t;
      }
    }
  }
}
