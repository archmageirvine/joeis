package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060613 Number of n X n {-1,0,1} matrices with no zero rows.
 * @author Sean A. Irvine
 */
public class A060613 extends Sequence1 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return mT.subtract(1).pow(++mN);
  }
}
