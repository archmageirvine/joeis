package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.api.RationalSequence;
import irvine.oeis.Sequence;

/**
 * A003301.
 * @author Sean A. Irvine
 */
public class A003301 implements Sequence {

  private static class B003301 implements RationalSequence {

    private Q mA = null;
    private Q mB = null;
    private long mN = 0;
    private final Q mB0;
    private final Q mB1;

    B003301(final Q b0, final Q b1) {
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
        final Q t = mB.multiply(2 * mN + 1).multiply(Z.valueOf(mN).multiply(10).add(10).multiply(mN).add(3)).multiply(2)
          .subtract(mA.multiply(Z.valueOf(mN).pow(3)).multiply(4))
          .divide(9).divide(mN + 1).divide(2 * mN + 1).divide(2 * mN + 3);
        mA = mB;
        mB = t;
      }
      return mB;
    }
  }

  private B003301 mSeq = new B003301(b0(), b1());

  protected Q b0() {
    return Q.ONE;
  }

  protected Q b1() {
    return new Q(2, 9);
  }

  protected Z toZ(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    return toZ(mSeq.next());
  }

}
