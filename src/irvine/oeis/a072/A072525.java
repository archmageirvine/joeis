package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072523.
 * @author Sean A. Irvine
 */
public class A072525 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(1);
        if (!t.isProbablePrime() && mA.add(t).isProbablePrime()) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
