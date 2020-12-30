package irvine.oeis;

import java.util.ArrayList;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A sequence comprising the inverse Euler transform of another sequence.
 * @author Georg Fischer
 */
public class InverseEulerTransform implements Sequence {

  private Sequence mSeq;
  private final ArrayList<Z> mAs = new ArrayList<>(); // underlying sequence
  private final ArrayList<Z> mBs = new ArrayList<>(); // resulting sequence
  private final ArrayList<Z> mCs = new ArrayList<>(); // auxiliary sequence
  protected Z[] mPreTerms; // initial terms to be prepended
  protected int mIn; // index for initial terms
  protected int mN; // current index >= 1, may be used in advance() of a subclass

  /**
   * Empty constructor;
   * initializes the internal properties
   */
  public InverseEulerTransform() {
    mIn = 0;
    mN = 0;
    mAs.add(Z.ZERO); // [0] is not returned
    mBs.add(Z.ZERO); // [0] not used
    mCs.add(Z.ZERO); // [0] starts the sum
    mPreTerms = new Z[] { }; // no preprended terms
  }

  /**
   * Create a new sequence with no additional terms at the front.
   * @param seq main sequence
   */
  public InverseEulerTransform(final Sequence seq) {
    this();
    mSeq = seq;
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip in seq
   * @param preTerms additional terms to be prepended to the result - usually there is a leading one.
   */
  public InverseEulerTransform(final Sequence seq, final int skip, final Z... preTerms) {
    this(seq);
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mPreTerms = preTerms;
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip in seq
   * @param preTerms additional terms to be prepended to the result - usually there is a leading one.
   */
  public InverseEulerTransform(final Sequence seq, final int skip, final long... preTerms) {
    this(seq, skip, ZUtils.toZ(preTerms));
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance. A one is prepended.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip in seq
   */
  public InverseEulerTransform(final Sequence seq, final int skip) {
    this(seq, skip, Z.ONE);
  }

  /**
   * Return a term.
   * @return the next term of the transformed sequence.
   */
  @Override
  public Z next() {
    if (mIn < mPreTerms.length) { // during prepend phase
      return mPreTerms[mIn++];
    }
    // normal, transform terms
    ++mN; // starts with 1
    final Z bNext = mSeq.next();
    mBs.add(bNext == null ? Z.ZERO : bNext); // get next b(n)
    mCs.add(Z.ZERO); // allocate c[n]
    final int i = mN;

    Z cSum = Z.valueOf(i).multiply(mBs.get(i));
    for (int d = 1; d < i; ++d) {
      cSum = cSum.subtract(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    mCs.set(i, cSum);

    Z aSum = Z.ZERO;
    final int idiv2 = i >> 1;
    for (int d = 1; d <= i; ++d) { // compute c[k] = sum ...
      if (d == 1 || d == i || (d <= idiv2 && (i % d == 0))) { 
        aSum = aSum.add(mCs.get(d).multiply(Mobius.mobius(i / d))); // "mob(i,d)"
      }
    } // for d
    aSum = aSum.divide(Z.valueOf(i));
    mAs.add(aSum);
    return aSum;
  }

}
