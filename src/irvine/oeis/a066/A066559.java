package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066559 a(n) = ceiling(10^(n-1)/n).
 * @author Sean A. Irvine
 */
public class A066559 extends Sequence1 {

  private int mN = 0;
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    return mT.add(mN).divide(++mN);
  }
}
