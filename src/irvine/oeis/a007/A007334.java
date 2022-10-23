package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A007334 Number of spanning trees in the graph K_{n}/e, which results from contracting an edge e in the complete graph K_{n} on n vertices (for n&gt;=2).
 * @author Sean A. Irvine
 */
public class A007334 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(mN - 3).multiply2();
  }
}
