package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008544 Triple factorial numbers: <code>Product_{k=0..n-1} (3*k+2)</code>.
 * @author Sean A. Irvine
 */
public class A008544 implements Sequence {

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
