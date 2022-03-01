package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;

/**
 * A054958 Number of labeled connected Eulerian digraphs with n nodes and an even number of edges.
 * @author Sean A. Irvine
 */
public class A054958 extends A054957 {

  private final Sequence mA = new A000142();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
