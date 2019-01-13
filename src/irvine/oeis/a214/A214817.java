package irvine.oeis.a214;

import irvine.math.z.Z;

/**
 * A214817.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A214817 extends A214823 {

  private int mN = 0;

  @Override
  public Z next() {
    hypermapCount(0, ++mN, 1, mN + 1, false);
    return Z.valueOf(mSum[2]);
  }
}
