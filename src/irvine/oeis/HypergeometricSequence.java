package irvine.oeis;

import java.util.function.BiFunction;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * This class computes a hypergeometric function with a parameter <code>mN</code> in the
 * "numerator" and/or "denominator" Pochhammer symbols, for a value that may also depend on <code>mN</code>.
 * The hypergeometric series must be finite.
 * The p and q Pochhammer symbols for the "numerator" and the "denominator", together with the trailing variable,
 * are written in one array <code>polyArray</code> that contains rational polynomials in <code>mN</code>.
 * @author Georg Fischer
 */
public class HypergeometricSequence extends AbstractSequence implements DirectSequence {

  protected int mN; // index of the next sequence element to be computed
  private final int mP; // number of Pochhammer symbols in the "numerator".
  //private final int mQ; // number of Pochhammer symbols in the "denominator".
  private final Q[][] mPolyArray; // polynomials as rational coefficients of <code>n^i, i=0..m</code>
  private final int mPolyLen; // size of <code>mPolyArray</code>
  private boolean mNonZero; // false if one of the Pochhammer symbols became zero, true otherwise
  private final int mOffset; // first index
  private final Z[] mInits; // initial terms
  private final int mInitNo; // mInits.length
  private final BiFunction<Integer, Q, Z> mLambdaQ; // (n, v) -> f(n, v)
/* for later optimization:
  private boolean[] mIsVarPoch; // whether the Pochhammer symbol (or the trailing variable) contains the variable <code>n</code>.
  private ArrayList<ArrayList<Q>> mPochList; // values of the constant Pochhammer symbols (or the trailing variable)
*/

  /**
   * Empty constructor.
   */
  protected HypergeometricSequence() {
    this(0, 1, 1, "[[-1],[1],[0,1]]");
  }

  /**
   * Convenience constructor with String parameter.
   * @param offset first valid term has this index
   * @param p number of Pochhammer symbols in the "numerator"
   * @param q number of Pochhammer symbols in the "denominator"
   * @param polyString nested expression of the form <code>"[[c00,c01...],[c10,c11...]...[ck0,ck1...]]"</code> with <code>k = p + q</code>,
   */
  public HypergeometricSequence(final int offset, final int p, final int q, final String polyString) {
    this(offset, p, q, toPolyArray(polyString), "", null);
  }

  /**
   * Construct a hypergeometric sequence from Q parameters.
   * @param offset first valid term has this index
   * @param p number of Pochhammer symbols in the "numerator"
   * @param q number of Pochhammer symbols in the "denominator"
   * @param polyArray polynomials as coefficients of <code>n^i, i=0..m</code>, size is <code>p + q + 1</code>
   */
  public HypergeometricSequence(final int offset, final int p, final int q, final Q[][] polyArray) {
    this(offset, p, q, polyArray, "", null);
  }

  /**
   * Construct a hypergeometric sequence from Q parameters.
   * @param offset first valid term has this index
   * @param p number of Pochhammer symbols in the "numerator"
   * @param q number of Pochhammer symbols in the "denominator"
   * @param polyString nested expression of the form <code>"[[c00,c01...],[c10,c11...]...[ck0,ck1...]]"</code> with <code>k = p + q</code>,
   * @param initTerms comma-separated list of initial terms
   */
  public HypergeometricSequence(final int offset, final int p, final int q, final String polyString, final String initTerms) {
    this(offset, p, q, toPolyArray(polyString), initTerms, null);
  }

  /**
   * Construct a hypergeometric sequence from Q parameters.
   * @param offset first valid term has this index
   * @param p number of Pochhammer symbols in the "numerator"
   * @param q number of Pochhammer symbols in the "denominator"
   * @param polyString nested expression of the form <code>"[[c00,c01...],[c10,c11...]...[ck0,ck1...]]"</code> with <code>k = p + q</code>,
   * @param initTerms comma-separated list of initial terms
   * @param lambdaQ expression for a simple transformation of the terms
   */
  public HypergeometricSequence(final int offset, final int p, final int q, final String polyString,
                                final String initTerms, final BiFunction<Integer, Q, Z> lambdaQ) {
    this(offset, p, q, toPolyArray(polyString), initTerms, lambdaQ);
  }

  /**
   * Construct a hypergeometric sequence from Q parameters.
   * @param offset first valid term has this index
   * @param p number of Pochhammer symbols in the "numerator"
   * @param q number of Pochhammer symbols in the "denominator"
   * @param polyArray polynomials as coefficients of <code>n^i, i=0..m</code>, size is <code>p + q + 1</code>
   * @param initTerms comma-separated list of initial terms
   * @param lambdaQ expression for a simple transformation of the terms
   */
  public HypergeometricSequence(final int offset, final int p, final int q, final Q[][] polyArray,
                                final String initTerms, final BiFunction<Integer, Q, Z> lambdaQ) {
    super(offset);
    mOffset = offset;
    mN = offset - 1;
    mP = p;
    //mQ = q;
    mPolyArray = polyArray;
    mPolyLen = mPolyArray.length;
    // index for mInits
    mInits = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms);
    mInitNo = mInits.length;
    if (p + q + 1 != polyArray.length) {
      throw new RuntimeException("p + q + 1 != polyArray.length");
    }
    mLambdaQ = lambdaQ == null ? ((n, v) -> v.num()) : lambdaQ;
  /* for later optimization:
    mIsVarPoch = new boolean[mPolyLen];
    mPochList = new ArrayList<ArrayList<Q>>();
    for (int ip = 0; ip < mPolyLen; ++ip) {
      mIsVarPoch[ip] = mPolyArray[ip].length > 1;
      ArrayList<Q> poch = new ArrayList<>();
      poch.add(Q.ONE); // 1 for mK = 0
      poch.add(evalPoly(ip, mN)); // start values for k = 1
      mPochList.add(poch); 
    }
  */
  }

  /**
   * Evaluate a polynomial, maybe depending on <code>n</code>, for <code>k = 0</code>.
   * @param ix index in {@link #mPolyArray}
   * @param n the index in the sequence
   * @return the value of the polynomial
   */
  private Q evalPoly(final int ix, final int n) {
    final Q[] poly = mPolyArray[ix];
    Q sum = poly[0];
    final int plen = poly.length;
    if (plen > 1) { // contains the variable
      Q npow = Q.ONE;
      for (int ip = 1; ip < plen; ++ip) {
        npow = npow.multiply(n);
        sum = sum.add(npow.multiply(poly[ip]));
      }
    }
    return sum;
  }

  /**
   * Evaluate the Pochhammer symbol at index <code>ip</code> for <code>k = 0 to n - 1</code>.
   * @param ix index in {@link #mPolyArray}
   * @param n limit for the addition
   * @return the value of the Pochhammer symbol
   */
  private Q evalPochhammer(final int ix, final int n) {
    Q result = Q.ONE;
    final Q[] poly = mPolyArray[ix];
    final int plen = poly.length;
    //if (true || plen > 1) { // contains the variable
      Q npow = Q.ONE;
      Q sum = poly[0];
      for (int ip = 1; ip < plen; ++ip) { // compute the base value elem
        npow = npow.multiply(mN);
        sum = sum.add(npow.multiply(poly[ip]));
      }
      int k = 0;
      while (mNonZero && k < n) { // compute elem * (elem + 1) * (elem + 2) * ... (elem + mExp-1)
        final Q elem = sum.add(k);
        if (!elem.isZero()) {
          result = result.multiply(elem);
        } else {
          result = Q.ZERO;
          // System.out.println("\tZERO, ix=" + ix + ", k=" + k + ", result=" + result);
          mNonZero = false;
        }
        // System.out.println("\t\tevp, ix=" + ix + ", k=" + k + ", n=" + n + ", elem=" + elem + ", result=" + result);
        ++k;
      }
//    } else { // is constant
//      // optimize later by remembering old values
//    }
    // System.out.println("\tevalPochhammer(" + ix + ") --> " + result);
    return result;
  }

  /**
   * Get a specific Q term of the sequence.
   * @param n index of the term
   * @return rational value
   */
  public Q getTerm(final int n) {
    Q sum = Q.ONE; // for exp = 0
    int exp = 1;
    Z fact = Z.ONE; // exp!
    final Q var = evalPoly(mPolyLen - 1, n); // the trailing variable, evaluated for n
    Q varPow = Q.ONE; // power of var
    mNonZero = true;
    while (mNonZero && exp < 8 * n) { // 8 = safety limit; increase exp as long as no product becomes 0
      varPow = varPow.multiply(var);
      fact = fact.multiply(exp);
      Q prod = Q.ONE;
      int ix = 0;
      while (mNonZero && ix < mPolyLen - 1) { // evaluate all Pochhammer symbols
        if (ix < mP) { // in the "numerator" - multiply
          prod = prod.multiply(evalPochhammer(ix, exp));
        } else { // in the "denominator" - divide
          prod = prod.divide(evalPochhammer(ix, exp));
        }
        // System.out.println("\tprod, n=" + n + ", exp=" + exp + ", ix=" + ix + ", prod=" + prod + (ix < mP ? ", mul" : ", div") + ", sum=" + sum);
        ++ix;
      }
      sum = sum.add(prod.multiply(varPow).divide(fact));
      // System.out.println("nextQ(n=" + exp + "), varPow=" + varPow + ", fact=" + fact + ", sum=" + sum + "\n");
      ++exp;
    }
    if (mNonZero && exp > 1) {
      throw new RuntimeException("probably nonterminating, exp=" + exp);
    }
    return sum;
  }

  /**
   * Convert a String into a list of polynomials.
   * @param polyString nested expression of the form <code>"[[c00,c01...],[c10,c11...]...[ck0,ck1...]]"</code> with <code>k = p + q</code>,
   * and Q constants <code>cij</code>.
   */
  public static Q[][] toPolyArray(final String polyString) {
    final String[] polys = polyString.replaceFirst("\\A[\\[\\s ]+", "").replaceFirst("[\\]\\s]+\\Z", "").split("]\\s*,\\s*\\[");
    final Q[][] polyArray = new Q[polys.length][];
    for (int ip = 0; ip < polys.length; ++ip) {
      polyArray[ip] = toQArray(polys[ip]);
    } // for ip
    return polyArray;
  }

  /**
   * Convert a String into a list of Q constants.
   * @param qList expression of the form <code>[c0,c0...]</code>,
   * and Q constants <code>ci</code>.
   */
  public static Q[] toQArray(final String qList) {
    final String[] qStrings = qList.trim().split("\\s*\\,\\s*");
    final int qlen = qStrings.length;
    final Q[] result = new Q[qlen];
    for (int iq = 0; iq < qlen; ++iq) {
      final String[] pair = qStrings[iq].split("\\/");
      if (pair.length == 1) {
        result[iq] = new Q(new Z(pair[0]));
      } else {
        result[iq] = new Q(new Z(pair[0]), new Z(pair[1]));
      }
    }
    return result;
  }

  /**
   * Gets the vectors for the coefficient polynomials.
   * @return a list of coefficient vectors for the powers of <code>n</code>.
   */
  public Q[][] getPolyList() {
    return mPolyArray;
  }

  /**
   * Gets a String representation of the coefficient polynomials.
   * @return a list of polynomials, for example "[[0,1/3],[-1],[0,1]]".
   */
  public String getPolyString() {
    final StringBuilder result = new StringBuilder(256);
    for (int i = 0; i < mPolyArray.length; ++i) { // polynomials
      final Q[] poly = mPolyArray[i];
      result.append(i == 0 ? '[' : ',');
      for (int j = 0; j < poly.length; ++j) {
        result.append(j == 0 ? '[' : ',');
        result.append(poly[j]);
      } // for j
      result.append(']');
    } // for i
    result.append(']');
    return result.toString();
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return mInitNo > n - mOffset ? mInits[n - mOffset] : mLambdaQ.apply(mN, getTerm(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  /**
   * Main test method: compute the hypergeometric series
   * @param args command line arguments:
   * <ul>
   * <li>-h numerator and denominator polynomials in <code>n</code></li>
   * <li>-i list of initial terms
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * <li>-p number of Pochhammer symbols in the "numerator"  </li>
   * <li>-q number of Pochhammer symbols in the "denominator" </li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    int p = 1; // number of Pochhammer symbols in the "numerator"
    int q = 1; // number of Pochhammer symbols in the "denominator"
    String polyString = "[[-1],[1],[0,1]]"; // A024000
    int offset = 0;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-h".equals(opt)) {
          polyString = args[iarg++];
        } else if ("-n".equals(opt)) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if ("-o".equals(opt)) {
          offset = Integer.parseInt(args[iarg++]);
        } else if ("-p".equals(opt)) {
          p = Integer.parseInt(args[iarg++]);
        } else if ("-q".equals(opt)) {
          q = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    } // while args

    SequenceFactory.printTerms(new HypergeometricSequence(offset, p, q, polyString), noTerms);
  }
}

