package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence supporting direct access of terms.
 * @author Georg Fischer
 */
public interface DirectPredicate extends Sequence {

  /**
   * Return the specified term of the sequence.
   * Implementations of this method should take the offset of the sequence into account.
   * @param n term index
   * @return term
   * @throws UnsupportedOperationException if the term cannot be computed or represented.
   */
  boolean is(final Z n);

  /**
   * Return the specified term of the sequence.
   * Implementations of this method should take the offset of the sequence into account.
   * @param n term index
   * @return term
   * @throws UnsupportedOperationException if the term cannot be computed or represented.
   */
  boolean is(final int n);

}

