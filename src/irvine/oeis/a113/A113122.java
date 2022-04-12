package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A113122 Sum of the first n Fibonacci numbers, in ascending order, as bases, with the same, in descending order, as exponents.
 * @author Georg Fischer
 */
public class A113122 implements Sequence {

  private int mN = 0;
  private MemorySequence mSeq;

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

  ;

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
