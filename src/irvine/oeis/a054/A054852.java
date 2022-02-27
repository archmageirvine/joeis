package irvine.oeis.a054;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A054852 As p runs through the primes == 1 mod 3, sequence gives Bernoulli(2p) - 1/6.
 * @author Sean A. Irvine
 */
public class A054852 extends A002476 {

  private static final Q ONE_SIXTH = new Q(1, 6);
  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = -1;

  @Override
  public Z next() {
    final long p = 2L * super.next().longValueExact();
    while (mN + 1 < p) {
      ++mN;
      mB.nextQ();
    }
    ++mN;
    return mB.nextQ().subtract(ONE_SIXTH).toZ();
  }
}
