package irvine.factor.factor;

//import java.util.ArrayList;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Implements a two stage version of the <i>p</i>+1 factoring method.
 *
 * @author Sean A. Irvine
 */
public class PPlusOne extends AbstractFactorizer {

  /** Number of iterations to perform per gcd operation */
  private static final int ITERATIONS_PER_GCD = 20;

  private final long mB1;
  //  private final long mB2;
  //  private final Prime mPrime;
  /** Base. */
  private final Z mBase;

  /**
   * Construct a new <i>p</i>+1 factor machine with the specified bounds.
   *
   * @param b1 first smoothness bound
   * @param b2 second smoothness bound
   * @param base start base
   */
  public PPlusOne(final long b1, final long b2, final long base) {
    super();
    mB1 = b1;
    //    mB2 = b2;
    //    mPrime = new Fast();
    mBase = Z.valueOf(base);
  }

  /* Array containing cached values of <code>b^d</code>. */
  //  private final ArrayList mBD = new ArrayList();

  /*
   * Get the value of b^difference, caching the result for future use.
   *
   * @param difference the difference, should be nonnegative and even
   * @param b base
   * @param n number to being factored
   * @return b^difference
   */
//   private Z getBD(final long difference, final Z b, final Z n) {

//     assert difference >= 0L : "negative difference in getBD()";
//     assert (difference & 1L) == 0L : "odd difference in getBD()";

//     final int diff = (int) (difference >> 1);

//     // if necessary compute all entries up to requested value
//     if (diff >= mBD.size()) {
//       if (mBD.size() == 0) {
//         mBD.add(Z.ONE);
//       }
//       Z bd = (Z) mBD.get(mBD.size() - 1);
//       for (int i = mBD.size(); i <= diff; ++i) {
//         bd = bd.multiply(b).mod(n);
//         mBD.add(bd);
//       }
//     }

//     return (Z) mBD.get(diff);
//   }

//   /** Stage 2 of p-1 method. */
//   private Z p1s(final Z n, Z x, final long lastPrime) {

//     // immediate exit if B2 bound gives nothing new
//     if (mB2 <= mB1) {
//       return null;
//     }

//     long ipp = lastPrime;
//     long jpp = ipp;
//     Z g, y = x;
//     Z p = Z.ONE;
//     final Z bb = x.multiply(x).mod(n);
//     x = x.modPow(Z.valueOf(lastPrime), n);

//     System.err.println("Step2(a)");

//   post:
//     while (true) {
//       for (int c = 0; c < ITERATIONS_PER_GCD; ++c) {
//         final long ip = ipp;
//         ipp = mPrime.nextPrime(ipp);
//         x = x.multiply(getBD(ipp - ip, bb, n)).mod(n);
//         p = p.multiply(x.subtract(Z.ONE)).mod(n);
//         if (ip >= mB2) {
//           g = n.gcd(p);
//           if (g.equals(Z.ONE)) {
//             System.err.println("S2FAILED");
//             return null;
//           }
//           break post;
//         }
//       }

//       g = p.gcd(n);
//       if (!g.equals(Z.ONE)) {
//         break;
//       }
//       jpp = ipp;
//       y = x;
//     }

//     System.err.println("Step2(b)");
//     ipp = jpp;
//     x = y;
//     do {
//       final long ip = ipp;
//       ipp = mPrime.nextPrime(ipp);
//       x = x.multiply(getBD(ipp - ip, bb, n)).mod(n);
//       g = n.gcd(x.subtract(Z.ONE));
//     } while (g.equals(Z.ONE));
//     if (g.compareTo(n) < 0) {
//       System.out.println("Found g=" + g);
//       return g;
//     }
//     System.out.println("S2FAIL");
//     return null;

//   }

 //  private Z post(long ip, Z x, final Z n) {
//     while (true) {
//       ip = mPrime.nextPrime(ip);
//       long q = ip;

//       do {
//         x = x.modPow(Z.valueOf(ip), n);
//         final Z g = n.gcd(x.subtract(Z.ONE));
//         if (!g.equals(Z.ONE)) {
//           if (g.compareTo(n) < 0) {
//             return g;
//           }
//           // try second stage
//           return p1s(n, x, mPrime.prevPrime(ip));
//         }
//         q *= ip;
//       } while (q <= mB1);
//     }
//   }

  /**
   * Compute a Lucas chain. Computes <code>V_e(p0) mod n</code>.
   *
   * @param p0 initial value
   * @param e index
   * @param n modulus
   * @return <code>V_e(p0)</code>
   * @exception ArithmeticException if e &lt; 0 or n &lt; 1.
   */
  public static Z lucasV(final Z p0, final Z e, final Z n) {
    if (n.compareTo(Z.ONE) < 0) {
      throw new ArithmeticException("n must be >= 1");
    }
    if (e.compareTo(Z.ZERO) <= 0) {
      if (e.equals(Z.ZERO)) {
        return Z.TWO.mod(n);
      }
      throw new ArithmeticException("e must be >= 0");
    }
    if (e.equals(Z.ONE)) {
      return p0.mod(n);
    }
    // p = V_2(p0) = p0^2-2
    Z p = p0.multiply(p0).subtract(Z.TWO);
    // q = V_1(p0) = p0
    Z q = p0;
    int i = e.bitLength() - 1; // lg base 2
    while (i > 0) {
      if (e.testBit(--i)) {
        if (i != 0) {
          q = q.multiply(p).subtract(p0).mod(n);
        }
        p = p.multiply(p).subtract(Z.TWO).mod(n);
      } else {
        p = p.multiply(q).subtract(p0).mod(n);
        if (i != 0) {
          q = q.multiply(q).subtract(Z.TWO).mod(n);
        }
      }
    }
    return p;
  }

  private Z p1f(final Z n) {
    Z x = mBase;
    Z v = x;
    long count = 0L;

    while (count < mB1) {
      final Z g = n.gcd(v.subtract(Z.TWO));
      if (!g.equals(Z.ONE)) {
        //System.out.println(String.valueOf(g));
        return g;
      }
      for (int c = 0; c < ITERATIONS_PER_GCD; ++c) {
        v = lucasV(x, Z.valueOf(++count), n);
        x = v;
      }
    }
    return null;
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    final int exponent = fs.getExponent(n);
    //    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE)) {
      return;
    }
    final Z f = p1f(n);
    if (f != null) {
      fs.add(f, exponent);
      fs.add(n.divide(f), exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new PPlusOne(1000000, 1000000, 4), args);
  }
}
