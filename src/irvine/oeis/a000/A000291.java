package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A000291 Number of bipartite partitions of n white objects and 2 black ones.
 * @author Sean A. Irvine
 */
public class A000291 extends A054225 {

  private static final Z POW3 = Z.NINE;
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = POW3.shiftLeft(++mN);
    return get(r, r);
  }
}
