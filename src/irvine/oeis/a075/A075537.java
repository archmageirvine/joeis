package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075537 a(1)=1, a(2)=2, then use "merge and minus": a(n)=merge(a(n-2),a(n-1))-a(n-2)-a(n-1).
 * @author Sean A. Irvine
 */
public class A075537 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = new Z(mA.toString() + mB).subtract(mA).subtract(mB);
    mA = mB;
    mB = t;
    return t;
  }
}

