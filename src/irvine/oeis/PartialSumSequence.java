package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import irvine.math.z.Z;

/**
 * Partial sums of another sequence.
 * @author Sean A. Irvine
 */
public class PartialSumSequence implements Sequence {

  private final Sequence mSeq;
  protected Z mSum = Z.ZERO;

  /**
   * Partial sums of another sequence.
   * @param seq sequence to compute partial sums of
   */
  public PartialSumSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    mSum = mSum.add(mSeq.next());
    return mSum;
  }

  /**
   * Apply the partial sum function to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new PartialSumSequence(new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
