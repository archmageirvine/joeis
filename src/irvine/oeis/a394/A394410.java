package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394410 Quadratic recurrence sequence with a(1)=1, a(2)=3, and a(n) = (a(n-1)^2 + a(n-2)^2)/2 for n &gt; 2.
 * @author Sean A. Irvine
 */
public class A394410 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z t = mA.square().add(mB.square()).divide2();
    mA = mB;
    mB = t;
    return t;
  }
}
