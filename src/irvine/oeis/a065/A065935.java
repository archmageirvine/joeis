package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007305;
import irvine.oeis.a047.A047679;

/**
 * A065935 Permutation of N induced by the order-preserving bijection QuQR2toQuQR1 on rationals.
 * @author Sean A. Irvine
 */
public class A065935 extends A065658 {

  private final Sequence mNum = new A007305().skip(2);
  private final Sequence mDen = new A047679();

  private Q qToQ01(final Q r) {
    final Z f = Z.ONE.shiftLeft(r.toZ().longValueExact());
    return r.frac().divide(2).add(f.subtract(1)).divide(f);
  }

  @Override
  public Z next() {
    return frac2PositionIn01SBTree(qToQ01(new Q(mNum.next(), mDen.next())));
  }
}
