package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a000.A000171;

/**
 * A007869 Number of complementary pairs of graphs on n nodes. Also number of unlabeled graphs with n nodes and an even number of edges.
 * @author Sean A. Irvine
 */
public class A007869 extends A000088 {

  private Sequence mA = new A000171();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
