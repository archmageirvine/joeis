package irvine.oeis.a163;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163619 Let q(p) be the smallest prime greater than the prime p. A positive integer n is included in this sequence if n+1 is divisible by q(p) for each prime p dividing n.
 * @author Sean A. Irvine
 */
public class A163619 extends Sequence1 {

  private long mN = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final long r = mN + 1;
      boolean ok = true;
      for (final Z p : Jaguar.factor(n).toZArray()) {
        if (r % mPrime.nextPrime(p).longValue() != 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

