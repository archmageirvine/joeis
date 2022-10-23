package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008545 Quadruple factorial numbers: Product_{k=0..n-1} (4*k + 3).
 * @author Sean A. Irvine
 */
public class A008545 extends Sequence0 {

  private long mN = -5;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
