package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066557 Largest n-digit multiple of n.
 * @author Sean A. Irvine
 */
public class A066557 extends Sequence1 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    return mT.subtract(1).divide(++mN).multiply(mN);
  }
}
