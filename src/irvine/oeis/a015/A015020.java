package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015020.
 * @author Sean A. Irvine
 */
public class A015020 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-7);
    mA = mA.multiply(mT.subtract(1)).divide(-8);
    return mA;
  }
}
