package irvine.oeis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import irvine.math.api.RationalSequence;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.Series;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * Compute the coefficients of a generating function A(x) given by some equation that is satisfied by A(x).
 * Suitable for generating functions expressible over the rationals.
 * See https://teherba.org/tehowiki/index.php/Expansion_of_polynomials.
 * @author Georg Fischer
 */
public class PolynomialFieldSequence extends AbstractSequence implements RationalSequence {

  protected static int sDebug;
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final HashMap<String, Integer> POST_MAP = new HashMap<>(64); // map a postfix string to an int for switch() statement

  /* Caution, the following are bitmasks, c.f. usage at the end of <code>compute()</code>: */
  /** Bitmask indicating the numerators of an ordinary target generating function. */
  public static final int OGF = 0;
  /** Bitmask indicating the numerators of an exponential target or an exponential source generating function. */
  public static final int EGF = 1;
  /** Bitmask indicating the denominators of an ordinary target generating function. */
  public static final int DEN_OGF = 4;
  /** Bitmask indicating the denominators of an exponential target generating function. */
  public static final int DEN_EGF = 5;
  /** Bitmask indicating a rational source generating function. */
  private static final int RAT = 4;

  private final String[] mPostStrings; // list of operands and operators
  private final int[] mPostInts; // list of operands and operators converted to integer codes
  private int mPostLen; // length of mPostInts array generated from the postfix String
  private final int mDist; // additional degree
  private final int mGfType; // type of the resulting generating function: 0 = ordinary, 1 = exponential (integer or numerators), 4 ordinary, 5 exponential (denominators)
  private final int mModulus; // for example 1 for odd, 0 for even if factor = 2
  private final int mFactor; //  multiplicity when zeroes should be left out

  private final List<Polynomial<Q>> mPolys; // Polynomials referenced in the postfix string as "p0" (the initial polynomial), "p1", "p2" and so on.
  private final List<Sequence> mSeqs; // sequences for additional generating functions referenced in the postfix string as "S", "T", "U" or "V".
  private final ArrayList<Polynomial<Q>> mTerms; // terms of mSeqs[iseq]
  private final ArrayList<Integer> mNix; // index of next free elemen in mTerms[iseq]
  private final ArrayList<Integer> mTypes; // types of additional source sequences: 0 = OGF, 1 = EGF, 4 = rational OGF, 5 = rational EGF
  private int mN; // index of the next sequence element to be computed
  private Polynomial<Q> mA; // the generating function A(x) to be computed
  private final List<Polynomial<Q>> mStack; // stack where the final expression is computed
  private Z mFactorial;

  /**
   * Helper method that indicates that the input sequence <code>seq</code> should be converted
   * from an exponential generating function to an ordinary generating function.
   * The offset will be forced to 0, and all terms will be multiplied by <code>n!</code>.
   * @param seq input sequence
   * @return sequence wrapped with the property to be an exponential generating function.
   */
  public static EgfWrapper egf(final Sequence seq) {
    return EgfWrapper.wrap(seq);
  }

  {
    fillMap();
  }

  /**
   * Reflective method for parameter <code>polys</code>.
   * @return the list of polynomials
   */
  protected List<Polynomial<Q>> getPolynomials() {
    return mPolys;
  }

  /**
   * Reflective method for parameter <code>postfix</code>.
   * @return the postfix String, already split up in an array of Strings
   */
  protected String[] getPostfixStrings() {
    return mPostStrings;
  }

  /**
   * Reflective method for parameter <code>seqs</code>.
   * @return a list of the additional input sequences as String of A-numbers, separated by ",",
   * exponential generating functions are indicated by a trailing "!" mark.
   */
  protected String getSequenceString() {
    final StringBuilder sb = new StringBuilder();
    int iseq = 0;
    for (Sequence seq : mSeqs) {
      if (iseq > 0) {
        sb.append(",");
      }
      sb.append(((seq instanceof EgfWrapper) ? ((EgfWrapper) seq).getSequence() : seq).getClass().getSimpleName());
      if (mTypes.get(iseq) == EGF) {
        sb.append("!");
      }
      ++iseq;
    }
    return sb.toString();
  }

  /**
   * Compute successive coefficients for a generating function A(x) defined by a condition that A(x) must satisfy.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character in
   * the String, for example A213091 <code>satisfies: A(x) = 1 + x/A(-x*A(x)^2)</code> -&gt; <code>",1,x,A,^2,<1,neg,sub,/,+"</code>
   * @param dist additional degree
   * @param gfType type of the resulting generating function: 0 = ordinary, 1 = exponential (integer or numerators), 4 ordinary, 5 exponential (denominators)
   * @param modulus for example 1 for odd, 0 for even if factor = 2
   * @param factor multiplicity when zeroes should be left out
   * @param seqs list of optional sequences whose generating functions are used in the postfix expression
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix,
                                 final int dist, final int gfType, final int modulus, final int factor,
                                 final Sequence... seqs) {
    super(offset);
    mDist = dist;
    mGfType = gfType;
    mModulus = modulus;
    mFactor = factor;

    final String postr = trimQuotes(postfix);
    if (postr.matches("[0-9a-zA-Z].*")) { // 1st char is no separator: use default separator ","
      mPostStrings = postr.split(Pattern.quote(","));
    } else {
      mPostStrings = postr.substring(1).split(Pattern.quote(postr.substring(0, 1)));
    }
    if (sDebug >= 1) {
      System.out.print("# mPostStrings=");
      for (final String s : mPostStrings) {
        System.out.print(s + ";");
      }
      System.out.println();
    }
    mPostInts = new int[mPostStrings.length * 2]; // should normally be sufficient even with some ^\d+, <\d+, p\d+
    mPostLen = 0;
    for (int k = 0; k < mPostStrings.length; ++k) {
      String pelem = mPostStrings[k];
      String parms = "";
      if (Character.isDigit(pelem.charAt(0))) { // single non-negative number, prefix with i
        parms = pelem;
        pelem = "i";
      } else if (pelem.length() >= 2 && pelem.charAt(0) == '-' && Character.isDigit(pelem.charAt(1))) { // single negative number, prefix with i
        parms = pelem;
        pelem = "i";
      } else if (pelem.charAt(0) == '<') { // shift left/high (+m) or right/low (-m) = multiply by x^m
        parms = pelem.substring(1);
        pelem = "<";
      } else if (pelem.length() >= 2 && Character.isDigit(pelem.charAt(1))) { // one of p, i, ^ with 1 or 2 additional int parameter(s)
        parms = pelem.substring(1);
        pelem = pelem.substring(0, 1); // single character code
      }
      final Integer ix = POST_MAP.get(pelem);
      if (ix != null) {
        if (!parms.isEmpty()) { // with additional parameter(s)
          if ("^".equals(pelem)) {
            final int slashPos = parms.indexOf('/');
            if (slashPos >= 0) { // is a fraction
              mPostInts[mPostLen++] = POST_MAP.get("^q");
              mPostInts[mPostLen++] = Integer.parseInt(parms.substring(0, slashPos)); // num
              mPostInts[mPostLen++] = Integer.parseInt(parms.substring(slashPos + 1)); // den
            } else { // plain natural number
              mPostInts[mPostLen++] = POST_MAP.get("^i");
              mPostInts[mPostLen++] = Integer.parseInt(parms);
            }
          } else { // p, i, s, <
            mPostInts[mPostLen++] = ix;
            mPostInts[mPostLen++] = Integer.parseInt(parms);
          }
        } else {
          mPostInts[mPostLen++] = ix;
        }
      } else {
        throw new RuntimeException("postfix code \"" + mPostStrings[k] + "\" -> \"" + pelem + "\" not found in static map");
      }
    }
    if (sDebug >= 1) {
      for (int k = 0; k < mPostLen; ++k) {
        System.out.println("# mPostInts[" + k + "]=" + mPostInts[k]);
      }
    }

    mStack = new ArrayList<>(mPostInts.length);
    for (int k = 0; k < mPostStrings.length; ++k) {
      mStack.add(null);
    } // for k

    String polyString = polys;
    if (polyString.length() == 0) {
      polyString = "1"; // empty -> "1"
    }
    mSeqs = new ArrayList<>();
    mTerms = new ArrayList<>(); // denoted by S, T, U, V
    mNix = new ArrayList<>(); // indexed by S, T, U, V
    mTypes = new ArrayList<>(); // indexed by S, T, U, V

    try {
      final int aNumPos = polyString.indexOf('A');
      if (aNumPos >= 0) { // add any A-numbers at the end of the polynomials
        final String[] aNums = polyString.substring(aNumPos).split("\\, *"); // split into A-numbers
        polyString = polyString.substring(0, aNumPos - 1); // keep polynomials only
        polyString = polyString.replaceAll(" *\\, *\\Z", ""); // remove trailing comma
        for (int iseq = 0; iseq < aNums.length; ++iseq) { // over all input sequence A-numbers
          int mask = OGF; // default
          String aNum = aNums[iseq];
          if (aNum.endsWith("!")) { // "aseqno!" indicates that aseqno should be treated as e.g.f.
            mask |= EGF;
            aNum = aNum.substring(0, aNum.length() - 1); // remove the "!"
          }
          mTypes.add(mask);
          final Sequence seq = SequenceFactory.sequence(aNum);
          if (seq instanceof RationalSequence) {
            mask |= RAT;
          }
          mSeqs.add(seq);
        }
      }
      for (Sequence seq : seqs) { // add sequences from the trailing parameter list
        int mask = OGF;
        if (seq instanceof RationalSequence) {
          mask |= RAT;
        }
        if (seq instanceof EgfWrapper) {
          mask |= EGF;
        }
        mTypes.add(mask);
        mSeqs.add(seq);
      }
      for (int iseq = 0; iseq < mSeqs.size(); ++iseq) { // advance all input sequences to their offset + mDist + 1
        final Sequence seq = mSeqs.get(iseq);
        final int sourceOffset = seq.getOffset();
        final Q[] terms = new Q[sourceOffset + mDist + 1];
        mNix.add(0);
        mTerms.add(null);
        int iexp = 0;
        while (iexp <= sourceOffset + mDist) {
          if (iexp < sourceOffset) {
            terms[iexp] = Q.ZERO;
          } else {
            final int sType = mTypes.get(iseq);
            terms[iexp] = (sType & RAT) != 0 ? ((RationalSequence) seq).nextQ() : Q.valueOf(seq.next());
            if ((sType & EGF) != 0) {
              terms[iexp] = terms[iexp].divide(Functions.FACTORIAL.z(iexp));
            }
          }
          ++iexp;
        }
        mNix.set(iseq, iexp);
        mTerms.set(iseq, Polynomial.create(terms));
      }
    } catch (final UnimplementedException exc) {
      System.err.println(exc.getMessage());
    }

    polyString = trimQuotes(polyString);
    final String[] polarr = !polyString.contains("]")
      ? new String[] {polyString} // no square brackets: a single coefficient lisst
      : polyString.split("]\\s*,\\s*\\["); // a list of coefficient lists enclosed in square bracket
    mPolys = new ArrayList<>(polarr.length);
    for (int k = 0; k < polarr.length; ++k) {
      if (sDebug >= 1) {
        System.out.println("# polarr[" + k + "]=" + polarr[k]);
      }
      final String[] svect = polarr[k].split(" *, *");
      final Q[] qvect = new Q[svect.length];
      for (int j = 0; j < svect.length; ++j) {
        qvect[j] = new Q(svect[j]);
        if (sDebug >= 1) {
          System.out.println("# k=" + k + ", qvect[" + j + "]=" + qvect[j].toString());
        }
      }
      mPolys.add(RING.create(Arrays.asList(qvect)));
    } // for k

    mFactorial = Z.ONE;
    for (int i = offset - 1; i > 0; --i) {
      mFactorial = mFactorial.multiply(i);
    }
    for (int i = 1; i <= offset + mDist; ++i) { // add terms to the addional sequences if our offset >= 1
      for (int iseq = 0; iseq < mTerms.size(); ++iseq) { // for all additional sequences
        advanceSeq(iseq);
      }
    }
    mN = offset - 1;
    mA = mPolys.get(0);
    if (sDebug >= 1) {
      System.out.println("# construct PolynomialFieldSequence: mN=" + mN + ", mA=" + mA + ", mDist=" + mDist + ", mGfType=" + mGfType);
    }
  } // Constructor

  /**
   * Append the next term from an additional sequence to the corresponding Polynomial.
   * @param iseq sequence number: 0, 1, 2, 3
   */
  private void advanceSeq(final int iseq) {
    Polynomial<Q> pseq = mTerms.get(iseq);
    final int iexp = mNix.get(iseq);
    final int sType = mTypes.get(iseq);
    Q term = (sType & RAT) != 0 ? ((RationalSequence) mSeqs.get(iseq)).nextQ() : Q.valueOf(mSeqs.get(iseq).next());
    if ((sType & EGF) != 0) {
      term = term.divide(Functions.FACTORIAL.z(iexp));
    }
    pseq = RING.add(pseq, RING.monomial(term, iexp));
    mNix.set(iseq, iexp + 1);
    // System.err.println("pseq[" + iseq + "] = " + pseq);
    mTerms.set(iseq, pseq);
  }

  /**
   * Constructor with postfix only, and default of all other parameters.
   * @param offset first index
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character
   */
  public PolynomialFieldSequence(final int offset, final String postfix) {
    this(offset, "[1]", postfix, 0, OGF, 1, 1);
  }

  /**
   * Constructor with polynomials and postfix only, and default of all other parameters.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix) {
    this(offset, polys, postfix, 0, OGF, 1, 1);
  }

  /**
   * Constructor with gfType in addition.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character
   * @param dist additional degree
   * @param gfType type of the generating function: 0 = ordinary, 1 = exponential
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix, final int dist, final int gfType) {
    this(offset, polys, postfix, dist, gfType, 1, 1);
  }

  /**
   * Constructor with modulus and factor in addition.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character in
   * the String, for example A213091 <code>satisfies: A(x) = 1 + x/A(-x*A(x)^2)</code> -&gt; <code>",1,x,A,^2,<1,neg,sub,/,+"</code>
   * @param dist additional degree
   * @param gfType type of the generating function: 0 = ordinary, 1 = exponential (integer or numerators), 4 ordinary, 5 exponential (denominators)
   * @param modulus for example 1 for odd, 0 for even if factor = 2
   * @param factor multiplicity when zeroes should be left out
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix,
                                 final int dist, final int gfType, final int modulus, final int factor) {
    this(offset, polys, postfix, dist, gfType, modulus, factor, new Sequence[0]);
  }

  /**
   * Return the inner content of a String without surrounding square brackets, quotes or apostrophes, with all spaces removed.
   * @param pstr full String
   * @return String with surrounding characters removed
   */
  protected static String trimQuotes(final String pstr) {
    final String str = pstr.replace(" ", "");
    int start = 0;
    while (start < str.length() && (str.charAt(start) == '[' || str.charAt(start) == '"' || str.charAt(start) == '\'')) {
      ++start;
    }
    int behind = str.length();
    while (behind > start && (str.charAt(behind - 1) == ']' || str.charAt(behind - 1) == '"' || str.charAt(behind - 1) == '\'')) {
      --behind;
    }
    return str.substring(start, behind);
  }

  /**
   * Print the contents of the stack in readable form.
   * @param ix current postfix element
   * @param top index of top stack element
   * @param str call point
   */
  protected void debugStack(final int ix, final int top, final String str) {
    System.out.print("# ix=" + ix + " \t");
    for (int is = 0; is <= top + 1; ++is) {
      if (mStack.get(is) != null) {
        System.out.print(" " + (is == top ? "top" : String.valueOf(is)) + ":" + mStack.get(is).toString());
      }
    }
    System.out.println("\t" + str);
  }

  /**
   * Replaces the power series sum of <code>a_n*x^n</code> by sum of <code>a_n*x^n/n!</code>
   * @param p polynomial
   * @return Laplace series
   */
  public Polynomial<Q> makeEgf(final Polynomial<Q> p) {
    final Polynomial<Q> res = new Polynomial<>("x", Q.ZERO, Q.ONE);
    Q fact = Q.ONE;
    for (int k = 0; k <= p.degree(); ++k) {
      if (k > 1) {
        fact = fact.multiply(k);
      }
      res.add(p.coeff(k).divide(fact));
    }
    return res;
  }

  /**
   * Replaces the power series sum of <code>a_n*x^n</code> by sum of <code>a_n*x^n*n</code>.
   * @param p polynomial
   * @return copy with replaced coefficients
   */
  public Polynomial<Q> multiplyByExponent(final Polynomial<Q> p) {
    final Polynomial<Q> res = new Polynomial<>("x", Q.ZERO, Q.ONE);
    for (int k = 0; k <= p.degree(); ++k) {
      res.add(p.coeff(k).multiply(k));
    }
    return res;
  }

  /**
   * Replaces the power series sum of <code>a_n*x^n</code> by sum of <code>a_n*x^n/n</code> for <code>n &gt;= 1</code>.
   * @param p polynomial
   * @return copy with replaced coefficients
   */
  public Polynomial<Q> divideByExponent(final Polynomial<Q> p) {
    final Polynomial<Q> res = new Polynomial<>("x", Q.ZERO, Q.ONE);
    res.add(p.coeff(0));
    for (int k = 1; k <= p.degree(); ++k) {
      res.add(p.coeff(k).divide(k));
    }
    return res;
  }

  /**
   * Replaces the power series sum of <code>a_n*x^n</code> by sum of <code>a_n^n*x^n</code>.
   * @param p polynomial
   * @return copy with replaced coefficients
   */
  public Polynomial<Q> powerByExponent(final Polynomial<Q> p) {
    final Polynomial<Q> res = new Polynomial<>("x", Q.ZERO, Q.ONE);
    for (int k = 0; k <= p.degree(); ++k) {
      res.add(p.coeff(k).pow(k));
    }
    return res;
  }

  /**
   * Term-wise division of two polynomials.
   * @param a first polynomial
   * @param b second polynomial
   * @return "quotient" polynomial
   */
  public Polynomial<Q> dotQuotient(final Polynomial<Q> a, final Polynomial<Q> b) {
    final Polynomial<Q> res = new Polynomial<>("x", Q.ZERO, Q.ONE);
    for (int k = 0; k <= Math.min(a.degree(), b.degree()); ++k) {
      res.add(a.coeff(k).divide(b.coeff(k)));
    }
    return res;
  }

  /**
   * Compute the next term of the sequence, including any zeroes that are left out by <code>next()</code>.
   * @return next coefficient of the generating function
   */
  private Q compute() {
    // now perform a statement like "mA = RING.add(RING.one(), RING.multiply(RING.x(), RING.pow(RING.substitute(mA, RING.multiply(RING.x(), mA, mN), mN), mExpon, mN), mN));"
    // for example: A143046 poly -p "[[0],[1],[0,-1]]" -x ",p1,p2,sub,^3,<1,+"; G.f. satisfies A(x) = 1 + x*A(-x)^3.
    final int m = mN + mDist; // Number of terms to expand to
    for (int iseq = 0; iseq < mTerms.size(); ++iseq) {
      advanceSeq(iseq);
    }
    int ipost = 0;
    int top = -1; // index of top element of <code>mStack</code>. Initially, the stack is empty.
    while (ipost < mPostLen) { // scan over the operands and operators
      final int ix = mPostInts[ipost++];
      if (sDebug >= 2 && top >= 0) {
        debugStack(ix, top, "before");
      }
      switch (ix) { //!
        // operands
        case 0:  // "A"  A(x), the currently accumulated Polynomial mA for the generating function
          mStack.set(++top, mA);
          break;
        case 1:  // "i"  an integer constant >= 0
          mStack.set(++top, Polynomial.create(new Q(mPostInts[ipost++])));
          break;
        case 2:  // "p"  mPolys[$1], one of the predefined polynomials, numbered p0, p1, ...
          mStack.set(++top, mPolys.get(mPostInts[ipost++]));
          break;
        case 3:  // "x"  the monic polynomial x
          mStack.set(++top, RING.x());
          break;
        case 4:  // "<"  shift x, multiply by some power of x or divide if negative
          mStack.set(top, RING.shift(mStack.get(top), mPostInts[ipost++]));
          break;
        case 5:  // "^"  exponent on the stack
          --top;
          mStack.set(top, RING.pow(mStack.get(top), Long.parseLong(mStack.get(top + 1).toString()), m));
          break;
        case 6:  // "^i"  integer exponent e
          mStack.set(top, RING.pow(mStack.get(top), mPostInts[ipost++], m));
          break;
        case 7:  // "^q",  rational exponent q=num/den
          mStack.set(top, RING.pow(mStack.get(top), new Q(mPostInts[ipost], mPostInts[ipost + 1]), m));
          ipost += 2;
          break;
        case 8:  // "sub"  replace the current top element by a substitution
          mStack.set(top, RING.substitute(mA, mStack.get(top), m));
          break;
//      case 43: // "dup"  push a copy of the current top element
//        ++top;
//        mStack.set(top, mStack.get(top - 1));
//        break;

        // arithmetic operations with 2 operands on the stack
        case 9:  // "+"
          --top;
          mStack.set(top, RING.add(mStack.get(top), mStack.get(top + 1)));
          break;
        case 10:  // "-"
          --top;
          mStack.set(top, RING.subtract(mStack.get(top), mStack.get(top + 1)));
          break;
        case 11:  // "*"
          --top;
          mStack.set(top, RING.multiply(mStack.get(top), mStack.get(top + 1), m + 1));
          break;
        case 12:  // "/"
          --top;
          mStack.set(top, RING.series(mStack.get(top), mStack.get(top + 1), m));
          break;

        // other two argument functions
        case 13:  // "agm"
          --top;
          mStack.set(top, RING.agm(mStack.get(top), mStack.get(top + 1), m));
          break;

        // operations with 1 operand
        case 14:  // "neg"  replace the current top element by its negation
          mStack.set(top, RING.negate(mStack.get(top)));
          break;
        case 15:  // "abs"
          mStack.set(top, RING.abs(mStack.get(top)));
          break;
        case 16:  // "sqrt"
          mStack.set(top, RING.sqrt(mStack.get(top), m));
          break;
        case 17:  // "exp"
          mStack.set(top, RING.exp(mStack.get(top), m));
          break;
        case 18:  // "log"
          mStack.set(top, RING.log(mStack.get(top), m));
          break;
        case 19:  // "eta"
          mStack.set(top, RING.eta(mStack.get(top), m));
          break;

        // Trig
        case 20:  // "cosh"
          mStack.set(top, RING.cosh(mStack.get(top), m));
          break;
        case 21:  // "cos"
          mStack.set(top, RING.cos(mStack.get(top), m));
          break;
        case 22:  // "coth"
          mStack.set(top, RING.series(RING.one(), RING.tanh(mStack.get(top), m), m));
          break;
        case 23:  // "cot"
          mStack.set(top, RING.series(RING.one(), RING.tan(mStack.get(top), m), m));
          break;
        case 24:  // "csch"
          mStack.set(top, RING.series(RING.one(), RING.sinh(mStack.get(top), m), m));
          break;
        case 25:  // "csc"
          mStack.set(top, RING.series(RING.one(), RING.sin(mStack.get(top), m), m));
          break;
        case 26:  // "sech"
          mStack.set(top, RING.sech(mStack.get(top), m));
          break;
        case 27:  // "sec"
          mStack.set(top, RING.sec(mStack.get(top), m));
          break;
        case 28:  // "sinh"
          mStack.set(top, RING.sinh(mStack.get(top), m));
          break;
        case 29:  // "sin"
          mStack.set(top, RING.sin(mStack.get(top), m));
          break;
        case 30:  // "tanh"
          mStack.set(top, RING.tanh(mStack.get(top), m));
          break;
        case 31:  // "tan"
          mStack.set(top, RING.tan(mStack.get(top), m));
          break;

        // Inverse trig
        case 32:  // "asin"
          mStack.set(top, RING.asin(mStack.get(top), m));
          break;
        case 33:  // "atan"
          mStack.set(top, RING.atan(mStack.get(top), m));
          break;
        case 34:  // "acosh"
          mStack.set(top, RING.acosh(mStack.get(top), m));
          break;
        case 35:  // "asinh"
          mStack.set(top, RING.asinh(mStack.get(top), m));
          break;
        case 36:  // "atanh"
          mStack.set(top, RING.atanh(mStack.get(top), m));
          break;
        case 37:  // "dif"  replace the current top element by its derivative
          mStack.set(top, RING.diff(mStack.get(top)));
          break;
        case 38:  // "int"  replace the current top element by its formal integral
          mStack.set(top, RING.integrate(mStack.get(top)).truncate(m));
          break;

        case 39:  // "inv"  replace the current top element te by 1/te
          mStack.set(top, RING.inverse(mStack.get(top)));
          break;
        case 40:  // "rev"  replace the current top element by its series reversion
          mStack.set(top, RING.reversion(mStack.get(top), m));
          break;
        case 41:  // "lambertW"  normal definition
          mStack.set(top, RING.lambertW(mStack.get(top), m));
          break;
        case 42:  // "lambNegW"  workaround if only the "negated" version works - normally this should be identical with <code>lambertW</code>
          mStack.set(top, RING.negate(RING.lambertW(mStack.get(top), m)));
          break;
        case 43:  // "n"  push the current index
          mStack.set(++top, Polynomial.create(new Q(mN)));
          break;
        case 44:  // "q" -same as x, for eta products
          mStack.set(++top, RING.x());
          break;
        case 45:  // "S"  1st additional g.f. as a sequence
        case 55:  // "B"  1st additional g.f. as a sequence
          mStack.set(top, RING.substitute(mTerms.get(0), mStack.get(top), m));
          break;
        case 46:  // "T"  2nd additional g.f. as a sequence
        case 56:  // "C"  2nd additional g.f. as a sequence
          mStack.set(top, RING.substitute(mTerms.get(1), mStack.get(top), m));
          break;
        case 47:  // "U"  3rd additional g.f. as a sequence
        case 57:  // "D"  3rd additional g.f. as a sequence
          mStack.set(top, RING.substitute(mTerms.get(2), mStack.get(top), m));
          break;
        case 48:  // "V"  4th additional g.f. as a sequence
        case 58:  // "E"  4th additional g.f. as a sequence
          mStack.set(top, RING.substitute(mTerms.get(3), mStack.get(top), m));
          break;
        case 49:  // "besselI"
          --top;
          mStack.set(top, Series.BESSEL_I.s(Long.parseLong(mStack.get(top).toString()), m, mStack.get(top + 1)));
          break;
        case 50:  // "ellipticD"
          mStack.set(top, Series.ELLIPTIC_D.s(m, mStack.get(top)));
          break;
        case 51:  // "ellipticE"
          mStack.set(top, Series.ELLIPTIC_E.s(m, mStack.get(top)));
          break;
        case 52:  // "ellipticK"
          mStack.set(top, Series.ELLIPTIC_K.s(m, mStack.get(top)));
          break;
        case 53:  // "pow" - exponent is no Q constant; [top-1],log,[top],*,exp -> [top-1]
          --top;
          mStack.set(top, RING.exp(RING.multiply(RING.log(mStack.get(top), m), mStack.get(top + 1), m), m));
          break;
        case 54:  // ">"  shift x, divide by some power of x or multiply if negative
          mStack.set(top, RING.shift(mStack.get(top), -mPostInts[ipost++]));
          break;
        case 59:  // ".*" - dot product, hadamardMultiply: multiply coefficients
          --top;
          mStack.set(top, RING.hadamardMultiply(mStack.get(top), mStack.get(top + 1)));
          break;
        case 60:  // "./" - dot quotient: divide coefficients
          --top;
          mStack.set(top, dotQuotient(mStack.get(top), mStack.get(top + 1)));
          break;
        case 61:  // "*n!" - serlaplace
          mStack.set(top, RING.serlaplace(mStack.get(top)));
          break;
        case 62:  // "/n!" - serlaplace
          mStack.set(top, makeEgf(mStack.get(top)));
          break;
        case 63:  // "*n" - multiply by exponent
          mStack.set(top, multiplyByExponent(mStack.get(top)));
          break;
        case 64:  // "/n" - divide by exponent for e >= 1
          mStack.set(top, divideByExponent(mStack.get(top)));
          break;
        case 65:  // "^n" - power by exponent
          mStack.set(top, powerByExponent(mStack.get(top)));
          break;
        default: // should not occur with proper postfix expressions
          throw new RuntimeException("invalid postfix code " + ix);
// The following cannot be done exactly over the rationals or are not yet available
//            case "acsch":
//              mStack.set(top, RING.acsch(mStack.get(top), m));
//              break;
//            case "acsc":
//              mStack.set(top, RING.acsc(mStack.get(top), m));
//              break;
//            case "acos":
//              mStack.set(top, RING.acos(mStack.get(top), m));
//              break;
//            case "acoth":
//              mStack.set(top, RING.acoth(mStack.get(top), m));
//              break;
//            case "acot":
//              mStack.set(top, RING.acot(mStack.get(top), m));
//              break;
//            case "asech":
//              mStack.set(top, RING.asech(mStack.get(top), m));
//              break;
//            case "asec":
//              mStack.set(top, RING.asec(mStack.get(top), m));
//              break;
      } //! switch
      if (sDebug >= 3) {
        debugStack(ix, top, "after");
      }
    } // while
    // mTop should be 0 here
    mA = mStack.get(top).truncate(mN + mDist);
    Q result = mA.coeff(mN);
    if ((mGfType & EGF) != 0) {
      if (mN > 0) {
        mFactorial = mFactorial.multiply(mN);
      }
      result = result.multiply(mFactorial);
      if (sDebug >= 1) {
        System.out.println("# mFactorial=" + mFactorial + ", mN=" + mN);
      }
    }
    return result;
  } // compute

  private void fillMap() { //!
    // Updated by gits/joeis-lite/internal/fischer/reflect/update_PolynomialFieldSequence.pl at 2025-03-04 21:37
    POST_MAP.put("*", 11);
    POST_MAP.put("+", 9);
    POST_MAP.put("-", 10);
    POST_MAP.put("/", 12);
    POST_MAP.put("<", 4);
    POST_MAP.put("A", 0);
    POST_MAP.put("^", 5);
    POST_MAP.put("^i", 6);
    POST_MAP.put("^q", 7);
    POST_MAP.put("abs", 15);
    POST_MAP.put("acosh", 34);
    POST_MAP.put("agm", 13);
    POST_MAP.put("asin", 32);
    POST_MAP.put("asinh", 35);
    POST_MAP.put("atan", 33);
    POST_MAP.put("atanh", 36);
    POST_MAP.put("cos", 21);
    POST_MAP.put("cosh", 20);
    POST_MAP.put("cot", 23);
    POST_MAP.put("coth", 22);
    POST_MAP.put("csc", 25);
    POST_MAP.put("csch", 24);
    POST_MAP.put("dif", 37);
    POST_MAP.put("eta", 19);
    POST_MAP.put("exp", 17);
    POST_MAP.put("i", 1);
    POST_MAP.put("int", 38);
    POST_MAP.put("inv", 39);
    POST_MAP.put("lambNegW", 42);
    POST_MAP.put("lambertW", 41);
    POST_MAP.put("log", 18);
    POST_MAP.put("neg", 14);
    POST_MAP.put("p", 2);
    POST_MAP.put("rev", 40);
    POST_MAP.put("sec", 27);
    POST_MAP.put("sech", 26);
    POST_MAP.put("sin", 29);
    POST_MAP.put("sinh", 28);
    POST_MAP.put("sqrt", 16);
    POST_MAP.put("sub", 8);
    POST_MAP.put("tan", 31);
    POST_MAP.put("tanh", 30);
    POST_MAP.put("x", 3);
    POST_MAP.put("n", 43);
    POST_MAP.put("q", 44); // same as "x"
    POST_MAP.put("S", 45);
    POST_MAP.put("T", 46);
    POST_MAP.put("U", 47);
    POST_MAP.put("V", 48);
    POST_MAP.put("besselI", 49);  // only besselI(0, x)
    POST_MAP.put("ellipticD", 50);
    POST_MAP.put("ellipticE", 51);
    POST_MAP.put("ellipticK", 52);
    POST_MAP.put("pow", 53);  // if exponent is polynomimal
    POST_MAP.put(">", 54);
    POST_MAP.put("B", 55);
    POST_MAP.put("C", 56);
    POST_MAP.put("D", 57);
    POST_MAP.put("E", 58);
    POST_MAP.put(".*", 59);   // elementwise "*", dot product
    POST_MAP.put("./", 60);   // elementwise "/"
    POST_MAP.put("*n!", 61);  // serlaplace
    POST_MAP.put("/n!", 62);
    POST_MAP.put("*n", 63);  // multiply by exponent 
    POST_MAP.put("/n", 64);  // divide by exponent for e >= 1
    POST_MAP.put("^n", 65);  // power by exponent
  } //! fillMap

  @Override
  public Q nextQ() {
    if (mFactor == 1) { // return all terms - faster for most cases
      ++mN;
      return compute();
    } else { // return only terms with index mN mod mFactor == mModulus
      while (true) {
        ++mN;
        final Q result = compute();
        if (mN % mFactor == mModulus) {
          return result;
        }
      } // while
    }
  } // nextQ

  @Override
  public Z next() {
    final Q result = nextQ();
    return ((mGfType & DEN_OGF) == 0) ? result.num() : result.den();
  } // next

  public String[] getPostfix() {
    return mPostStrings;
  }

  public int getGfType() {
    return mGfType;
  }
}
