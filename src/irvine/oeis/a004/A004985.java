package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004985 a(n) = (2^n/n!)*Product_{k=0..n-1} (4*k + 5).
 * @author Sean A. Irvine
 */
public class A004985 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4 * mN + 1).multiply2().divide(mN);
    }
    return mA;
  }
}

