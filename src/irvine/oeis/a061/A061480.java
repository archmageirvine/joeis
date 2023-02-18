package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061480 n-th digit in decimal expansion of 1/n.
 * @author Sean A. Irvine
 */
public class A061480 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    return mT.divide(++mN).mod(Z.TEN);
  }
}

