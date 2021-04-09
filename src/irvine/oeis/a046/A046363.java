package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A046363 Composite numbers whose sum of prime factors (with multiplicity) is prime.
 * @author Sean A. Irvine
 */
public class A046363 extends A002808 {

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
