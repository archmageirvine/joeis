package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.math.Mobius;

/**
 * A sequence comprising the inverse Euler transform of another sequence.
 * @author Sean A. Irvine
 */
public class InverseEulerTransformSequence implements Sequence, Serializable {

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();
  private final Z mInitialTerm;

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public InverseEulerTransformSequence(final Sequence seq, final int skip, final Z initialTerm) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mInitialTerm = initialTerm;
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public InverseEulerTransformSequence(final Sequence seq, final int skip) {
    this(seq, skip, Z.ZERO);
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
    final int n = mTerms.size() - 1;
    final Z[] c = new Z[n + 1];
    for (int k = 1; k <= n; ++k) {
      Z s = mTerms.get(k).multiply(k);
      for (int j = 1; j < k; ++j) {
        s = s.subtract(c[j].multiply(mTerms.get(k - j)));
      }
      c[k] = s;
    }
    Z a = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      a = ZUtils.mobiusAdd(Mobius.mobius(n / d), a, c[d]);
    }
    return a.divide(n);
  }

  /**
   * Apply the inverse Euler transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final InverseEulerTransformSequence seq = new InverseEulerTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
