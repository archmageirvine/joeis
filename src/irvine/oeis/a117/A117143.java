package irvine.oeis.a117;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a194.A194621;

/**
 * A117143 Number of partitions of n in which any two parts differ by at most 3.
 * @author Georg Fischer
 */
public class A117143 extends AbstractSequence {

  private final A194621 mSeq = new A194621();

  /** Construct the sequence. */
  public A117143() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 3);
  }
}

