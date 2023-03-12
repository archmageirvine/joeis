package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061861 extends Sequence1 {

  private long mN = 0;
  private long mT = 10;

  @Override
  public Z next() {
    if (mT / ++mN < 10) {
      mT *= 10;
    }
    return Z.valueOf(mT / mN);
  }
}
