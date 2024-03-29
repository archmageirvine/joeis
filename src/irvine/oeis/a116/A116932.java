package irvine.oeis.a116;
// Generated by gen_seq4.pl tricol

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a218.A218698;

/**
 * A116932 Number of partitions of n in which each part, with the possible exception of the largest, occurs at least three times.
 * @author Georg Fischer
 */
public class A116932 extends AbstractSequence {

  private final A218698 mSeq = new A218698();

  /** Construct the sequence. */
  public A116932() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return mSeq.compute(++mN, 3);
  }
}

