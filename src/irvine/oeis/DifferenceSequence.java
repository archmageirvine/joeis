package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import irvine.math.z.Z;

/**
 * Return the nth difference sequence of a sequence.
 * @author Sean A. Irvine
 */
public class DifferenceSequence extends AbstractSequence {

  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Create the first difference sequence of a sequence.
   * @param offset first index of the target sequence
   * @param seq underlying sequence
   */
  public DifferenceSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param seq underlying sequence
   */
  public DifferenceSequence(final Sequence seq) {
    this(0, seq);
  }

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = mSeq.next();
    }
    final Z t = mPrev;
    mPrev = mSeq.next();
    return mPrev.subtract(t);
  }

  /**
   * Apply the transform to the sequence supplied on standard input.
   * @param args sequence number of <code>-</code> for standard input
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException, UnimplementedException {
    if ("-".equals(args[0])) {
      try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
        final DifferenceSequence seq = new DifferenceSequence(1, new ReaderSequence(r));
        Z a;
        while ((a = seq.next()) != null) {
          System.out.println(a);
        }
      }
    } else {
      final DifferenceSequence seq = new DifferenceSequence(1, SequenceFactory.sequence(args[0]));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
