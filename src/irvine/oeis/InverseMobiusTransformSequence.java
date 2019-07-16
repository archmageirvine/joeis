package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A sequence comprising the inverse Mobius transform of another sequence.
 * @author Sean A. Irvine
 */
public class InverseMobiusTransformSequence implements Sequence {

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();
  private final Z mInitialTerm;

  /**
   * Creates a new inverse Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public InverseMobiusTransformSequence(final Sequence seq, final int skip, final Z initialTerm) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mInitialTerm = initialTerm;
  }

  /**
   * Creates a new inverse Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public InverseMobiusTransformSequence(final Sequence seq, final int skip) {
    this(seq, skip, Z.ZERO);
  }

  @Override
  public Z next() {
    if (mTerms.isEmpty()) {
      mTerms.add(Z.ZERO);
      return mInitialTerm;
    }
    Z s = Z.ZERO;
    final int n = mTerms.size();
    final Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    mTerms.add(t);
    for (final Z d : Cheetah.factor(n).divisors()) {
      s = s.add(mTerms.get(d.intValue()));
    }
    return s;
  }

  /**
   * Apply the inverse Mobius transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new InverseMobiusTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
