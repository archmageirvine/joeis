package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008542 Sextuple factorial numbers: <code>Product_{k=0..n-1} (6*k+1)</code>.
 * @author Sean A. Irvine
 */
public class A008542 implements Sequence {

  private long mN = -11;
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
