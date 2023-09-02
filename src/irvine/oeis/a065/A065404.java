package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065404 Squares of composite numbers k such that sigma(k) (sum of divisors of k, A000203) is a prime.
 * @author Sean A. Irvine
 */
public class A065404 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().square();
      final Z s = Jaguar.factor(t).sigma();
      if (s.isProbablePrime()) {
        return t;
      }
    }
  }
}
