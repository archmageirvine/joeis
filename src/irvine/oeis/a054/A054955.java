package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a007.A007080;

/**
 * A054955 Number of labeled Eulerian digraphs with n nodes and an even number of edges.
 * @author Sean A. Irvine
 */
public class A054955 extends A007080 {

  private final Sequence mA = new A000142();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
