package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006005;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A073060 Multiplication table for 1 and odd primes, read by antidiagonals.
 * @author Georg Fischer
 */
public class A073060 extends UpperLeftTriangle {

  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A073060() {
    super(0, 0, -1);
    mSeq = MemorySequence.cachedSequence(new A006005());
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying Sequence
   */
  public A073060(final Sequence seq) {
    super(0, 0, -1);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying Sequence
   * @param count number of terms of <code>mSeq</code> to be skipped
   */
  public A073060(final Sequence seq, final int skip) {
    super(skip, skip, -1);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return mSeq.a(n).multiply(mSeq.a(k));
  }
}
