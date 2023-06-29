package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Prepend some terms in front of another sequence.
 * another sequence.
 * @author Sean A. Irvine
 */
public class PrependSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final Z[] mTerms;
  private final Sequence mSeq;
  private int mN = 0;

  /**
   * Create a new sequence with additional terms at the front.
   * @param seq main sequence
   * @param terms additional terms
   */
  public PrependSequence(final Sequence seq, final Z... terms) {
    super(DEFOFF);
    mSeq = seq;
    mTerms = terms;
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param offset first index of target sequence
   * @param seq main sequence
   * @param terms additional terms
   */
  public PrependSequence(final int offset, final Sequence seq, final Z... terms) {
    super(offset);
    mSeq = seq;
    mTerms = terms;
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param seq main sequence
   * @param terms additional terms
   */
  public PrependSequence(final Sequence seq, final long... terms) {
    this(DEFOFF, seq, ZUtils.toZ(terms));
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param offset first index of target sequence
   * @param seq main sequence
   * @param terms additional terms
   */
  public PrependSequence(final int offset, final Sequence seq, final long... terms) {
    this(offset, seq, ZUtils.toZ(terms));
  }

  @Override
  public Z next() {
    if (mN < mTerms.length) {
      return mTerms[mN++];
    }
    return mSeq.next();
  }

  /**
   * Prepend terms to a sequence.
   * @param args terms to prepend
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final Z[] terms = new Z[args.length];
    for (int k = 0; k < terms.length; ++k) {
      terms[k] = new Z(args[k]);
    }
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final PrependSequence seq = new PrependSequence(new ReaderSequence(r), terms);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
  
  /**
   * Gets the main sequence.
   * @return instance of the underlying sequence
   */
  public Sequence getSequence() {
    return mSeq;
  }
  
  /**
   * Gets the terms to be prepended.
   * @return array of numbers
   */
  protected Z[] getTerms() {
    return mTerms;
  }
}
