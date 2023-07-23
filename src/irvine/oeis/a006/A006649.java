package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001434;
import irvine.oeis.a048.A048179;

/**
 * A006649 Number of graphs with n nodes, n edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006649 extends AbstractSequence {

  private final A001434 mSeq1 = new A001434();

  /** Construct the sequence. */
  public A006649() {
    super(3);
  }

  private int mN = 2;
  private Sequence mA = new A048179();

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(++mN < 5 ? Z.ZERO : mA.next());
  }
}
