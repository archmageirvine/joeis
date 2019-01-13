package irvine.oeis;

import irvine.math.z.Z;

/**
 * Generate terms of an integer sequence.
 * @author Sean A. Irvine
 */
public interface Sequence {
  /**
   * Return the next term of the sequence. If no next term exists,
   * because the sequence is finite, then null is returned. If the
   * next term cannot be produced because the operation is too hard
   * or the term cannot be represented by the <code>Z</code> class,
   * then <code>UnsupportedOperationException</code> is thrown.
   *
   * @return next term of the sequence or null if the sequence is complete
   * @exception UnsupportedOperationException if the next term cannot
   * be computed or represented.
   */
  Z next();
}

