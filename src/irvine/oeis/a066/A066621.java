package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A066621 Concatenation of triangular numbers in increasing order up to the n-th and then in decreasing order.
 * @author Georg Fischer
 */
public class A066621 extends AbstractSequence {

  protected int mN;
  protected MemorySequence mSeq;
  protected int mBase;
  protected final StringBuilder mS = new StringBuilder();

  /** Construct the sequence. */
  public A066621() {
    this(1, new A000217(), 10);
    mSeq.next();
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param base for output
   */
  public A066621(final int offset, final Sequence seq, final int base) {
    super(offset);
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
    mBase = base;
  }

  @Override
  public Z next() {
    ++mN;
    final String term = mSeq.a(mN).toString(mBase);
    final StringBuilder result = new StringBuilder(mS.toString());
    mS.append(term);
    result.append(term);
    for (int i = mN - 1; i >= 1; --i) {
      result.append(mSeq.a(i));
    }
    return new Z(result.toString());
  }
}
