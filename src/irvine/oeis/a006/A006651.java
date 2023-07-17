package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001430;
import irvine.oeis.a048.A048180;

/**
 * A006651 Number of graphs with n nodes, n+2 edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006651 extends A001430 {

  /** Construct the sequence. */
  public A006651() {
    super(4);
  }

  private Sequence mA = new A048180();

  @Override
  public Z next() {
    return mA.next().subtract(numberLinearGraphs(++mN + 2, mN + 5));
  }
}
