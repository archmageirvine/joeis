package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020882;

/**
 * A024362.
 * @author Sean A. Irvine
 */
public class A024362 extends A020882 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    long c = 0;
    mN = mN.add(1);
    while (mN.equals(mA)) {
      ++c;
      mA = super.next();
    }
    return Z.valueOf(c);
  }
}
