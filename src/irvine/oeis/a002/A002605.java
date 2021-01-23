package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002605 a(n) = 2*(a(n-1) + a(n-2)), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A002605 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mA.add(mB).multiply2();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
