package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073629 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.TWO;
        return Z.TWO;
      }
      mC = Z.THREE;
      return Z.THREE;
    }
    Z t = mC;
    while (true) {
      t = t.add(1);
      if (t.add(mA).add(mB).add(mC).isProbablePrime()) {
        mA = mB;
        mB = mC;
        mC = t;
        return t;
      }
    }
  }
}
