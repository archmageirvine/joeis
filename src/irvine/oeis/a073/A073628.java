package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073628 extends Sequence1 {

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
    Z t = mB;
    while (true) {
      t = t.add(1);
      if (t.add(mA).add(mB).isProbablePrime()) {
        mA = mB;
        mB = t;
        return t;
      }
    }
  }
}
