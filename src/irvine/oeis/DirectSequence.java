package irvine.oeis;

import irvine.math.z.Z;

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
    return seq instanceof DirectSequence ? (DirectSequence) seq : new CachedSequence(seq.getOffset(), n -> seq.next());
  }
}

