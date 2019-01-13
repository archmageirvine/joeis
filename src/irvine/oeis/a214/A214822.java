package irvine.oeis.a214;

import irvine.math.z.Z;

/**
 * A214822.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A214822 extends A214823 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(hypermapCount(2, ++mN, 1, mN + 1, false)[1]);
  }
}
