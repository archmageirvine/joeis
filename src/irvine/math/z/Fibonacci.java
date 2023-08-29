package irvine.math.z;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import irvine.math.LongUtils;
import irvine.math.r.DoubleUtils;

/**
 * Routines relating to Fibonacci and Lucas numbers.
 * @author Sean A. Irvine
 */
public final class Fibonacci  {

  private Fibonacci() { }

  private static final int SMALL_LIMIT = 100;
  private static final Z[] FIBONACCI = new Z[SMALL_LIMIT];
  static {
    // These ones explicitly initialized so that constants from Z used
    FIBONACCI[0] = Z.ZERO;
    FIBONACCI[1] = Z.ONE;
    FIBONACCI[2] = Z.ONE;
    FIBONACCI[3] = Z.TWO;
    FIBONACCI[4] = Z.THREE;
    FIBONACCI[5] = Z.FIVE;
    FIBONACCI[6] = Z.EIGHT;
    // Initialize remainder of small cases
    for (int k = 7; k < FIBONACCI.length; ++k) {
      FIBONACCI[k] = FIBONACCI[k - 1].add(FIBONACCI[k - 2]);
    }
  }

  private static final long[] FIBONACCI_PRIMES = LongUtils.suckInNumbers("irvine/math/z/fibonacci/fibonacci-primes.dat");
  private static final long[] LUCAS_PRIMES = LongUtils.suckInNumbers("irvine/math/z/fibonacci/lucas-primes.dat");

  /** Cache of recently requested values. */
  private static final Map<Long, Z> FIBO_MAP = new LinkedHashMap<>() {
    @Override
    protected boolean removeEldestEntry(final Map.Entry<Long, Z> eldest) {
      return size() > 100;
    }
  };

  /**
   * Returns the nth Fibonacci number.
   * @param n index
   * @return F(n)
   */
  public static Z fibonacci(long n) {
    // handle negatives
    if (n < 0) {
      n = -n;
      final Z r = fibonacci(-n);
      return (n & 1) == 1 ? r : r.negate();
    }
    // handle small cases
    if (n < FIBONACCI.length) {
      return FIBONACCI[(int) n];
    }

    // examine cache
    final Long nn = n;
    final Z mapResult = FIBO_MAP.get(nn);
    if (mapResult != null) {
      return mapResult;
    }

    // handle even cases
    if ((n & 1) == 0) {
      n >>>= 1;
      final Z fnp = fibonacci(n + 1);
      final Z fnm = fibonacci(n - 1);
      final Z r = fnp.multiply(fnp).subtract(fnm.multiply(fnm));
      FIBO_MAP.put(nn, r);
      return r;
    }

    // handle odd cases
    n >>>= 1;
    final Z fnpo = fibonacci(n + 1);
    final Z fno = fibonacci(n);
    final Z ro = fnpo.multiply(fnpo).add(fno.multiply(fno));
    FIBO_MAP.put(nn, ro);
    return ro;
  }

  /**
   * Return the nth Lucas number.
   * @param n index
   * @return L(n)
   */
  public static Z lucas(final long n) {
    return fibonacci(n - 1).add(fibonacci(n + 1));
  }

  /**
   * Test if the Fibonacci number of given index is a prime.
   * @param n index
   * @return if <code>F(n)</code> is prime or probably prime
   */
  public static boolean isFibonacciPrime(final long n) {
    if (n > FIBONACCI_PRIMES[FIBONACCI_PRIMES.length - 1]) {
      if (Z.valueOf(n).isPrime()) {
        throw new UnsupportedOperationException();
      }
      return false;
    }
    return Arrays.binarySearch(FIBONACCI_PRIMES, n) >= 0;
  }

  /**
   * Test if the Lucas number of given index is a prime.
   * @param n index
   * @return if <code>L(n)</code> is prime or probably prime
   */
  public static boolean isLucasPrime(final long n) {
    if (n > LUCAS_PRIMES[LUCAS_PRIMES.length - 1]) {
      if (Z.valueOf(n).isPrime() || (n & (n - 1)) == 0) {
        throw new UnsupportedOperationException();
      }
      return false;
    }
    return Arrays.binarySearch(LUCAS_PRIMES, n) >= 0;
  }

  /**
   * If <code>n</code> is a Fibonacci number, then return its index; that is,
   * return the <i>k</i> such that <i>F</i>(<i>k</i>)=<code>n</code>. If the
   * supplied argument is not a Fibonacci number then the result will be a
   * negative index for a Fibonacci number with a value similar to the supplied
   * the argument (but not necessarily the closest Fibonacci number). This
   * method can be used to quickly determine if an integer appears in the
   * Fibonacci sequence.
   *
   * @param n nonnegative integer to get index for
   * @return <i>k</i> such that <i>F</i>(<i>k</i>)=<code>n</code>
   */
  public static int inverseFibonacci(final Z n) {
    // fail on negatives
    if (n.signum() < 0) {
      throw new ArithmeticException("Only applicable to positive numbers");
    }

    // handle small cases
    if (n.isZero()) {
      return 0;
    }
    // note there are two possible answers in the next case, we return
    // the lower of the two
    if (n.equals(Z.ONE)) {
      return 1;
    }

    // handle general case
    int estimatedIndex = (int) (1.440420090412556479017551499657 * (n.bitLength() + 1.160964047443681173935159714711));
    final Z f = fibonacci(estimatedIndex);
    if (f.equals(n)) {
      return estimatedIndex;
    } else if (f.compareTo(n) < 0) {
      return -estimatedIndex;
    }

    // try reducing estimate by 1
    return fibonacci(--estimatedIndex).equals(n) ? estimatedIndex : -estimatedIndex;
  }

  /**
   * If <code>n</code> is a Lucas number, then return its index; that is,
   * return the <i>k</i> such that <i>L</i>(<i>k</i>)=<code>n</code>. If the
   * supplied argument is not a Lucas number then the result will be a
   * negative index for a Lucas number with a value similar to the supplied
   * the argument (but not necessarily the closest Lucas number). This
   * method can be used to quickly determine if an integer appears in the
   * Lucas sequence.
   *
   * @param n nonnegative integer to get index for
   * @return <i>k</i> such that <i>L</i>(<i>k</i>)=<code>n</code>
   */
  public static int inverseLucas(final Z n) {
    // fail on negatives
    if (n.signum() <= 0) {
      throw new ArithmeticException("Only applicable to positive numbers");
    }

    // handle small cases
    if (Z.TWO.equals(n)) {
      return 0;
    }
    // note there are two possible answers in the next case, we return
    // the lower of the two
    if (Z.ONE.equals(n)) {
      return 1;
    }

    // handle general case
    int estimatedIndex = (int) (1.440420090412556479017551499657 * (double) n.bitLength());
    final Z l = lucas(estimatedIndex);
    if (l.equals(n)) {
      return estimatedIndex;
    } else if (l.compareTo(n) < 0) {
      return -estimatedIndex;
    }

    // try reducing estimate by 1
    return lucas(--estimatedIndex).equals(n) ? estimatedIndex : -estimatedIndex;
  }

  private static void lucasSnfsPoly5(final int n, final Z c, final PrintStream out) {
    assert n % 5 != 0;
    // This is the default polynomial in most cases.
    // Write n = 5*k+r, r in {-2,-1,1,2}
    final int kk = n / 5;
    final int rr = n - kk * 5;
    final int k, r;
    if (rr > 2) {
      r = rr - 5;
      k = kk + 1;
    } else {
      r = rr;
      k = kk;
    }

    final int c0;
    out.println(c.toString());
    out.println("X5 1");
    out.println("X4 0");
    switch (r) {
    case -1:
      out.println("X3 10");
      out.println("X2 10");
      out.println("X1 10");
      c0 = 3;
      break;
    case 1:
      out.println("X3 10");
      out.println("X2 -10");
      out.println("X1 10");
      c0 = -3;
      break;
    default:
      assert r == -2 || r == 2;
      out.println("X3 -10");
      out.println("X2 30");
      out.println("X1 -40");
      c0 = 21;
      break;
    }
    out.println("X0 " + c0);
    final Z y0 = lucas(k + r);
    final Z y1 = lucas(k);
    out.println("Y1 " + y1);
    out.println("Y0 " + y0.negate());
    out.println("M " + y0.modMultiply(y1.modInverse(c), c));
    out.println("# skew " + DoubleUtils.NF4.format(Math.pow(Math.abs(c0), 0.2)));
  }

  private static final int[][][] LUCAS_COEFFS = {
    null,
    null,
    {{3, -6, 30, 20, 45, 24, 7}, {3, -6, 30, 20, 45, 24, 7}, {3, -6, 30, 20, 45, 24, 7}},
    {{19, -63, 105, -85, 45, -3, 1}, {6, -27, 45, -15, 30, 3, 4}, {4, -3, 30, 15, 45, 27, 6}},
  };

  private static void lucasSnfsPolyP(final int n, final Z c, final PrintStream out, final int p) {
    assert n % p == 0;
    // Write n = pm, m = 3*k+r, r in {0,1,2}
    final int m = n / p;
    final int k = m / 3;
    final int r = m - 3 * k;
    out.println(c.toString());
    for (int j = 6; j >= 0; --j) {
      out.println("X" + j + " " + LUCAS_COEFFS[p][r][j]);
    }
    final Z y0 = fibonacci(k + 1);
    final Z y1 = fibonacci(k);
    out.println("Y1 " + y1);
    out.println("Y0 " + y0.negate());
    out.println("M " + y0.modMultiply(y1.modInverse(c), c));
    out.println("# skew " + DoubleUtils.NF4.format(Math.pow(Math.abs(LUCAS_COEFFS[p][r][0] / (double) LUCAS_COEFFS[p][r][6]), 0.2)));
  }

  /**
   * Print potential SNFS polynomials for a Lucas number.
   * @param n Lucas index
   * @param c number to be factored
   * @param out output stream
   */
  public static void lucasSnfsPoly(final int n, final Z c, final PrintStream out) {
    if (!lucas(n).mod(c).isZero()) {
      throw new ArithmeticException("Composite does not divide claimed Lucas number");
    }
    if (n % 5 == 0 && (n & 1) == 1) {
      out.println("Use Aurifeuillian factorization for this number.");
    }
    if (n % 5 != 0) {
      lucasSnfsPoly5(n, c, out);
    }
    if (n % 2 == 0) {
      lucasSnfsPolyP(n, c, out, 2);
    }
    if (n % 3 == 0) {
      lucasSnfsPolyP(n, c, out, 3);
    }
  }

  /**
   * Print Fibonacci numbers.
   * @param args indexes to print
   */
  public static void main(final String[] args) {
    if (args.length > 1 && "-l".equals(args[0])) {
      for (int k = 1; k < args.length; ++k) {
        System.out.println(lucas(Integer.parseInt(args[k])));
      }
    } else if (args.length > 1 && "-lp".equals(args[0])) {
      lucasSnfsPoly(Integer.parseInt(args[1]), new Z(args[2]), System.out);
    } else {
      for (final String s : args) {
        System.out.println(fibonacci(Integer.parseInt(s)));
      }
    }
  }
}

