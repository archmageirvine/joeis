package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073627 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ONE;
    } else if (mA.isZero()) {
      mA = Z.ONE;
      return Z.ONE;
    }
    Z t = mA;
    while (true) {
      t = t.add(1);
      if (t.add(mA).isProbablePrime()) {
        mA = t;
        return t;
      }
    }
  }
}
