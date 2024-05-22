package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037175 Numbers k such that |s(k) - k| = number of primes &lt;= k, where s(k) is sigma(k) - k.
 * @author Sean A. Irvine
 */
public class A037175 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.SIGMA1.z(mN).subtract(mN.multiply2()).abs())) {
        return mN;
      }
    }
  }
}
