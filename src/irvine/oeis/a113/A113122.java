package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A113122 a(n) = Sum_{i=1..n} F(i)^F(n-i+1).
 * @author Georg Fischer
 */
public class A113122 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mSeq;

  /** Construct the sequence. */
  public A113122() {
    this(new A000045());
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence
   */
  public A113122(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 1; i <= mN; ++i) {
      sum = sum.add(mSeq.a(i).pow(mSeq.a(mN + 1 - i)));
    }
    return sum;
  }
}
