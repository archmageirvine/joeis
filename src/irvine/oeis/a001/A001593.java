package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001593 a(n) = 5^n + n^5.
 * @author Sean A. Irvine
 */
public class A001593 extends Sequence0 {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(5);
    }
    return mT.add(Z.valueOf(mN * mN).square().multiply(mN));
  }
}
