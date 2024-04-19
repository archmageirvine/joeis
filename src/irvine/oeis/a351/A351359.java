package irvine.oeis.a351;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000031;
import irvine.oeis.a000.A000358;

/**
 * A351359 Number of binary necklaces with n beads and at least two consecutive black beads.
 * @author Georg Fischer
 */
public class A351359 extends AbstractSequence {

  private int mN = 0;
  private final A000031 mSeq1 = new A000031();
  private final A000358 mSeq2 = new A000358();

  /** Construct the sequence. */
  public A351359() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 1) ? Z.ZERO : result;
  }
}
