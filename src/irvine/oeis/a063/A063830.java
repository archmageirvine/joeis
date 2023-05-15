package irvine.oeis.a063;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063830 a(n+1) is the smallest odd m whose cototient equals a(n).
 * @author Sean A. Irvine
 */
public class A063830 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(2);
        if (t.subtract(Euler.phi(t)).equals(mA)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
