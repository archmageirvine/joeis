package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004995 6^n/n!*product[ k=0..n-1 ](6*k - 5).
 * @author Sean A. Irvine
 */
public class A004995 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(6 * mN - 11).multiply(6).divide(mN);
    }
    return mA;
  }
}

