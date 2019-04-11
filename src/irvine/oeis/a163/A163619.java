package irvine.oeis.a163;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163619 Let q(p) be the smallest prime greater than the prime p. A positive integer n is included in this sequence if <code>n+1</code> is divisible by q(p) for each prime p dividing n.
 * @author Sean A. Irvine
 */
public class A163619 implements Sequence {

  private long mN = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final long r = mN + 1;
      boolean ok = true;
      for (final Z p : Cheetah.factor(n).toZArray()) {
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

