package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077204 a(1) = 1 . Then smallest n-digit square (MSD) starting with the LSD of the previous term and not a multiple of 100.
 * @author Sean A. Irvine
 */
public class A077204 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mT = mT.multiply(10);
    mA = mT.multiply(mA.mod(10)).sqrt().add(1).square();
    return mA;
  }
}

