package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
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
    this(0, new A006005(), 0);
  }

  /**
   * Generic constructor with parameter
   * @param seq underlying Sequence
   */
  public A073060(final Sequence seq) {
    this(0, seq, 0);
  }

  /**
   * Generic constructor with parameters.
   * @param seq underlying Sequence
   * @param skip number of terms of <code>seq</code> to be skipped
   */
  public A073060(final Sequence seq, final int skip) {
    this(0, seq, skip);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param seq underlying Sequence
   * @param skip number of terms of <code>seq</code> to be skipped
   */
  public A073060(final int offset, final Sequence seq, final int skip) {
    super(offset, skip, skip, -1);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return mSeq.a(n).multiply(mSeq.a(k));
  }
}
