package irvine.oeis.a068;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068528 Let N(2k) denote the numerator of B(2k), the 2k-th Bernoulli number, and D(2k) the denominator; sequence gives values of k such that gcd(N(2k),D(2k-2))=5.
 * @author Sean A. Irvine
 */
public class A068528 extends Sequence1 {

  private final BernoulliSequence mBernoulliSequence = new BernoulliSequence(0);
  private Q mB = mBernoulliSequence.nextQ();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q t = mB;
      mBernoulliSequence.nextQ(); // odd term
      mB = mBernoulliSequence.nextQ();
      if (mB.num().gcd(t.den()).equals(Z.FIVE)) {
        return Z.valueOf(mN);
      }
    }
  }
}

