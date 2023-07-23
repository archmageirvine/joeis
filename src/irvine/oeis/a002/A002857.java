package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000612;

/**
 * A002857 Number of Post functions of n variables.
 * @author Sean A. Irvine
 */
public class A002857 extends AbstractSequence {

  private final A000612 mSeq1 = new A000612();

  /** Construct the sequence. */
  public A002857() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
