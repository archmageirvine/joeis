package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.api.RationalSequence;
import irvine.oeis.Sequence;

/**
 * A003284 Numerators of coefficients of Green function for cubic lattice.
 * @author Sean A. Irvine
 */
public class A003284 implements Sequence {

  private static class B003284 implements RationalSequence {

    private Q mA = null;
    private Q mB = null;
    private long mN = 0;
    private final Q mB0;
    private final Q mB1;

    B003284(final Q b0, final Q b1) {
      mB0 = b0;
      mB1 = b1;
    }

    @Override
    public Q next() {
      if (mA == null) {
        mA = mB0;
        return mB0;
      } else if (mB == null) {
        mB = mB1;
      } else {
        ++mN;
        final Q t = mB.multiply(Z.valueOf(mN).square().multiply(20).add(1).multiply(mN).multiply(4))
          .subtract(mA.multiply(Z.valueOf(2 * mN - 1).pow(3)))
          .divide(36).divide(mN).divide(mN + 1).divide(2 * mN + 1);
        mA = mB;
        mB = t;
      }
      return mB;
    }
  }

  private B003284 mSeq = new B003284(b0(), b1());

  protected Q b0() {
    return Q.ONE;
  }

  protected Q b1() {
    return new Q(1, 18);
  }

  protected Z toZ(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    return toZ(mSeq.next());
  }

}
