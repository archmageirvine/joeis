package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a008.A008324;

/**
 * A087114 Number of regular bipartite simple graphs on n nodes.
 * @author Georg Fischer
 */
public class A087114 extends A008324 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.ONE : super.next();
  }
}
