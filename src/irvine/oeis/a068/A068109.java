package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068109 a(1) = 0, a(2) = 1, a(n) = concatenate(a(n-1) and a(n-2)) - a(n-1).
 * @author Sean A. Irvine
 */
public class A068109 extends Sequence1 {

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
    final Z t = new Z(mB.toString() + mA).subtract(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
