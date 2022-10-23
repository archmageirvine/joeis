package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008544 Triple factorial numbers: Product_{k=0..n-1} (3*k+2).
 * @author Sean A. Irvine
 */
public class A008544 extends Sequence0 {

  private long mN = -4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 3;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
