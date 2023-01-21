package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061107 a(0) = 0, a(1) = 1, a(n) is the concatenation of a(n-2) and a(n-1) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A061107 extends Sequence0 {

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
    final Z t = new Z(mB.toString() + mA);
    mA = mB;
    mB = t;
    return t;
  }
}
