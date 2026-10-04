package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063743 Numbers k such that k and Omega(k) are relatively prime, where Omega(k) is the number of prime divisors of k (with repetition).
 * @author Sean A. Irvine
 */
public class A063743 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GCD.l(Functions.BIG_OMEGA.l(++mN), mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

