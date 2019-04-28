package irvine.math.api;

import irvine.math.q.Q;

/**
 * Generate terms of a rational sequence.
 * @author Sean A. Irvine
 */
public interface RationalSequence {

  /**
   * Return the next term of the sequence. If no next term exists,
   * because the sequence is finite, then null is returned. If the
   * next term cannot be produced because the operation is too hard
   * or the term cannot be represented by the <code>Q</code> class,
   * then <code>UnsupportedOperationException</code> is thrown.
   * @return next term of the sequence
   * @exception UnsupportedOperationException if the next term cannot
   * be computed or represented.
   */
  Q nextQ();
}

