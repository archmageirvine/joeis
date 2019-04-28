package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.api.RationalSequence;
import irvine.oeis.Sequence;

/**
 * A003282 Numerators of coefficients of Green function for cubic lattice.
 * @author Sean A. Irvine
 */
public class A003282 implements Sequence {

  // After Herman Jamke

  private static class B003282 implements RationalSequence {

    private Q mA = Q.ZERO;
    private Q mB = Q.ZERO;
    private Q mC = null;
    private long mN = 0;

    @Override
    public Q nextQ() {
      if (mC == null) {
        mC = Q.ONE;
      } else {
        ++mN;
        final Q t = mC.multiply(Z.valueOf(mN).square().multiply(5).subtract(5 * mN - 2).multiply(2 * mN - 1).multiply(6))
          .subtract(mB.multiply(Z.valueOf(mN - 1).pow(3).multiply(24)))
          .subtract(mA.multiply(2 * mN - 3).multiply(mN - 2).multiply(mN - 1).multiply(2))
          .divide(8).divide(mN).divide(2 * mN - 1).divide(2 * mN + 1);
        mA = mB;
        mB = mC;
        mC = t;
      }
      return mC;
    }
  }

  private B003282 mSeq = new B003282();

  protected Z toZ(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    return toZ(mSeq.nextQ());
  }

}
