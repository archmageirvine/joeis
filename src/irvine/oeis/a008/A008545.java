package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008545 Quadruple factorial numbers: Product_{k=0..n-1} (4*k <code>+ 3)</code>.
 * @author Sean A. Irvine
 */
public class A008545 implements Sequence {

  private long mN = -5;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
