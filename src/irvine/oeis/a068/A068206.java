package irvine.oeis.a068;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068206 Let N(2n) denote the numerator of B(2n), the 2n-th Bernoulli number and D(2n) the denominator; sequence gives values of n such that gcd(N(2n),D(2n-2))=7.
 * @author Sean A. Irvine
 */
public class A068206 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Q mA = mB.nextQ();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q t = mA;
      mB.nextQ();
      mA = mB.nextQ();
      if (mA.num().gcd(t.den()).equals(Z.SEVEN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
