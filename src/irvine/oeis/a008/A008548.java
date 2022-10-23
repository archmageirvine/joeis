package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008548 Quintuple factorial numbers: Product_{k=0..n-1} (5*k+1).
 * @author Sean A. Irvine
 */
public class A008548 extends Sequence0 {

  private long mN = -9;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 5;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
