package irvine.oeis;

import irvine.math.z.Z;

/**
 * Generate terms of an integer sequence.
 * @author Sean A. Irvine
 */
public interface Sequence {
  /**
   * Return the next term of the sequence. If no next term exists,
   * because the sequence is finite, then <code>null</code> is returned. If the
   * next term cannot be produced because the operation is too hard
   * or the term cannot be represented by the <code>Z</code> class,
   * then <code>UnsupportedOperationException</code> is thrown.
   * @return next term of the sequence or null if the sequence is complete
   * @exception UnsupportedOperationException if the next term cannot
   * be computed or represented.
   */
  Z next();

  /**
   * Return the OEIS offset associated with this sequence.
   * @return the offset
   */
  int getOffset();

  /**
   * Convenience method to skip some number of terms of a sequence.
   * @param terms number of terms to skip
   * @return this sequence with terms skipped
   * @throws IllegalArgumentException if the number of terms to skip is negative.
   */
  Sequence skip(final long n);

  /**
   * Convenience method to skip a single term of the sequence.
   * @return this sequence with one term skipped
   */
  Sequence skip();
}

