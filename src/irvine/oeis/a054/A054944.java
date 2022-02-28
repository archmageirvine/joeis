package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a003.A003030;

/**
 * A054944 Number of strongly connected labeled digraphs on n nodes with an even number of edges.
 * @author Sean A. Irvine
 */
public class A054944 extends A003030 {

  private final Sequence mF = new A000142();

  @Override
  public Z next() {
    return super.next().add(mF.next()).divide2();
  }
}
