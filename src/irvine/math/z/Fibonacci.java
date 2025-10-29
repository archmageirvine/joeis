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
   * Compute a Fibonacci number mod <code>m</code>.
   * @param n index
   * @param m modulus
   * @return Fibonacci number
   */
  public static Z fibonacci(final Z n, final Z m) {
    if (m.signum() < 1) {
      throw new IllegalArgumentException();
    }
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(m));
    final Matrix<Z> mat = new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.ONE}, {Z.ONE, Z.ZERO}}, Z.ZERO);
    return ring.pow(mat, n).get(0, 1).mod(m);
  }


  /**
   * Compute a Lucas number mod <code>m</code>.
   * @param n index
   * @param m modulus
   * @return Lucas number
   */
  public static Z lucas(final Z n, final Z m) {
    if (m.signum() < 1) {
      throw new IllegalArgumentException();
    }
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(m));
    final Matrix<Z> mat = new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE}, {Z.ONE, Z.ONE}}, Z.ZERO);
    final Matrix<Z> pow = ring.pow(mat, n);
    final Matrix<Z> t = ring.multiply(pow, new DefaultMatrix<>(new Z[][] {{Z.TWO}, {Z.ONE}}, Z.ZERO));
    return t.get(0, 0).mod(m);
  }

  /**
   * Compute a Pell number mod <code>m</code>.
   * @param n index
   * @param m modulus
   * @return Pell number
   */
  public static Z pell(final Z n, final Z m) {
    if (m.signum() < 1) {
      throw new IllegalArgumentException();
    }
    if (n.isZero() || n.isOne()) {
      return n.mod(m);
    }
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(m));
    final Matrix<Z> mat = new DefaultMatrix<>(new Z[][] {{Z.TWO, Z.ONE}, {Z.ONE, Z.ZERO}}, Z.ZERO);
    final Matrix<Z> pow = ring.pow(mat, n.subtract(1));
    //final Matrix<Z> t = ring.multiply(pow, new DefaultMatrix<Z>(new Z[][] {{Z.TWO}, {Z.ONE}}, Z.ZERO));
    return pow.get(0, 0).add(m).mod(m);
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

