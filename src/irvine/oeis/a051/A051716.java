package irvine.oeis.a051;

import irvine.math.api.RationalSequence;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051716 Numerators of Bernoulli twin numbers C(n).
 * @author Sean A. Irvine
 */
public class A051716 extends Sequence0 {

  private final RationalSequence mC = new RationalSequence() {

    private long mN = -1;
    private final BernoulliSequence mB = new BernoulliSequence(0);
    private Q mA = mB.nextQ();

    @Override
    public Q nextQ() {
      if (++mN == 0) {
        return Q.ONE;
      } else {
        final Q t = mA;
        mA = mB.nextQ();
        final Q res = mA.add(t);
        return (mN & 1) == 0 ? res : res.negate();
      }
    }

    @Override
    public int getOffset() {
      return 0;
    }
  };

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(mC.nextQ());
  }
}
