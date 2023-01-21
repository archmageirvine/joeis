package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061083 Fibonacci-type sequence based on division: a(0) = 1, a(1) = 2 and a(n) = a(n-2)/a(n-1) but ignore decimal point.
 * @author Sean A. Irvine
 */
public class A061083 extends Sequence0 {

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
    Q t = new Q(mA, mB);
    while (!t.isInteger()) {
      t = t.multiply(10);
    }
    mA = mB;
    mB = t.toZ();
    return mB;
  }
}
