package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.MemoryFunction1;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006934.
 * @author Sean A. Irvine
 */
public class A006934 extends MemoryFunction1<Q> implements Sequence {

  private final BernoulliSequence mBernoulliSequence = new BernoulliSequence(0);
  private final ArrayList<Q> mB = new ArrayList<>();
  private int mN = -1;

  private Q bernoulli(final int k) {
    while (k >= mB.size()) {
      mB.add(mBernoulliSequence.next());
    }
    return mB.get(k);
  }

  @Override
  protected Q compute(final int n) {
    if (n < 2) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    for (int k = 2; k <= n; k += 2) {
      sum = sum.add(get(n - k).multiply(Binomial.binomial(n - 1, k - 1)).multiply(bernoulli(k)).divide(k));
    }
    return sum.divide(-2);
  }

  @Override
  public Z next() {
    ++mN;
    return get(2 * mN).multiply(Binomial.binomial(4 * mN, 2 * mN).shiftLeft(3 * mN - Integer.bitCount(mN))).toZ().abs();
  }
}
