package irvine.oeis;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Apply the generalized Euler transform to two other sequences f and g, as defined in OEIS A266964:
 * From Seiichi Manyama, Nov 14 2017: (Start)
 * A generalized Euler transform.
 * Suppose given two sequences f(n) and g(n), n&gt;0, we define a new sequence a(n), n&gt;=0, <br />
 * by Product_{n&gt;0} (1 - g(n)*x^n)^(-f(n)) = a(0) + a(1)*x + a(2)*x^2 + ... <br />
 * Since Product_{n&gt;0} (1 - g(n)*x^n)^(-f(n)) = exp(Sum_{n&gt;0} (Sum_{d|n} d*f(d)*g(d)^(n/d))*x^n/n),  <br />
 * we see that a(n) is given explicitly by a(n) = (1/n) * Sum_{k=1..n} b(k)*a(n-k) where b(n) = Sum_{d|n} d*f(d)*g(d)^(n/d). <br />
 * Examples: <br />
 * 1. If we set g(n) = 1, we get the usual Euler transform. <br />
 * 2. If we set f(n) = -h(n) and g(n) = -1, we get the weighout transform (cf. A026007). <br />
 * 3. If we set f(n) = -n and g(n) = n, we get this sequence. <br />
 * (End) <br />
 * @author Georg Fischer
 */
public class GeneralizedEulerTransform implements Sequence {

  protected Sequence mSeqF;
  protected Sequence mSeqG;
  private final ArrayList<Z> mFs = new ArrayList<>(); // first underlying sequence (Manyama's f(n))
  private final ArrayList<Z> mGs = new ArrayList<>(); // second underlying sequence (Manyama's g(n))
  private final ArrayList<Z> mBs = new ArrayList<>(); // resulting sequence (Manyama's a(n))
  private final ArrayList<Z> mCs = new ArrayList<>(); // auxiliary sequence (Manyama's b(n))
  protected Z[] mPreTerms; // initial terms to be prepended
  protected int mIn; // index for initial terms
  protected int mN; // current index >= 1, may be used in advance() of a subclass

  /**
   * Empty constructor;
   * initializes the internal properties
   */
  public GeneralizedEulerTransform() {
    mIn = 0;
    mN = 0;
    mFs.add(Z.ZERO); // [0] not used
    mGs.add(Z.ZERO); // [0] not used
    mBs.add(Z.ZERO); // [0] is not returned
    mCs.add(Z.ZERO); // [0] starts the sum
    mPreTerms = new Z[] { }; // no prefix terms
  }

  /**
   * Create a new sequence with no additional terms at the front.
   * @param seqF first underlying sequence
   * @param seqG second underlying sequence
   */
  public GeneralizedEulerTransform(final Sequence seqF, final Sequence seqG) {
    this();
    mSeqF = seqF;
    mSeqG = seqG;
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param preTerms additional terms to be prepended;
   */
  public GeneralizedEulerTransform(final long... preTerms) {
    this();
    mPreTerms = ZUtils.toZ(preTerms);
  }

  /**
   * Create the Euler transform of the given sequence,
   * with additional Z terms prepended.
   * @param seqF first underlying sequence
   * @param seqG second underlying sequence
   * @param preTerms additional terms to be prepended;
   * usually there is a leading one.
   */
  public GeneralizedEulerTransform(final Sequence seqF, final Sequence seqG, final Z... preTerms) {
    this(seqF, seqG);
    mPreTerms = preTerms;
  }

  /**
   * Create a new sequence 
   * with additional long terms prepended.
   * @param seqF first underlying sequence
   * @param seqG second underlying sequence
   * @param preTerms additional terms to be prepended;
   * usually there is a leading one.
   */
  public GeneralizedEulerTransform(final Sequence seqF, final Sequence seqG, final long... preTerms) {
    this(seqF, seqG);
    mPreTerms = ZUtils.toZ(preTerms);
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
    final Z fNext = advanceF(); // underlying sequence will see mN = 1, 2, 3, ... 
    mFs.add(fNext == null ? Z.ZERO : fNext); // get next f(n), care for finite f
    final Z gNext = advanceG(); // underlying sequence will see mN = 1, 2, 3, ... 
    mGs.add(gNext == null ? Z.ZERO : gNext); // get next g(n), care for finite g
    mCs.add(Z.ZERO); // allocate c[n]
    for (int i = mN; i <= mN; ++i) {
      Z cSum = Z.ZERO; // start sum
      for (int d = 1; d <= i; ++d) { // compute c[n] = sum ...
        if (i % d == 0) { // "did(i,d)"
          Z cTerm = Z.valueOf(d).multiply(mFs.get(d));
          cTerm = cTerm.multiply(mGs.get(d).pow(i / d));
          cSum = cSum.add(cTerm);
        }
      } // for d
      mCs.set(i, cSum); // = c[n]
    } // for i
    final int i = mN;
    Z bSum = mCs.get(i); 
    for (int d = 1; d < i; ++d) {
      bSum = bSum.add(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    bSum = bSum.divide(Z.valueOf(i));
    mBs.add(bSum);
    return bSum;
  } 

  /**
   * Wrapper around <code>mSeqF.next()</code>.
   * When this method is overwritten, super.mN runs through 1, 2, 3, and so on.
   * @return next term of the underlying sequence f to be Euler transformed
   */
  protected Z advanceF() {
    return mSeqF.next();
  }
  /**
   * Wrapper around <code>mSeqG.next()</code>.
   * When this method is overwritten, super.mN runs through 1, 2, 3, and so on.
   * @return next term of the underlying sequence g to be Euler transformed
   */
  protected Z advanceG() {
    return mSeqG.next();
  }
  
}
