package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001585 a(n) = 3^n + n^3.
 * @author Sean A. Irvine
 */
public class A001585 extends Sequence0 {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
    }
    return mT.add(Z.valueOf(mN * mN).multiply(mN));
  }
}
