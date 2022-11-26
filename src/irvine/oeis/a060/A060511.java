package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A060511 Hexagonal excess: smallest amount by which n exceeds a hexagonal number (2k^2-k, A000384).
 * @author Sean A. Irvine
 */
public class A060511 extends A000384 {

  private Z mA = Z.ZERO;
  private Z mHexagonal = super.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.compareTo(mHexagonal) >= 0) {
      mA = mN;
      mHexagonal = super.next();
    }
    return mN.subtract(mA);
  }
}
