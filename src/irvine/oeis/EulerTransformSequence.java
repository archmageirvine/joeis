package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A sequence comprising the Euler transform of another sequence.
 * @author Sean A. Irvine
 */
public class EulerTransformSequence implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mSeq;
  protected final ArrayList<Z> mTerms = new ArrayList<>();
  private int mN = -1;
  private Z mInitial;

  /**
   * Creates a new Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initial an initial term
   */
  public EulerTransformSequence(final Sequence seq, final int skip, final Z initial) {
    mSeq = seq;
    mInitial = initial;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  /**
   * Creates a new Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public EulerTransformSequence(final Sequence seq, final int skip) {
    this(seq, skip, null);
  }

  /**
   * The next term in an Euler transform.
   * @param seq current sequence terms
   * @param n term number
   * @return next term of Euler transform
   */
  public static Z eulerTransform(final List<Z> seq, final int n) {
    Polynomial<Z> den = RING.one();
    for (int k = 0; k < seq.size(); ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k + 1), seq.get(k), n), n);
    }
    return RING.coeff(RING.one(), den, n);
  }

  // The following version attempts to run faster by only recomputing
  // the entire sequence when the current degree limit (which increases as
  // powers of 2) is exceeded.

  private static final int DEFAULT_DEGREE_LIMIT = 1 << 5;
  private int mDegreeLimit = DEFAULT_DEGREE_LIMIT;
  private Polynomial<Z> mDen = RING.one();
  private Polynomial<Z> mEulerTransform = null;
  private int mNextSeqIndex = 0;

  private Z incrementalEulerTransform(final List<Z> seq, final int n) {
    // n is the term to be returned, seq is underlying sequence and is assumed
    // to have sufficient terms needed to determine
    boolean changed = false;
    if (n >= mDegreeLimit) {
      // Complete recomputation to extract higher terms is needed
      mDegreeLimit *= 2;
      mDen = RING.one();
      for (int k = 0; k < seq.size(); ++k) {
        mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(k + 1), seq.get(k), mDegreeLimit), mDegreeLimit);
      }
      mNextSeqIndex = seq.size();
      changed = true;
    }
    while (mNextSeqIndex < seq.size()) {
      // If the underlying sequence has another term then add it into the mix
      mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(mNextSeqIndex + 1), seq.get(mNextSeqIndex), mDegreeLimit), mDegreeLimit);
      ++mNextSeqIndex;
      changed = true;
    }
    if (changed) {
      mEulerTransform = RING.series(RING.one(), mDen, mDegreeLimit); // Finally extract the transformed value
    }
    return mEulerTransform.coeff(n);
  }

  @Override
  public Z next() {
    if (mInitial != null) {
      final Z t = mInitial;
      mInitial = null;
      return t;
    }
    if (++mN == 0) {
      return Z.ONE;
    }

    if (mSeq instanceof PeriodicSequence || mSeq instanceof FiniteSequence) {
      // Special speed up for "fast" underlying sequences.  This helps avoid excessive
      // recomputation of the transform
      while (mTerms.size() < mDegreeLimit) {
        final Z next = mSeq.next();
        if (next == null) {
          break;
        }
        mTerms.add(next);
      }
    } else {
      // In general case, add one more term from underlying sequence
      final Z next = mSeq.next();
      if (next != null) {
        mTerms.add(next);
      }
    }
    return incrementalEulerTransform(mTerms, mN);
  }

  /**
   * Apply the Euler transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final EulerTransformSequence seq = new EulerTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
