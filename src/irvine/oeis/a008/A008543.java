package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008543 Sextuple factorial numbers: Product_{k=0..n-1} (6*k + 5).
 * @author Sean A. Irvine
 */
public class A008543 extends Sequence0 {

  private long mN = -7;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 6;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
