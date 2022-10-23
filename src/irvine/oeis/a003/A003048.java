package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003048 a(n+1) = n*a(n) - (-1)^n.
 * @author Sean A. Irvine
 */
public class A003048 extends Sequence1 {

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).signedAdd(mN == 0 || (mN & 1) == 1, Z.ONE);
    return mA;
  }
}
