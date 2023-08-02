package irvine.oeis.a047;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047680 a(n) = 2^(2*n-2) * (2^(2*n-1)-1) * numerator(|Bernoulli(4*n)|/n).
 * @author Sean A. Irvine
 */
public class A047680 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;

  @Override
  public Z next() {
    mB.nextQ();
    mB.nextQ();
    mB.nextQ();
    return mB.nextQ().divide(++mN).num().multiply(Z.ONE.shiftLeft(2L * mN - 1).subtract(1)).shiftLeft(2L * mN - 2).negate();
  }
}
