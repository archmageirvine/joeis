package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079626 extends Sequence1 {

  private Q mA = null;
  private Q mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
      } else {
        mB = Q.ONE;
      }
      return Z.ZERO;
    }
    final Q t = mB.subtract(mA.multiply(3).divide(2)).abs();
    mA = mB;
    mB = t;
    return Z.valueOf(t.den().makeOdd().auxiliary());
  }
}

