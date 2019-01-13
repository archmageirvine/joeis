package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015022.
 * @author Sean A. Irvine
 */
public class A015022 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-8);
    mA = mA.multiply(mT.subtract(1)).divide(-9);
    return mA;
  }
}
