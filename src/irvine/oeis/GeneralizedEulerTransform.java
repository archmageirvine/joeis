package irvine.oeis;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Apply the generalized Euler transform to two other sequences f and g, as defined in OEIS A266964:
 * From Seiichi Manyama, Nov 14 2017:
 * A generalized Euler transform.
 * Suppose given two sequences f(k) and g(k), n&gt;0, we define a new sequence a(n), n&gt;=0, <br />
 * by Product_{k&gt;0} (1 - g(k)*x^k)^(-f(k)) = b(0) + b(1)*x + b(2)*x^2 + ... = Sum{n&gt;>=0} b(n)*x^n<br />
 * Since Product_{k&gt;=1} (1 - g(k)*x^k)^(-f(k)) = exp(Sum_{n&gt;=1} (Sum_{d|n} d*f(d)*g(d)^(n/d))*x^n/n),  <br />
 * we see that b(n) is given explicitly by b(n) = (1/n) * Sum_{k=1..n} c(k)*b(n-k) <br />
 * where c(n) = Sum_{d|n} d*f(d)*g(d)^(n/d). <br />
 * The algorithm here uses a monotone increasing function h(k) (default: h(k) := k) such that<br />
 * g(k) := 0 for k != h(k). <br />
 * Examples: <br />
 * 1. If we set g(k) := 1, we get the usual Euler transform. <br />
 * 2. If we set f(k) := - f1(k) and g(k) := -1, we get the weighout transform (cf. A026007). <br />
 * 3. If we set f(k) := - n (A001478) and g(k) := k (A000027), we get A266964. <br />
 * 4. With the default f(k) := g(k) := A000012 (all 1's), we get A000041 (number of partitions of n). <br />
 * @author Georg Fischer
 */
public class GeneralizedEulerTransform implements Sequence {

  // protected static String mDebug = System.getProperty("debug", "0");
  private static final int ESTLEN = 16384; // estimated length of arrays
  private final ArrayList<Z[]> mFs = new ArrayList<>(ESTLEN); // first underlying sequence (Manyama's f(k))
  private final ArrayList<Z> mGs = new ArrayList<>(ESTLEN); // second underlying sequence (Manyama's g(k))
  private final ArrayList<Z> mBs = new ArrayList<>(ESTLEN); // resulting sequence (Manyama's a(n))
  private final ArrayList<Z> mCs = new ArrayList<>(ESTLEN); // auxiliary sequence (Manyama's b(n))
  protected Z mNextH; // next term of the sequence h(k)
  protected Z mFRoot; // constant denominator of f(k), or 0
  protected Z[] mPreTerms; // initial terms to be prepended
  protected int mIn; // index for initial terms
  protected int mKfg; // current index k >= 1 for f() and g()
  protected int mKh; // current index for h()
  protected Sequence mSeqF; // sequence for the exponent of the parenthesis: 1/(1-x^k)^f(k)
  protected Sequence mSeqG; // sequence for the factor of x^k: 1/(1-g(k)*x^k)^f(k)
  protected Sequence mSeqH; // monontone increasing (!) sequence for the exponent of x: 1/(1-g(k)*x^h(k))^f(k)
  protected int[] mParms; // additional parameters

  /**
   * Empty constructor;
   * initializes the internal properties
   */
  public GeneralizedEulerTransform() {
    this(0, 1, new long[]{1L});
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param offset index of first term
   * @param kStart start value for k
   * @param preTerms additional terms to be prepended;
   */
  public GeneralizedEulerTransform(final int offset, final int kStart) {
    this(offset, kStart, new long[]{1L});
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param offset index of first term
   * @param kStart start value for k
   * @param preTerms additional terms to be prepended;
   */
  public GeneralizedEulerTransform(final int offset, final int kStart, final long[] preTerms) {
    mSeqF = null;
    mSeqG = null;
    mPreTerms = ZUtils.toZ(preTerms);
    mFRoot = Z.ZERO; // no root is set so far (maybe overwritten by setFRoot)
    mIn = 0; // for prepending
    mKfg = 0;
    for (int k = 0; k < 1; ++k) { // kStart; ++k) {
      mFs.add(new Z[]{Z.ZERO}); // [0] not used
      mGs.add(Z.ZERO); // [0] not used
      mBs.add(Z.ZERO); // [0] is not returned
      mCs.add(Z.ZERO); // [0] starts the sum
    } // while < kStart
    mKh = (kStart <= 1) ? kStart : 1;
    mNextH = Z.valueOf(mKh); // Z.ONE; // for a^k in advanceH(mKh)
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
    ++mKfg; // starts with 1
    final Z[] nextF = advanceF(mKfg); // or advanceF(mK) ??? why?
    if (nextF[0] == null) {
      nextF[0] = Z.ZERO; // care for finite f returning null
    }
    if (nextF.length > 1) {
      mFRoot = nextF[1];
    }
    mFs.add(nextF);

    Z nextG = advanceG(mKfg); // get next g(k)
    if (Z.valueOf(mKfg).compareTo(mNextH) < 0) {
      nextG = Z.ZERO; // invalidate this g(k)
    } else { // mKfg = mNextH : this g(k) is valid
      ++mKh;
      mNextH = advanceH(mKh); // next stop value
    }
    if (nextG == null) {
      nextG = Z.ZERO; // care for finite g returning null
    }
    mGs.add(nextG);

    final int i = mKfg;
    Z cSum = Z.ZERO; // start sum
    final int idiv2 = i >> 1;
    for (int d = 1; d <= i; ++d) { // compute c[k] = sum ...
      if (d == 1 || d == i || (d <= idiv2 && (i % d == 0))) { // "did(i,d)", "does it divide"
        // if (i % d == 0) { // "did(i,d)"
        final int idivd = i / d;
        final Z[] fTerm = mFs.get(d);
        if (!fTerm[0].isZero()) { // ends in zero for all finite f(k)
          Z cTerm = fTerm[0].multiply(d);
          final Z gTerm = mGs.get(d);
          if (!gTerm.isZero()) {
            //---- start of the generalization
            if (!gTerm.equals(Z.ONE)) { // != 1
              if (gTerm.equals(Z.NEG_ONE)) {
                if ((idivd & 1) != 0) {
                  cTerm = cTerm.negate(); // *(-1)^odd
                } // (-1)^even: ignore
              } else { // != -1
                cTerm = cTerm.multiply(gTerm.pow(idivd));
              }
            } // else cTerm * 1^(...): ignore
            //---- end of generalization
            cSum = cSum.add(cTerm);
          } // else g(k) = 0: ignore
        } // else f(k) = 0: ignore
      } // else not "did(i,d)"
    } // for d
    // mCs.set(i, csum);
    mCs.add(cSum); // = c[k]

    Z bSum = mCs.get(i);
    for (int d = 1; d < i; ++d) {
      bSum = bSum.add(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    if (i > 0) {
      bSum = bSum.divide(i);
    }
    if (!mFRoot.isZero()) {
      final Z[] quotRem = bSum.divideAndRemainder(mFRoot);
      if (!quotRem[1].isZero()) {
        System.err.println("assertion in GeneralizedEulerTransform: remainder != 0 for k=" + mKfg);
      }
      bSum = quotRem[0];
    }
/*
    if (mDebug.compareTo("0") > 0) {
      System.err.println("mKfg=" + mKfg + "\tmKh=" + mKh 
          + "\tmNextH=" + mNextH + "\tnextF=" + nextF.toString() + "\tnextG=" + nextG.toString()
          + "\tc[k]=" + cSum.toString() + "\tb[k]=" + bSum.toString()
          );
    }
*/
    mBs.add(bSum);
    return bSum;
  }

  /**
   * Wrapper around <code>mSeqF.next()</code>, typically overwritten by a subclass.
   * @param k current index, exponent of x
   * @return next term of the underlying sequence f in the definition of the transform
   */
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.ONE};
  }

  /**
   * Wrapper around <code>mSeqG.next()</code>, may be overwritten by a subclass.
   * @param k current index, exponent of x
   * @return next term of the underlying sequence g in the definition of the transform
   */
  protected Z advanceG(final long k) {
    return Z.ONE;
  }

  /**
   * Wrapper around <code>mSeqH.next()</code>, may be overwritten by a subclass.
   * This sequence most be monotone increasing.
   * @param k current index, exponent of x.
   * int is sufficient here since in the OEIS we assume that indexes (exponents of x) remain &lt; 10^6.
   * @return next term of the underlying sequence h in the definition of the transform
   */
  protected Z advanceH(final long k) {
    return Z.valueOf(k);
  }

}
