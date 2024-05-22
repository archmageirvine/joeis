package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037172 Numbers n such that sigma(n) - n = {number of primes &lt;= n}.
 * @author Sean A. Irvine
 */
public class A037172 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.SIGMA1.z(mN).subtract(mN))) {
        return mN;
      }
    }
  }
}
