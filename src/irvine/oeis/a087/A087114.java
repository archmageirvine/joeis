package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a008.A008324;

/**
 * A087114 Number of regular bipartite simple graphs on n nodes.
 * @author Georg Fischer
 */
public class A087114 extends A008324 {

  private int mN = 0;

  /** Construct the sequence. */
  public A087114() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    //  * a(2*n + 1) = 1, a(2*n) = A008324(n).
    ++mN;
    return ((mN & 1) == 1) ? Z.ONE : super.next();
  }
}
