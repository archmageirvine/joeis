package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;

/**
 * A054959 Number of labeled connected Eulerian digraphs with n nodes and an odd number of edges.
 * @author Sean A. Irvine
 */
public class A054959 extends A054957 {

  private final Sequence mA = new A000142();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide2();
  }
}
