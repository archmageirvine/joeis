package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005409 Number of polynomials of height n: <code>a(n) = 2a(n-1) + a(n-2) + 2</code>.
 * @author Sean A. Irvine
 */
public class A005409 implements Sequence {

  private boolean mFirst = true;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      } else {
        mB = Z.FOUR;
        return Z.FOUR;
      }
    }
    final Z t = mB.multiply2().add(mA).add(2);
    mA = mB;
    mB = t;
    return t;
  }
}
