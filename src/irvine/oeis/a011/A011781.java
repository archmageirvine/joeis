package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011781 Sextuple factorial numbers: a(n) = Product_{k=0..n-1} (6*k+3).
 * @author Sean A. Irvine
 */
public class A011781 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -9;

  @Override
  public Z next() {
    mN += 6;
    if (mN >= 0) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
