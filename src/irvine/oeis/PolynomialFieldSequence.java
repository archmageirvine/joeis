package irvine.oeis;

import java.util.ArrayList;
import java.util.Arrays;
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
 * @author Georg Fischer
 */
public class PolynomialFieldSequence extends AbstractSequence {

  protected static int sDebug = 0;
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  /** Constant indicating an ordinary generating function. */
  protected static final int OGF = 0;
  /** Constant indicating an exponential generating function. */
  protected static final int EGF = 1;
  private final String[] mPostfix; // list of operands and operators
  private final int mDist; // additional degree
  private final int mGfType; // type of the generating function: 0 = ordinary, 1 = exponential
  private final int mModulus; // for example 1 for odd, 0 for even if factor = 2
  private final int mFactor; //  multiplicity when zeroes are left out

  private final List<Polynomial<Q>> mPolys; // Polynomials referenced in the postfix string as "p0" (the initial value), "p1", "p2" and so on.
  private int mN; // index of the next sequence element to be computed
  private Polynomial<Q> mA; // the generating function A(x)
  private final List<Polynomial<Q>> mStack; // stack where the final expression is computed
  private Z mFactorial;

  /**
   * Compute successive coefficients for a generating function A(x) defined by a condition that A(x) must satisfy.
   * @param offset first index
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character
   */
  public PolynomialFieldSequence(final int offset, final String postfix) {
    this(offset, "[[1]]", postfix, 0, OGF, 1, 1);
  }

  /**
   * Compute successive coefficients for a generating function A(x) defined by a condition that A(x) must satisfy.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix) {
    this(offset, polys, postfix, 0, OGF, 1, 1);
  }

  /**
   * Compute successive coefficients for a generating function A(x) defined by a condition that A(x) must satisfy.
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
   * Compute successive coefficients for a generating function A(x) defined by a condition that A(x) must satisfy.
   * @param offset first index
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]"
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character in
   * the String, for example A213091 <code>satisfies: A(x) = 1 + x/A(-x*A(x)^2)</code> -&gt; <code>",1,x,A,^2,<1,neg,sub,/,+"</code>
   * @param dist additional degree
   * @param gfType type of the generating function: 0 = ordinary, 1 = exponential
   * @param modulus for example 1 for odd, 0 for even if factor = 2
   * @param factor multiplicity when zeroes are left out
   */
  public PolynomialFieldSequence(final int offset, final String polys, final String postfix,
                                 final int dist, final int gfType, final int modulus, final int factor) {
    super(offset);
    mDist = dist;
    mGfType = gfType;
    mModulus = modulus;
    mFactor = factor;

    final String post = trimQuotes(postfix);
    mPostfix = post.substring(1).split(Pattern.quote(post.substring(0, 1)));
    if (sDebug >= 1) {
      System.out.print("# mPostfix=");
      for (final String s : mPostfix) {
        System.out.print(s + ";");
      }
      System.out.println();
    }
    mStack = new ArrayList<>(mPostfix.length);
    for (int k = 0; k < mPostfix.length; ++k) {
      mStack.add(null);
    } // for k

    final String[] polarr = trimQuotes(polys).split("]\\s*,\\s*\\["); // the individual vectors
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
    mN = offset - 1;
    mA = mPolys.get(0);
    if (sDebug >= 1) {
      System.out.println("# construct PolynomialFieldSequence: mN=" + mN + ", mA=" + mA + ", mDist=" + mDist + ", mGfType=" + mGfType);
    }
  } // Constructor

  /**
   * Return the inner content of a String without surrounding square brackets, quotes or apostrophes, with all spaces removed.
   * @param str full String
   * @return String with surrounding characters removed
   */
  protected static String trimQuotes(final String str) {
    int start = 0;
    while (start < str.length() && (str.charAt(start) == '[' || str.charAt(start) == '"' || str.charAt(start) == '\'')) {
      ++start;
    }
    int behind = str.length();
    while (behind > start && (str.charAt(behind - 1) == ']' || str.charAt(behind - 1) == '"' || str.charAt(behind - 1) == '\'')) {
      --behind;
    }
    return str.substring(start, behind).replaceAll(" ", "");
  }

  /**
   * Print the contents of the stack in readable form.
   * @param pfix current postfix element
   * @param top index of top stack element
   * @param str call point
   */
  protected void debugStack(final String pfix, final int top, final String str) {
    System.out.print("# pfix=" + pfix + " \t");
    for (int is = 0; is <= top + 1; ++is) {
      if (mStack.get(is) != null) {
        System.out.print(" " + (is == top ? "top" : String.valueOf(is)) + ":" + mStack.get(is).toString());
      }
    }
    System.out.println("\t" + str);
  }

  // Find operator part of the token (i.e., up to the first digit, if any)
  private int getTokenLength(final String pfix) {
    int k = 0;
    while (k < pfix.length() && !Character.isDigit(pfix.charAt(k))) {
      ++k;
    }
    return k;
  }

  /**
   * Compute the next term of the sequence, including any zeroes that are left out by <code>next()</code>.
   * @return next coefficient of the generating function
   */
  private Z compute() {
    // now perform a statement like "mA = RING.add(RING.one(), RING.multiply(RING.x(), RING.pow(RING.substitute(mA, RING.multiply(RING.x(), mA, mN), mN), mExpon, mN), mN));"
    // for example: A143046 poly -p "[[0],[1],[0,-1]]" -x ",p1,p2,sub,^3,<1,+"; G.f. satisfies A(x) = 1 + x*A(-x)^3.
    int ipfix = 0;
    int top = -1; // index of top element of <code>mStack</code>. Initially, the stack is empty.
    while (ipfix < mPostfix.length) { // scan over the operands and operators
      final String pfix = mPostfix[ipfix++];
      if (sDebug >= 2 && top >= 0) {
        debugStack(pfix, top, "before");
      }
      if (Character.isDigit(pfix.charAt(0))) { // operand that is a single natural number
        mStack.set(++top, Polynomial.create(new Q(Integer.parseInt(pfix))));
      } else {
        final int m = mN + mDist; // Number of terms to expand to
        // Operations are either single strings of constructions like "p(\d+)"
        switch (pfix.substring(0, getTokenLength(pfix))) {
          // operands
          case "A": // this means A(x), the currently accumulated Polynomial mA for the generating function
            mStack.set(++top, mA);
            break;
          case "p": // "p(\d+)"  = mPolys[$1], one of the predefined polynomials, numbered p0, p1, ...
            mStack.set(++top, mPolys.get(Integer.parseInt(pfix.substring(1))));
            break;
          case "x": // the monic polynomial x
            mStack.set(++top, RING.x());
            break;

          // operations with 1 operand
          case "neg": // "neg", replace the current top element by its negation
            mStack.set(top, RING.negate(mStack.get(top)));
            break;
          case "sqrt":
            mStack.set(top, RING.sqrt(mStack.get(top), m));
            break;
          case "exp": // "exp", preplace the current top element te by exp(te)
            mStack.set(top, RING.exp(mStack.get(top), m));
            break;
          case "log": // "log", replace the current top element te by log(te)
            mStack.set(top, RING.log(mStack.get(top), m));
            break;

          // Trig
          case "cosh":
            mStack.set(top, RING.cosh(mStack.get(top), m));
            break;
          case "cos":
            mStack.set(top, RING.cos(mStack.get(top), m));
            break;
          case "coth":
            mStack.set(top, RING.series(RING.one(), RING.tanh(mStack.get(top), m), m));
            break;
          case "cot":
            mStack.set(top, RING.series(RING.one(), RING.tan(mStack.get(top), m), m));
            break;
          case "csch":
            mStack.set(top, RING.series(RING.one(), RING.sinh(mStack.get(top), m), m));
            break;
          case "csc":
            mStack.set(top, RING.series(RING.one(), RING.sin(mStack.get(top), m), m));
            break;
          case "sech":
            mStack.set(top, RING.sech(mStack.get(top), m));
            break;
          case "sec":
            mStack.set(top, RING.sec(mStack.get(top), m));
            break;
          case "sinh":
            mStack.set(top, RING.sinh(mStack.get(top), m));
            break;
          case "sin":
            mStack.set(top, RING.sin(mStack.get(top), m));
            break;
          case "tanh":
            mStack.set(top, RING.tanh(mStack.get(top), m));
            break;
          case "tan":
            mStack.set(top, RING.tan(mStack.get(top), m));
            break;

          // Inverse trig
          case "asin":
            mStack.set(top, RING.asin(mStack.get(top), m));
            break;
          case "atan":
            mStack.set(top, RING.atan(mStack.get(top), m));
            break;
          case "acosh":
            mStack.set(top, RING.acosh(mStack.get(top), m));
            break;
          case "asinh":
            mStack.set(top, RING.asinh(mStack.get(top), m));
            break;
          case "atanh":
            mStack.set(top, RING.atanh(mStack.get(top), m));
            break;
          // The following cannot be done exactly over the rationals or are not yet available
//              case "acsch":
//                mStack.set(top, RING.acsch(mStack.get(top), m));
//                break;
//              case "acsc":
//                mStack.set(top, RING.acsc(mStack.get(top), m));
//                break;
//              case "acos":
//                mStack.set(top, RING.acos(mStack.get(top), m));
//                break;
//              case "acoth":
//                mStack.set(top, RING.acoth(mStack.get(top), m));
//                break;
//              case "acot":
//                mStack.set(top, RING.acot(mStack.get(top), m));
//                break;
//              case "asech":
//                mStack.set(top, RING.asech(mStack.get(top), m));
//                break;
//              case "asec":
//                mStack.set(top, RING.asec(mStack.get(top), m));
//                break;

          case "dif": // "dif", replace the current top element by its derivative
            mStack.set(top, RING.diff(mStack.get(top)));
            break;
          case "int": // "int", replace the current top element by its formal integral
            mStack.set(top, RING.integrate(mStack.get(top)).truncate(m));
            break;

          case "inv": // "inv", replace the current top element te by 1/te
            mStack.set(top, RING.inverse(mStack.get(top)));
            break;
          case "rev": // "rev", replace the current top element by its series reversion
            mStack.set(top, RING.reversion(mStack.get(top), m));
            break;
          case "sub": // "sub", replace the current top element by a substitution
            mStack.set(top, RING.substitute(mA, mStack.get(top), m));
            break;
          case "lambertW": // current definition of LambertW works
            mStack.set(top, RING.lambertW(mStack.get(top), m));
            break;
          case "lambNegW": // workaround if only the "negated" version works - normally this should be identical with <code>lambertW</code>
            mStack.set(top, RING.negate(RING.lambertW(mStack.get(top), m)));
            break;

          case "<": // "<(\d+)" = shift x -> x^$1 (may be negative)
            mStack.set(top, RING.shift(mStack.get(top), (pfix.length() <= 1) ? 1 : Integer.parseInt(pfix.substring(1))));
            break;
          case "^": // P, m -> P^m, or "^(\d+)" P -> P^$1
            if (pfix.length() == 1) { // 2 operands
              --top;
              mStack.set(top, RING.pow(mStack.get(top), Long.parseLong(mStack.get(top + 1).toString()), m));
            } else { // operation contains the 2nd operand
              if (pfix.indexOf('/') >= 0) { // e.g. "^2/3"
                mStack.set(top, RING.pow(mStack.get(top), new Q(pfix.substring(1)), m));
              } else {
                mStack.set(top, RING.pow(mStack.get(top), Long.parseLong(pfix.substring(1)), m));
              }
            }
            break;

          // arithmetic operations with 2 operands
          case "+":
            --top;
            mStack.set(top, RING.add(mStack.get(top), mStack.get(top + 1)));
            break;
          case "-":
            --top;
            mStack.set(top, RING.subtract(mStack.get(top), mStack.get(top + 1)));
            break;
          case "*":
            --top;
            mStack.set(top, RING.multiply(mStack.get(top), mStack.get(top + 1), m + 1));
            break;
          case "/":
            --top;
            mStack.set(top, RING.series(mStack.get(top), mStack.get(top + 1), m));
            break;

          // other two argument functions
          case "agm":
            --top;
            mStack.set(top, RING.agm(mStack.get(top), mStack.get(top + 1), m));
            break;

          default: // should not occur with proper postfix expressions
            throw new RuntimeException("invalid postfix code " + pfix);
        } // switch
      }
      if (sDebug >= 3) {
        debugStack(pfix, top, "after");
      }
    } // while
    // mTop should be 0 here
    mA = mStack.get(top).truncate(mN + mDist);
    Q result = mA.coeff(mN);
    if (mGfType == EGF) {
      if (mN > 0) {
        mFactorial = mFactorial.multiply(mN);
      }
      result = result.multiply(mFactorial);
      if (sDebug >= 1) {
        System.out.println("# mFactorial=" + mFactorial + ", mN=" + mN);
      }
    }
    return result.num();
  } // compute

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

  /**
   * Get the postfix polish notation.
   * @return list of operands and operations.
   */
  public String[] getPostfix() {
    return mPostfix;
  }
}
