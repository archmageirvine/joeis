package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027473 Second column of A027466.
 * @author Sean A. Irvine
 */
public class A027473 extends Sequence1 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mT = mT.multiply(7);
    }
    return mT.multiply(mN);
  }
}
