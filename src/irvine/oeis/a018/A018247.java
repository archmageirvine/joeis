package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018247.
 * @author Sean A. Irvine
 */
public class A018247 implements Sequence {

  private Z mA = Z.FIVE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z t = mT;
    mT = mT.multiply(10);
    mA = mA.modPow(Z.TWO, mT);
    return mA.divide(t);
  }
}
