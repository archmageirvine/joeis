package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004996 a(n) = 6^n/n! * Product_{k=0..n-1} (6*k - 1).
 * @author Sean A. Irvine
 */
public class A004996 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(6 * mN - 7).multiply(6).divide(mN);
    }
    return mA;
  }
}

