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
   * @throws UnsupportedOperationException if the term cannot be computed or represented.
   */
  Z a(final Z n);

  /**
   * Return the specified term of the sequence.
   * Implementations of this method should take the offset of the sequence into account.
   * @param n term index
   * @return term
   * @throws UnsupportedOperationException if the term cannot be computed or represented.
   */
  Z a(final int n);

  /**
   * A helper method to convert an arbitrary sequence into a direct sequence.
   * Note this method is not necessarily efficient and requesting a term could
   * trigger computation of all earlier values. This method can be used in
   * some circumstances where <code>create</code> does not work due to inheritance
   * of an existing <code>DirectSequence</code>.
   * @param offset offset for this sequence
   * @param seq underlying sequence
   * @return direct version of the sequence
   */
  static DirectSequence forceCreate(final int offset, final Sequence seq) {
    return new CachedSequence(seq.getOffset(), n -> seq.next()) {
      private Z mT = Z.valueOf(offset);

      @Override
      protected Z compute(final Z n) {
        while (n.compareTo(mT) > 0) {
          a(mT);
        }
        mT = mT.add(1);
        return seq.next();
      }
    };
  }

  /**
   * A helper method to convert an arbitrary sequence into a direct sequence.
   * Note this method is not necessarily efficient and requesting a term could
   * trigger computation of all earlier values.  It is efficient for any sequence
   * which is already a <code>DirectSequence</code>.
   * @param offset offset for this sequence
   * @param seq underlying sequence
   * @return direct version of the sequence
   */
  static DirectSequence create(final int offset, final Sequence seq) {
    return seq instanceof DirectSequence
      ? (DirectSequence) seq
      : forceCreate(offset, seq);
  }

  /**
   * A helper method to convert an arbitrary sequence into a direct sequence.
   * Note this method is not necessarily efficient and requesting a term could
   * trigger computation of all earlier values.  It is efficient for any sequence
   * which is already a <code>DirectSequence</code>.
   * @param seq underlying sequence
   * @return direct version of the sequence
   */
  static DirectSequence create(final Sequence seq) {
    return create(seq.getOffset(), seq);
  }
}

