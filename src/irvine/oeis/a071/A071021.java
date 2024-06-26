package irvine.oeis.a071;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071021 Square array T(i,j) = Bernoulli(2i)*Bernoulli(2j) read by antidiagonals: denominators.
 * @author Sean A. Irvine
 */
public class A071021 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(2 * (mN - mM)).multiply(mB.get(2 * mM)).den();
  }
}
