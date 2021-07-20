package irvine.oeis;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A transform similar to the Mobius transform but using the odd part of divisors.
 * @author Sean A. Irvine
 */
public class Phi2TransformSequence implements Sequence {

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();
  private final Z mInitialTerm;

  /**
   * Creates a new transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public Phi2TransformSequence(final Sequence seq, final int skip, final Z initialTerm) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mInitialTerm = initialTerm;
  }

  /**
   * Creates a new transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public Phi2TransformSequence(final Sequence seq, final int skip) {
    this(seq, skip, Z.ZERO);
  }

  @Override
  public Z next() {
    if (mTerms.isEmpty()) {
      mTerms.add(Z.ZERO);
      return mInitialTerm;
    }
    final Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    mTerms.add(t);
    if (((mTerms.size() - 1) & (mTerms.size() - 2)) == 0) {
      return t.subtract(1);
    }
    final int n = mTerms.size() - 1;
    Z a = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      if ((d & 1) == 1) {
        a = ZUtils.mobiusAdd(Mobius.mobius(d), a, mTerms.get(n / d));
      }
    }
    return a;
  }
}
