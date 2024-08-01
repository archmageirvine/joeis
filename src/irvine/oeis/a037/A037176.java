package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037176 Numbers k such that us(k) = primepi(k), where us(k) is the sum of the aliquot unitary divisors of k (A034460), and primepi(k) is the number of primes &lt;= k (A000720).
 * @author Sean A. Irvine
 */
public class A037176 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Jaguar.factor(mN).unitarySigma().subtract(mN))) {
        return mN;
      }
    }
  }
}
