package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004998 6^n/n!*product(k=0..n-1, 6*k <code>+ 11 )</code>.
 * @author Sean A. Irvine
 */
public class A004998 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(6 * mN + 5).multiply(6).divide(mN);
    }
    return mA;
  }
}

