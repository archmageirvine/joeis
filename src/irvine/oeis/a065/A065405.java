package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065405 Composite numbers k such that the sum of the divisors of k^2 is a prime.
 * @author Sean A. Irvine
 */
public class A065405 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z s = Jaguar.factor(t.square()).sigma();
      if (s.isProbablePrime()) {
        return t;
      }
    }
  }
}
