package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004994 a(n) = (6^n/n!)*Product_{k=0..n-1} (6*k + 5).
 * @author Sean A. Irvine
 */
public class A004994 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(6 * mN - 1).multiply(6).divide(mN);
    }
    return mA;
  }
}

