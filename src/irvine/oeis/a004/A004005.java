package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004005 Coefficients of elliptic function sn.
 * @author Sean A. Irvine
 */
public class A004005 extends MemorySequence {

  private long mN = 1;
  private Z mT = Z.valueOf(27);
  private Z mF = Z.valueOf(125);

  @Override
  protected Z computeNext() {
    mT = mT.multiply(9);
    mF = mF.multiply(25);
    ++mN;
    return mF.subtract(mT.multiply(8 * mN - 4)).add(Z.valueOf(mN).multiply(32).subtract(32).multiply(mN).subtract(17)).shiftRight(8);
  }
}
