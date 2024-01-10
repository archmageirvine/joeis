package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a060.A060014;

/**
 * A067835 Average order of an element in the symmetric group S_n rounded down.
 * @author Sean A. Irvine
 */
public class A067835 extends A060014 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    return t.divide(mF);
  }
}
