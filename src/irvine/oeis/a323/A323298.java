package irvine.oeis.a323;

import irvine.math.z.Z;
import irvine.oeis.a001.A001147;

/**
 * A323298 Number of 3-uniform hypergraphs spanning n labeled vertices where every two edges have exactly one vertex in common.
 * @author Georg Fischer
 */
public class A323298 extends A001147 {

  private int mN = -1;
  private final int[] mInits = {1, 0, 0, 1, 0, 15, 150, 1815};

  {
    for (int i = 1; i <= 5; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    // a(2*n) = 0 for n > 3; a(2*n-1) = A001147(n) for n > 4
    ++mN;
    if (mN < 8) {
      return Z.valueOf(mInits[mN]);
    }
    return ((mN & 1) == 0) ? Z.ZERO : super.next();
  }
}
