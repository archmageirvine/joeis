package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066558 a(n) = A066557(n)/n.
 * @author Sean A. Irvine
 */
public class A066558 extends Sequence1 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    return mT.subtract(1).divide(++mN);
  }
}
