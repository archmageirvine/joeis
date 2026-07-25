package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086105 Adding, multiplying and exponentiating cycle of the previous two terms similar to A039941.
 * @author Sean A. Irvine
 */
public class A086105 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private int mN = -1;

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
    final Z t;
    switch (++mN % 3) {
      case 0:
        t = mA.add(mB);
        break;
      case 1:
        t = mA.multiply(mB);
        break;
      default:
        t = mA.pow(mB);
        break;
    }
    mA = mB;
    mB = t;
    return t;
  }
}

