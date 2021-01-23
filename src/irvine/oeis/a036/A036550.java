package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036550 a(n) = T(0,n) + T(1,n-1) + ... + T(n,0), array T given by A048471.
 * @author Sean A. Irvine
 */
public class A036550 implements Sequence {

  private int mN = 1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return mT.subtract(Z.ONE.shiftLeft(++mN)).add(2L * mN - 1).divide2();
  }
}
