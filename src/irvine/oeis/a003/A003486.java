package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003486 a(n) = (n^2 + 1)*3^n.
 * @author Sean A. Irvine
 */
public class A003486 extends Sequence0 {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
    }
    return mT.multiply(mN * mN + 1);
  }
}

