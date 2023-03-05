package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061766 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else {
      Z t = Z.ZERO;
      while (true) {
        t = t.add(mA);
        final Z u = t.add(1);
        if (!u.isProbablePrime()) {
          mA = u;
          break;
        }
      }
    }
    return mA;
  }
}
