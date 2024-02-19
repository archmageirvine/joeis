package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001433;
import irvine.oeis.a001.A001434;

/**
 * A006648 Number of graphs with n nodes, n-1 edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006648 extends Sequence2 {

  private final Sequence mSeq1 = new A001433().skip();
  private final Sequence mA = new A001434().skip();

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}
