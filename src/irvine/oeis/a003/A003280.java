package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.api.RationalSequence;
import irvine.oeis.Sequence;

/**
 * A003280.
 * @author Sean A. Irvine
 */
public class A003280 implements Sequence {

  // After Herman Jamke

  private static class B003280 implements RationalSequence {

    private Q mA = Q.ZERO;
    private Q mB = null;
    private Q mC = null;
    private long mN = 1;
    private final Q mB1;
    private final Q mB0;

    B003280(final Q b0, final Q b1) {
      mB0 = b0;
      mB1 = b1;
    }

    @Override
    public Q next() {
      if (mB == null) {
        mB = mB0;
        return mB;
      }
      if (mC == null) {
        mC = mB1;
      } else {
        ++mN;
        final Q t = mC.multiply(mN - 1).multiply(Z.valueOf(mN - 1).square().multiply(60).add(9))
          .subtract(mB.multiply(Z.valueOf(2 * mN - 3).pow(3).multiply(3)))
          .subtract(mA.multiply(mN - 2).multiply(2 * mN - 3).multiply(2 * mN - 5))
          .divide(16).divide(mN - 1).divide(mN).divide(2 * mN - 1);
        mA = mB;
        mB = mC;
        mC = t;
      }
      return mC;
    }
  }

  protected Q b0() {
    return Q.ONE;
  }

  protected Q b1() {
    return new Q(9, 32);
  }

  private B003280 mSeq = new B003280(b0(), b1());

  @Override
  public Z next() {
    return mSeq.next().num();
  }

}
