package irvine.oeis.a141;
// Generated by gen_seq4.pl anopan 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000041;

/**
 * A141667 Number of partitions of n times number of divisors of n.
 * @author Georg Fischer
 */
public class A141667 extends AbstractSequence {

  private final A000041 mSeq1 = new A000041();
  private final A000005 mSeq2 = new A000005();

  /** Construct the sequence. */
  public A141667() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
