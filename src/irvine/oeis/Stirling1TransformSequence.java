package irvine.oeis;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Stirling;
import irvine.math.z.Z;

/**
 * A sequence comprising the Stirling numbers of the first kind transform of
 * another sequence.
 * @author Sean A. Irvine
 */
public class Stirling1TransformSequence implements Sequence {

  /**
   * Apply the Stirling numbers of the first kind transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @param n term limit
   * @return the next term in the transformed sequence
   */
  public static Z stirling1(final List<Z> seq, final int n) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(Stirling.firstKind(n, k).multiply(seq.get(k)));
    }
    return sum;
  }

  /**
   * Apply the Stirling numbers of the first kind transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @return the next term in the transformed sequence
   */
  public static Z stirling1(final List<Z> seq) {
    return stirling1(seq, seq.size() - 1);
  }

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();

  /**
   * Creates a new Stirling transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip (or insert)
   */
  public Stirling1TransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = skip; k < 0; ++k) {
      mTerms.add(Z.ZERO);
    }
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
    return stirling1(mTerms);
  }

}
