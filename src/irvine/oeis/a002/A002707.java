package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002707 Number of ternary trees with n nodes.
 * @author Sean A. Irvine
 */
public class A002707 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
        return Z.ONE;
      } else {
        mC = Z.THREE;
      }
    } else {
      final Z cb = mC.add(mB);
      final Z t = new Q(mC.multiply(cb).multiply(cb.add(mA)), Z.SIX)
        .add(new Q(mC.multiply(cb), mB.add(mA)).multiply(new Q(mC, mB).subtract(new Q(mB, mA))))
        .add(new Q(mC.square(), mB)).toZ();
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
