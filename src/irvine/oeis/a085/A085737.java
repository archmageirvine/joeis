package irvine.oeis.a085;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085737 Numerators in triangle formed from Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A085737 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = 0;
  private int mM = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(Rationals.SINGLETON.sum(0, mM, k -> mB.get(mN - k).multiply(Binomial.binomial(mM, k))).multiply(Z.NEG_ONE.pow(mN + mM)));
  }
}
