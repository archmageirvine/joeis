package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001653;

/**
 * A008844 Squares of sequence A001653: y^2 such that x^2 - 2*y^2 = -1 for some x.
 * @author Sean A. Irvine
 */
public class A008844 extends AbstractSequence {

  private final A001653 mSeq1 = new A001653();

  /** Construct the sequence. */
  public A008844() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
