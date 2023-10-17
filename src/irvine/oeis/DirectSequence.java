package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A sequence supporting direct access of terms.
 * @author Sean A. Irvine
 */
public interface DirectSequence extends Sequence {

  /**
   * Return the specified term of the sequence.
   * Implementations of this method should take the offset of the sequence into account.
   * @param n term index
   * @return term
   * @exception UnsupportedOperationException if the term cannot be computed or represented.
   */
  Z a(final Z n);

  /**
   * Return the specified term of the sequence.
   * Implementations of this method should take the offset of the sequence into account.
   * @param n term index
   * @return term
   * @exception UnsupportedOperationException if the term cannot be computed or represented.
   */
  Z a(final int n);

  /**
   * A helper method to convert an arbitrary sequence into a direct sequence.
   * Note this method is not necessarily efficient and requesting a term could
   * trigger computation of all earlier values.  It is efficient for any sequence
   * which is already a <code>DirectSequence</code>.
   * @param seq underlying sequence
   * @return direct version of the sequence
   */
  static DirectSequence create(final Sequence seq) {
    if (seq instanceof DirectSequence) {
      return (DirectSequence) seq;
    }
    return new DirectSequence() {

      private final MemorySequence mSeq = MemorySequence.cachedSequence(seq);

      @Override
      public Z a(final Z n) {
        return a(n.intValueExact());
      }

      @Override
      public Z a(final int n) {
        return mSeq.a(n - getOffset());
      }

      @Override
      public Z next() {
        return mSeq.next();
      }

      @Override
      public int getOffset() {
        return seq.getOffset();
      }

      @Override
      public Sequence skip(final long n) {
        return mSeq.skip(n);
      }

      @Override
      public Sequence skip() {
        return mSeq.skip();
      }
    };
  }
}

