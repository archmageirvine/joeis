package irvine.oeis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * Compute the coefficients of a generating function A(x) given by some equation that is satisfied by A(x).
 * Suitable for generating functions expressible over the rationals.
 * See https://teherba.org/tehowiki/index.php/Expansion_of_polynomials.
 * @author Georg Fischer
 */
public class PolynomialFieldSequence extends AbstractSequence {

  protected static int sDebug;
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final HashMap<String, Integer> POST_MAP = new HashMap<>(64); // map a postfix string to an int for switch() statement

  /* Caution, the following are bitmasks, c.f. usage at the end of <code>compute()</code>: */
  /** Constant indicating the numerators of an ordinary generating function. */
  protected static final int OGF = 0;
  /** Constant indicating the numerators of an exponential generating function. */
  protected static final int EGF = 1;
  /** Constant indicating the denominators of an ordinary generating function. */
  protected static final int DEN_OGF = 4;
  /** Constant indicating the denominators of an exponential generating function. */
  protected static final int DEN_EGF = 5;

  private final String[] mPostStrings; // list of operands and operators
  private final int[] mPostInts; // list of operands and operators converted to integer codes
  private int mPostLen; // length of mPostInts array generated from the postfix String
  private final int mDist; // additional degree
  private final int mGfType; // type of the generating function: 0 = ordinary, 1 = exponential (integer or numerators), 4 ordinary, 5 exponential (denominators)
  private final int mModulus; // for example 1 for odd, 0 for even if factor = 2
  private final int mFactor; //  multiplicity when zeroes should be left out

  private final List<Polynomial<Q>> mPolys; // Polynomials referenced in the postfix string as "p0" (the initial polynomial), "p1", "p2" and so on.
  private final List<AbstractSequence> mSeqs; // sequences for additional generating functions referenced in the postfix string as "s0", "s1", "s2" and so on.
  private final ArrayList<Polynomial<Q>> mTerms; // terms of mSeqs[is]
  private final ArrayList<Integer> mNix; // index of next free elemen in mTerms
  private int mN; // index of the next sequence element to be computed
  private Polynomial<Q> mA; // the generating function A(x) to be computed
  private final List<Polynomial<Q>> mStack; // stack where the final expression is computed
  private Z mFactorial;

  {
    fillMap();
  }

  protected Polynomial<Q> getPoly(final int ix) {
    return mPolys.get(ix);
  }

  /**
   * Compute successive coefficients for a generating function A(x) defined by a condition that A(x) must satisfy.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character in
   * the String, for example A213091 <code>satisfies: A(x) = 1 + x/A(-x*A(x)^2)</code> -&gt; <code>",1,x,A,^2,<1,neg,sub,/,+"</code>
   * @param dist additional degree
   * @param gfType type of the generating function: 0 = ordinary, 1 = exponential (integer or numerators), 4 ordinary, 5 exponential (denominators)
   * @param modulus for example 1 for odd, 0 for even if factor = 2
   * @param factor multiplicity when zeroes should be left out
   * @param seqs list of optional sequences whose generating functions are used in the postfix expression
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix,
                                 final int dist, final int gfType, final int modulus, final int factor,
                                 final AbstractSequence... seqs) {
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
      } else if (pelem.length() >= 2 && Character.isDigit(pelem.charAt(1))) { // one of p, i, <, ^ with 1 or 2 additional int parameter(s)
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
    mSeqs = new ArrayList<AbstractSequence>();
    mTerms = new ArrayList<Polynomial<Q>>(); // denaoted by S, T, U, V
    mNix = new ArrayList<Integer>(); // indexed by S, T, U, V
    final int apos = polyString.indexOf('A');
    if (apos >= 0) { // with A-numbers at the end of the polynomials
      final String[] aNums = polyString.substring(apos).split("\\,"); // split into A-numbers
      polyString = polyString.substring(0, apos - 1); // keep polynomials only
      polyString = polyString.replaceAll(" *\\, *\\Z", ""); // remove trailing comma
      try {
        for (final String aNum : aNums) {
          final AbstractSequence seq = (AbstractSequence) SequenceFactory.sequence(aNum);
          final Q[] terms = new Q[mDist + 1];
          final int soff = seq.getOffset();
          int ix = 0;
          while (ix <= mDist) {
            terms[ix] = ix < soff ? Q.ZERO : Q.valueOf(seq.next());
            ++ix;
          }
          mNix.add(ix);
          mTerms.add(Polynomial.create(terms));
          mSeqs.add(seq);
        }
      } catch (final UnimplementedException exc) {
        System.err.println(exc.getMessage());
      }
    }
    for (AbstractSequence seq : seqs) { // and also from the trailing parameter list
      final Q[] terms = new Q[mDist + 1];
      final int soff = seq.getOffset();
      int ix = 0;
      while (ix <= mDist) {
        terms[ix] = ix < soff ? Q.ZERO : Q.valueOf(seq.next());
        ++ix;
      }
      mNix.add(ix);
      mTerms.add(Polynomial.create(terms));
      mSeqs.add(seq);
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
        Polynomial<Q> pseq = mTerms.get(iseq);
        final int exponent = mNix.get(iseq);
        pseq = RING.add(pseq, RING.monomial(Q.valueOf(mSeqs.get(iseq).next()), exponent));
        mNix.set(iseq, exponent + 1);
        // System.err.println("pseq[" + iseq + "] = " + pseq);
        mTerms.set(iseq, pseq);
      }
    }
    mN = offset - 1;
    mA = mPolys.get(0);
    if (sDebug >= 1) {
      System.out.println("# construct PolynomialFieldSequence: mN=" + mN + ", mA=" + mA + ", mDist=" + mDist + ", mGfType=" + mGfType);
    }
  } // Constructor

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
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix,
                                 final int dist, final int gfType) {
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
    this(offset, polys, postfix, dist, gfType, modulus, factor, new AbstractSequence[0]);
  }

  /**
   * Return the inner content of a String without surrounding square brackets, quotes or apostrophes, with all spaces removed.
   * @param str full String
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
   * @param pfix current postfix element
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
   * Compute the next term of the sequence, including any zeroes that are left out by <code>next()</code>.
   * @return next coefficient of the generating function
   */
  private Z compute() {
    // now perform a statement like "mA = RING.add(RING.one(), RING.multiply(RING.x(), RING.pow(RING.substitute(mA, RING.multiply(RING.x(), mA, mN), mN), mExpon, mN), mN));"
    // for example: A143046 poly -p "[[0],[1],[0,-1]]" -x ",p1,p2,sub,^3,<1,+"; G.f. satisfies A(x) = 1 + x*A(-x)^3.
    final int m = mN + mDist; // Number of terms to expand to
    for (int iseq = 0; iseq < mTerms.size(); ++iseq) {
      Polynomial<Q> pseq = mTerms.get(iseq);
      final int exponent = mNix.get(iseq);
      pseq = RING.add(pseq, RING.monomial(Q.valueOf(mSeqs.get(iseq).next()), exponent));
      mNix.set(iseq, exponent + 1);
      // System.err.println("pseq[" + iseq + "] = " + pseq);
      mTerms.set(iseq, pseq);
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
        case 4:  // "<"  shift x, multiply by some power of x
          mStack.set(top, RING.shift(mStack.get(top), mPostInts[ipost++]));
          break;
        case 5:  // "^"  exponent on the stack
          --top;
          mStack.set(top, RING.pow(mStack.get(top), Long.parseLong(mStack.get(top + 1).toString()), m));
          break;
        case 6:  // "^i"  integer exponent e
          mStack.set(top, RING.pow(mStack.get(top), mPostInts[ipost++], m));
          break;
        case 7:  // "^q"  rational exponent, num/den
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
        case 44:  // "catalan"  push catalan(top element) C:= proc(x) (1 - sqrt(1 - 4*x)) / (2*x) end;
          final Polynomial<Q> x14 = RING.subtract(Polynomial.create(Q.ONE), RING.multiply(mStack.get(top), Q.FOUR));
          final Polynomial<Q> x2 = RING.multiply(mStack.get(top), Q.TWO);
          // System.out.println("x14=" + x14 + ", x2= " + x2);
          mStack.set(++top, RING.series(RING.subtract(Polynomial.create(Q.ONE), RING.sqrt(x14, m)), x2, m));
          break;
        case 45:  // "S"  1st additional g.f. as a sequence
        case 46:  // "T"  2nd additional g.f. as a sequence
        case 47:  // "U"  3rd additional g.f. as a sequence
        case 48:  // "V"  4th additional g.f. as a sequence  
          // Caution, this code is dirty (dependant on the "45")!
          mStack.set(top, RING.substitute(mTerms.get(ix - 45), mStack.get(top), m));
          break;
        default: // should not occur with proper postfix expressions
          throw new RuntimeException("invalid postfix code " + ix);
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
    return ((mGfType & DEN_OGF) == 0) ? result.num() : result.den();
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
    POST_MAP.put("catalan", 44);
    POST_MAP.put("S", 45);
    POST_MAP.put("T", 46);
    POST_MAP.put("U", 47);
    POST_MAP.put("V", 48);
  } //! fillMap

  @Override
  public Z next() {
    if (mFactor == 1) { // faster for most cases
      ++mN;
      return compute();
    } else {
      while (true) {
        ++mN;
        final Z result = compute();
        if (mN % mFactor == mModulus) {
          return result;
        }
      } // while
    }
  } // next

  /* reflective methods */
  /**
   * Get the postfix polish notation.
   * @return list of operands and operations.
   */
  public String[] getPostfix() {
    return mPostStrings;
  }

  /**
   * Get the type of the generating function.
   * @return gfType.
   */
  public int getGfType() {
    return mGfType;
  }
}
