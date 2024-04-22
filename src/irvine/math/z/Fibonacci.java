package irvine.math.z;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;

/**
 * Routines relating to Fibonacci and Lucas numbers.
 * @author Sean A. Irvine
 */
public final class Fibonacci  {

  private Fibonacci() { }

  private static final long[] FIBONACCI_PRIMES = LongUtils.suckInNumbers("irvine/math/z/fibonacci/fibonacci-primes.dat");
  private static final long[] LUCAS_PRIMES = LongUtils.suckInNumbers("irvine/math/z/fibonacci/lucas-primes.dat");

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
    final Z f = Functions.FIBONACCI.z((long) estimatedIndex);
    if (f.equals(n)) {
      return estimatedIndex;
    } else if (f.compareTo(n) < 0) {
      return -estimatedIndex;
    }

    // try reducing estimate by 1
    final long n1 = --estimatedIndex;
    return Functions.FIBONACCI.z(n1).equals(n) ? estimatedIndex : -estimatedIndex;
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
    final Z l = Functions.LUCAS.z((long) estimatedIndex);
    if (l.equals(n)) {
      return estimatedIndex;
    } else if (l.compareTo(n) < 0) {
      return -estimatedIndex;
    }

    // try reducing estimate by 1
    final long n1 = --estimatedIndex;
    return Functions.LUCAS.z(n1).equals(n) ? estimatedIndex : -estimatedIndex;
  }

  /**
   * Compute a Fibonacci number mod <code>m</code>.
   * @param n index
   * @param m modulus
   * @return Fibonacci number
   */
  public static long fibonacci(final long n, final long m) {
    if (m < 1) {
      throw new IllegalArgumentException();
    }
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(m));
    final Matrix<Z> mat = new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.ONE}, {Z.ONE, Z.ZERO}}, Z.ZERO);
    return ring.pow(mat, n).get(0, 1).longValueExact() % m;
  }

  /**
   * Print Fibonacci numbers.
   * @param args indexes to print
   */
  public static void main(final String[] args) {
    if (args.length > 1 && "-l".equals(args[0])) {
      for (int k = 1; k < args.length; ++k) {
        System.out.println(Functions.LUCAS.z(Long.parseLong(args[k])));
      }
    } else {
      for (final String s : args) {
        System.out.println(Functions.FIBONACCI.z(Long.parseLong(s)));
      }
    }
  }
}

