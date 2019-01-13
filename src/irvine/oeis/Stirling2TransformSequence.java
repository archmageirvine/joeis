package irvine.oeis;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Stirling;
import irvine.math.z.Z;

/**
 * A sequence comprising the Stirling numbers of the second kind transform of
 * another sequence.
 * @author Sean A. Irvine
 */
public class Stirling2TransformSequence implements Sequence {

  /**
   * Apply the Stirling numbers of the second kind transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @param n term limit
   * @return the next term in the transformed sequence
   */
  public static Z stirling2(final List<Z> seq, final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(Stirling.secondKind(n, k).multiply(seq.get(k)));
    }
    return sum;
  }

  /**
   * Apply the Stirling numbers of the second kind transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @return the next term in the transformed sequence
   */
  public static Z stirling2(final List<Z> seq) {
    return stirling2(seq, seq.size() - 1);
  }

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();

  /**
   * Creates a new Stirling transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public Stirling2TransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  @Override
  public Z next() {
    final Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    mTerms.add(t);
    return stirling2(mTerms);
  }

}
