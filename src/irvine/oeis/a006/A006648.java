package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001433;
import irvine.oeis.a001.A001434;

/**
 * A006648 Number of graphs with n nodes, n-1 edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006648 extends A001433 {

  private Sequence mA = new A001434();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
