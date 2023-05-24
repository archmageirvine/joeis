package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063905 Each prime p appears p times.
 * @author Sean A. Irvine
 */
public class A063905 extends A000040 {

  private Z mP = null;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mP = super.next();
      mM = mP.longValueExact();
    }
    return mP;
  }
}
