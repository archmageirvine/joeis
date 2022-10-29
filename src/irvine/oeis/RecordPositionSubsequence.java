package irvine.oeis;

import java.util.function.Predicate;

import irvine.math.z.Z;

/**
 * A sequence consisting of the indices of consecutive records in another sequence.
 * In contrast to {@link RecordSequence}, this class does not compare the absolute value.
 * @author Georg Fischer
 */
public class RecordPositionSubsequence extends FilterPositionSequence {

  /**
   * Creates a record position sequence of another sequence.
   * @param offset index of first term of the underlying sequence.
   * @param seq underlying sequence
   */
  public RecordPositionSubsequence(final int offset, final Sequence seq) {
    super(offset, seq, new Predicate<>() {

      private Z mMax = null;

      @Override
      public boolean test(final Z z) {
        if (mMax == null || z.compareTo(mMax) > 0) {
          mMax = z;
          return true;
        }
        return false;
      }
    });
  }
}
