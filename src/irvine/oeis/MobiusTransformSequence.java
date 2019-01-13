package irvine.oeis;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.nt.mobius.Mobius;

/**
 * A sequence comprising the Mobius transform of another sequence.
 * @author Sean A. Irvine
 */
public class MobiusTransformSequence implements Sequence {

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();
  private final Z mInitialTerm;

  /**
   * Creates a new Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public MobiusTransformSequence(final Sequence seq, final int skip, final Z initialTerm) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mInitialTerm = initialTerm;
  }

  /**
   * Creates a new Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public MobiusTransformSequence(final Sequence seq, final int skip) {
    this(seq, skip, Z.ZERO);
  }

  /**
   * Get the next term from the Mobius transform of the given sequence.
   * @param seq sequence of terms
   * @return transform value
   */
  public static Z mobiusTransform(final List<Z> seq) {
    final int n = seq.size() - 1;
    Z a = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      a = ZUtils.mobiusAdd(Mobius.mobius(n / d), a, seq.get(d));
    }
    return a;
  }

  @Override
  public Z next() {
    if (mTerms.isEmpty()) {
      mTerms.add(Z.ZERO);
      return mInitialTerm;
    }
    // Recomputes for each term, not the most efficient way perhaps,
    // but saves a lot of housekeeping and memory
    final Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    mTerms.add(t);
    return mobiusTransform(mTerms);
  }

}
