package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068858 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(mA);
        // k should be close to (1/2)*(sqrt(1+t)-1)
        final Z s = t.add(1).sqrt().or(Z.ONE); // makes s odd
        if (t.equals(s.multiply(s.add(2))) || t.equals(s.multiply(s.subtract(2)))) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
