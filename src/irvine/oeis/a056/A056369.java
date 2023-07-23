package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A056369 Number of primitive (period n) bracelet structures using exactly five different colored beads.
 * @author Sean A. Irvine
 */
public class A056369 extends AbstractSequence {

  private final A056364 mSeq1 = new A056364();

  /** Construct the sequence. */
  public A056369() {
    super(1);
  }

  private final Sequence mA = new A056363();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}
