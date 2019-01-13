package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005145.
 * @author Sean A. Irvine
 */
public class A005145 extends A000040 {

  private long mN = 0;
  private long mD = 0;
  private Z mP = null;

  @Override
  public Z next() {
    if (++mD >= mN) {
      mP = super.next();
      ++mN;
      mD = 0;
    }
    return mP;
  }
}
