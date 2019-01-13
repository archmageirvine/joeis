package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003048.
 * @author Sean A. Irvine
 */
public class A003048 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).signedAdd(mN == 0 || (mN & 1) == 1, Z.ONE);
    return mA;
  }
}
