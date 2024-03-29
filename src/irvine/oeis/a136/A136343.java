package irvine.oeis.a136;
// Generated by gen_seq4.pl A319394/tripnk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a319.A319394;

/**
 * A136343 Number of partitions of n such that each summand is greater than or equal to the sum of the next two summands.
 * @author Georg Fischer
 */
public class A136343 extends AbstractSequence {

  private int mN;
  private final A319394 mSeq = new A319394();

  /** Construct the sequence. */
  public A136343() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(2 * mN, mN);
  }
}

