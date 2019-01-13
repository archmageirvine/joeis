package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005014.
 * @author Sean A. Irvine
 */
public class A005014 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private boolean mS = false;

  @Override
  public Z next() {
    mT = mT.multiply2();
    mS = !mS;
    mA = mA.multiply(mT.subtract(2)).signedAdd(mS, Z.ONE);
    return mA;
  }

}

