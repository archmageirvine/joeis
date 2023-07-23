package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a006.A006608;

/**
 * A178925 Number of n-node simple graphs that are determined by spectrum.
 * @author Sean A. Irvine
 */
public class A178925 extends AbstractSequence {

  private final A000088 mSeq1 = new A000088();

  /** Construct the sequence. */
  public A178925() {
    super(1);
  }

  private final Sequence mA = new A006608();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}

