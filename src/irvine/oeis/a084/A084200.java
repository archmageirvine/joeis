package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084200 LeastCommonMultiple{q+1: q prime, q &lt; prime(n), q+1 divides prime(n)+1}.
 * @author Sean A. Irvine
 */
public class A084200 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    Z lcm = Z.ONE;
    mP = mPrime.nextPrime(mP);
    final long t = mP + 1;
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      if (t % (q + 1) == 0) {
        lcm = lcm.lcm(q + 1);
      }
    }
    return lcm;
  }
}
