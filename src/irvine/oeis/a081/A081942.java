package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081942.
 * @author Sean A. Irvine
 */
public class A081942 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(1);
        if (mA.multiply(t).add(1).isProbablePrime()) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
