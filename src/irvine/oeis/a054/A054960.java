package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a000.A000171;

/**
 * A054960 Number of unlabeled graphs with n nodes and an odd number of edges.
 * @author Sean A. Irvine
 */
public class A054960 extends A000088 {

  private final Sequence mA = new A000171();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide2();
  }
}
