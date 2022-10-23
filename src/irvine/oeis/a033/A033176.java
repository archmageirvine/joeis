package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033176 Threes and ones.
 * @author Sean A. Irvine
 */
public class A033176 extends Sequence1 {

  private Z mA = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      mA = mA.multiply(10).add(3);
    }
    mA = mA.multiply(10).add(1);
    return mA;
  }
}
