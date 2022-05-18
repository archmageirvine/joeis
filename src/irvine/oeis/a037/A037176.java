package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037176 Numbers n such that us(n) = number of primes &lt;= n, where usigma(n) = sum of unitary divisors of n (A034448), us(n) is usigma(n)-n.
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
