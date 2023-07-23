package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001433;
import irvine.oeis.a001.A001434;

/**
 * A006648 Number of graphs with n nodes, n-1 edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006648 extends AbstractSequence {

  private final A001433 mSeq1 = new A001433();

  /** Construct the sequence. */
  public A006648() {
    super(2);
  }

  private Sequence mA = new A001434();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}
