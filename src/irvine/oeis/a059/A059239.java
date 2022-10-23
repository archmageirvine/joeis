package irvine.oeis.a059;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059239 Numerators of coefficients of asymptotic expansion related to iterated sine function.
 * @author Sean A. Irvine
 */
public class A059239 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -1;
  private Q mF = Q.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(-12).divide(2L * mN).divide(2L * mN - 1);
    }
    final Q b = mB.nextQ();
    mB.nextQ();
    return select(b.multiply(1 - 2L * mN).multiply(mF));
  }
}
