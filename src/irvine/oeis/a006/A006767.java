package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a038.A038119;
import irvine.oeis.a068.A068870;

/**
 * A006767 Number of 4-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006767 extends AbstractSequence {

  private final A068870 mSeq1 = new A068870();

  /** Construct the sequence. */
  public A006767() {
    super(1);
  }

  {
    mSeq1.next();
  }

  private final A038119 mA = new A038119();

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}
