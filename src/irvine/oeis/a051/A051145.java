package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051145 a(0)=0, a(1)=1, a(n) = smallest number such that sequence b(n) = a(n) OR a(n+1) is strictly monotonically increasing.
 * @author Sean A. Irvine
 */
public class A051145 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mB.or(mA).add(1).and(mB.not());
    mA = mB;
    mB = t;
    return t;
  }
}
