package irvine.oeis.a214;

import irvine.math.z.Z;

/**
 * A214819.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A214819 extends A214823 {

  private int mN = 0;

  @Override
  public Z next() {
    hypermapCount(1, ++mN, 1, mN + 1, false);
    return Z.valueOf(mSumSensed[2]);
  }
}
