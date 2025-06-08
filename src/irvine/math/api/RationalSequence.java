package irvine.math.api;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.Sequence;

/**
 * Generate terms of a rational sequence.
 * @author Sean A. Irvine
 */
public interface RationalSequence {

  /**
   * Convert an ordinary integer sequence into an exponential generating function
   * sequence (essentially terms of the underlying sequence divided by n!).
   * @param seq underlying sequence
   * @return rational sequence scaled by factorials
   */
  static RationalSequence toEgf(final Sequence seq) {
    return new RationalSequence() {
      private long mN = seq.getOffset();

      @Override
      public Q nextQ() {
        return new Q(seq.next(), Functions.FACTORIAL.z(mN++));
      }
    };
  }

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

