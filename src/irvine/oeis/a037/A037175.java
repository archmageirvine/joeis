package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037175 Numbers n such that |s(n)-n| = number of primes &lt;= n, where s(n) is sigma(n)-n.
 * @author Sean A. Irvine
 */
public class A037175 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Cheetah.factor(mN).sigma().subtract(mN.multiply2()).abs())) {
        return mN;
      }
    }
  }
}
