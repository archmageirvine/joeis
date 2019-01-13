package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016090.
 * @author Sean A. Irvine
 */
public class A016090 implements Sequence {

  private Z mT = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    mF = mF.multiply(5);
    return Z.SIX.modPow(mF, mT);
  }
}
