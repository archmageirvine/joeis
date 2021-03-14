package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045534 Squarefree self-avoiding walks in 2 dimensions.
 * @author Sean A. Irvine
 */
public class A045534 extends A000040 {

  private static long[] SMALL = {1, 4, 8, 16, 16, 16, 16, 16};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    return Z.ZERO;
  }
}
