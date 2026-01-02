package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391842 Integers k such that d(k)*d(k+1) is a divisor of k*(k+1) where d(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A391842 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).multiply(mN + 1).mod(Functions.SIGMA0.z(mN).multiply(Functions.SIGMA0.z(mN + 1))).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
