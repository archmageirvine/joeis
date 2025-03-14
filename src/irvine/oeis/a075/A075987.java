package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A075987 Numerator(1+1/prime(1)^3+ ... + 1/prime(n)^3) where prime(k) is the k-th prime.
 * @author Sean A. Irvine
 */
public class A075987 extends Sequence0 {

  private final Sequence mPrimes = new A000040();
  private Q mSum = null;

  protected Z select(final Q sum) {
    return sum.num();
  }

  @Override
  public Z next() {
    mSum = mSum == null ? Q.ONE : mSum.add(new Q(Z.ONE, mPrimes.next().pow(3)));
    return select(mSum);
  }
}
