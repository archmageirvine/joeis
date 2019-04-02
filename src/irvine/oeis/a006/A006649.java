package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001434;
import irvine.oeis.a048.A048179;

/**
 * A006649 Number of graphs with n nodes, n edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006649 extends A001434 {

  private int mN = 2;
  private Sequence mA = new A048179();
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(++mN < 5 ? Z.ZERO : mA.next());
  }
}
