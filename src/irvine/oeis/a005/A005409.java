package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005409 Number of polynomials of height n: a(1)=1, a(2)=1, a(3)=4, a(n) = 2*a(n-1) + a(n-2) + 2 for n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A005409 extends Sequence1 {

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
