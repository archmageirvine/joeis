package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a003.A003030;

/**
 * A054945 Number of strongly connected labeled digraphs on n nodes with an odd number of edges.
 * @author Sean A. Irvine
 */
public class A054945 extends A003030 {

  private final Sequence mF = new A000142();

  @Override
  public Z next() {
    return super.next().subtract(mF.next()).divide2();
  }
}
