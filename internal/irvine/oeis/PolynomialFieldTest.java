package irvine.oeis;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Test the computation of the coefficients of a generating function A(x) 
 * given by some equation that is satisfied by A(x).
 * @author Georg Fischer
 */
public final class PolynomialFieldTest {

  static int sDebug = 0;
  private final HashMap<String, Integer> mPrios = new HashMap<>(16);
  private int mPrio;
  private final String mSep = ","; // default separator for postfix polish notation

  /**
   * Store priorities for various operators in the HashMap
   */
  private void assignPrios() {
    mPrio = 0;
    setPrio("+", "-");
    setPrio("*", "/");
    setPrio("^");
    setPrio("\'");
    setPrio("~", "(", ")"); // unary minus
  } // assignPrios

  /**
   * Store priorities for various operators in the HashMap
   */
  private void setPrio(final String... opers) {
    ++mPrio;
    for (final String oper : opers) {
      mPrios.put(oper, mPrio);
    }
  } // setPrio

  /**
   * Empty constructor.
   */
  private PolynomialFieldTest() {
    assignPrios();
  }

  /**
   * Convert an expression into a postfix polish string of operands and operations.
   * @param expr the expression to be parsed
   * @return postfix polish notation
   */
  private String getPostfix(final String expr) {
    return mSep;
  } // getPostfix

  /**
   * Reconstruct the equation from the postfix string.
   * @param polys array of polynomials, the coefficients of <code>x^i, i=0..m</code>.
   * are given as comma-separated lists, enclosed in square brackets, for example "[[0],[0,1,2],[17,0,18]]".
   * @param postfix the equation with operands and operators in postfix polish notation, separated by the first character.
   */
  private String buildInfix(final String polys, final String postfix) {
    final int ipfix = 0;
    final int top = -1; // index of top element of <code>mStack</code>. Initially, the stack is empty.
/*
      while (ipfix < mPostfix.length) { // scan over the operaands and operators
        String pfix = mPostfix[ipfix++];
        if (sDebug >= 2 && top >= 0) {
          debugStack(pfix, top, "before");
        }
        final char ch = pfix.charAt(0);
        if (ch >= '0' && ch <= '9') { // operand that is a single natural number
          final ArrayList<Q> num = new ArrayList<>();
          num.add(new Q(Integer.parseInt(pfix)));
          mStack.set(++top, RING.create(num));
        } else {
          switch (ch) { // discriminate with the first character
            default: // should not occur with proper postfix expressions
              throw new RuntimeException("invalid postfix code " + pfix);

          // operands
            case 'A': // this means A(x), the currently accumulated Polynomial mA for the generating function
              mStack.set(++top, mA);
              break;
            case 'p': // "p(\d+)"  = mPolys[$1], one of the predefined polynomials, numbered p0, p1, ...
              mStack.set(++top, mPolys.get(Integer.parseInt(pfix.substring(1))));
              break;
          
          // operations with 1 operand
            case 'd': // "dif", replace the current top element by its derivative
              mStack.set(top, RING.diff(mStack.get(top)));
              break;
            case 'e': // "exp", preplace the current top element te by exp(te)
              mStack.set(top, RING.exp(mStack.get(top), mN + mDist));
              break;
            case 'i': 
              switch (pfix) {
                case "inv": // "inv", replace the current top element te by 1/te
                  mStack.set(top, RING.inverse(mStack.get(top)));
                  break;
                case "int": // "int", replace the current top element by its formal integral
                  mStack.set(top, RING.integrate(mStack.get(top)));
                  break;
                default:
                  throw new RuntimeException("invalid postfix code with \"i\":" + pfix);
              }
              break;
            case 'l': // "log", preplace the current top element te by log(te)
              mStack.set(top, RING.log(mStack.get(top), mN + mDist));
              break;
            case 'n': // "neg", replace the current top element by its negation
              mStack.set(top, RING.negate(mStack.get(top)));
              break;
            case 'r': // "rev", replace the current top element by its series reversion
              mStack.set(top, RING.reversion(mStack.get(top), mN + mDist));
              break;
            case 's': 
              switch(pfix) {
                case "sub": // "sub", replace the current top element by a substitution
                  mStack.set(top, RING.substitute(mA, mStack.get(top), mN + mDist));
                  break;
                case "sin":
                  mStack.set(top, RING.sin(mStack.get(top), mN + mDist));
                  break;
                case "sqrt":
                  mStack.set(top, RING.sqrt(mStack.get(top), mN + mDist));
                  break;
                default:
                  throw new RuntimeException("invalid postfix code with \"s\":" + pfix);
              }
              break;
            case '<': // "<(\d+)" = shift x -> x^$1 (may be negative)
              mStack.set(top, RING.shift(mStack.get(top), (pfix.length() <= 1) ? 1 : Integer.parseInt(pfix.substring(1))));
              break;
            case '^': // P, m -> P^m, or "^(\d+)" P -> P^$1
              if (pfix.length() == 1) { // 2 operands
                --top;
                mStack.set(top, RING.pow(mStack.get(top), Long.valueOf(mStack.get(top + 1).toString()), mN + mDist));
              } else { // operation contains the 2nd operand
                mStack.set(top, RING.pow(mStack.get(top), Long.parseLong(pfix.substring(1)), mN + mDist));
              }
              break;

          // arithmetic operations with 2 operands
            case '+':
              --top;
              mStack.set(top, RING.add(mStack.get(top), mStack.get(top + 1)));
              break;
            case '-':
              --top;
              mStack.set(top, RING.subtract(mStack.get(top), mStack.get(top + 1)));
              break;
            case '*':
              --top;
              mStack.set(top, RING.multiply(mStack.get(top), mStack.get(top + 1))); // , mN + mDist);
              break;
            case '/':
              --top;
              mStack.set(top, RING.series(mStack.get(top), mStack.get(top + 1), mN + mDist));
              break;
          } // switch
        }
        if (sDebug >= 3) {
          debugStack(pfix, top, "after");
        }
      } // while
*/
    // mTop should be 0 here
/*
    mA = mStack.get(top);
    Q result = mA.coeff(mN);
    if (mGfType == EGF) {
      result = result.multiply(mFactorial);
      if (mN > 0) {
        mFactorial = mFactorial.multiply(mN);
      }
    }
*/
    return "";
  } // build

  /**
   * Print a message for the parameter usage and exit.
   */
  private static void usage() {
    System.out.println("Usage: java -cp joeis.jar irvine.oeis.PolynomialFieldTest"
        + " [polys] postfix [-b] [-d mode] [-i dist] [-n noterms] [-o offset] [-t gftype]");
    System.exit(1);
  }

  /**
   * Main method, generate the coefficients of a generating function.
   * @param args command line arguments:
   * <ul>
   * <li>polyList, list of vectors for polynomials in x (default "[[1]]")</li>
   * <li>expression in postfix notation (mandatory)</li>
   * <li>-b print in b-file format instead of comma separated list (default false)</li>
   * <li>-d level debugging level (default 0=none), 1=some, 2=more</li>
   * <li>-i additional degree (default 0)</li>
   * <li>-n numTerms number of terms to be computed (default: 16)</li>
   * <li>-o offset, first index (default 0)</li>
   * <li>-t type of the generating function: 0 = ordinary (default), 1 = exponential</li>
   * </ul>
   */
  public static void main(final String[] args) {
    boolean bfile = false;
    if (args.length == 0) {
      usage();
      return;
    }
    int debug = 0;
    int dist = 0;
    int gfType = 0;
    int numTerms = 16;
    int offset = 0;
    int iarg = 0;
    String polyList = "[[1]]";
    String postfix  = null;
    if (args.length == 1) {
      postfix  = args[iarg++];
    } else {
      if (!args[iarg].startsWith("-")) {
        if (!args[iarg + 1].startsWith("-")) {
          polyList   = args[iarg++];
        }
        postfix = args[iarg++];
      } else {
        usage();
        return;
      }
      while (iarg < args.length) { // consume all arguments
        final String opt = args[iarg++];
        try {
          switch (opt) {
            case "-b":
              bfile = true;
              break;
            case "-d":
              debug = Integer.parseInt(args[iarg++]);
              break;
            case "-i":
              dist = Integer.parseInt(args[iarg++]);
              break;
            case "-n":
              numTerms = Integer.parseInt(args[iarg++]);
              break;
            case "-o":
              offset = Integer.parseInt(args[iarg++]);
              break;
            case "-t":
              gfType = Integer.parseInt(args[iarg++]);
              break;
            default:
              System.err.println("??? invalid option: \"" + opt + "\"");
              break;
          }
        } catch (final RuntimeException exc) { // take default
        }
      } // while args
    } // more than 1 argument

    PolynomialFieldSequence.sDebug = debug;
    final PolynomialFieldSequence prs = new PolynomialFieldSequence(offset, polyList, postfix, dist, gfType);
    int ind = offset - 1;
    while (--numTerms >= 0) {
      ++ind;
      final Z term = prs.next();
      if (bfile) {
        System.out.print(ind + " " + term.toString() + "\n");
      } else {
        System.out.print((ind == offset ? "" : ", ") + term.toString());
      }
    } // while
    System.out.println();
  } // main
}
