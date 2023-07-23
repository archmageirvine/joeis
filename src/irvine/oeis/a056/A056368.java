package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A056368 Number of primitive (period n) bracelet structures using exactly four different colored beads.
 * @author Sean A. Irvine
 */
public class A056368 extends AbstractSequence {

  private final A056363 mSeq1 = new A056363();

  /** Construct the sequence. */
  public A056368() {
    super(1);
  }

  private final Sequence mA = new A056362();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}
