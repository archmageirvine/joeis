package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027473 Second column of <code>A027466</code>.
 * @author Sean A. Irvine
 */
public class A027473 implements Sequence {

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
