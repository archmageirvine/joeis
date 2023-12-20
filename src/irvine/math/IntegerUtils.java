package irvine.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import irvine.math.z.Z;
import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * Utility functions for integers.
 * @author Sean A. Irvine
 */
public final class IntegerUtils {

  private IntegerUtils() { }

  /**
   * Approximate binary logarithm of an integer. If the given integer is 0 then
   * 0 is the result, otherwise the result is the binary logarithm of the
   * absolute value of the given number.
   * @param n integer to get logarithm of
   * @return binary logarithm
   */
  public static int log2(final int n) {
    return Integer.SIZE - Integer.numberOfLeadingZeros(Math.abs(n));
  }

  /**
   * Binary logarithm of a positive integer rounded down.
   * @param n integer to get logarithm of, must be &gt;= 1
   * @return integer part of binary logarithm
   */
  public static int floorLog2(final int n) {
    return Integer.SIZE - 1 - Integer.numberOfLeadingZeros(n);
  }

  /**
   * Binary logarithm of a positive integer rounded up.
   * @param n integer to get logarithm of, must be &gt;= 1
   * @return binary logarithm for powers of 2, and integer part of binary logarithm + 1 otherwise
   */
  public static int ceilingLog2(final int n) {
    return (Integer.bitCount(n) == 1 ? Integer.SIZE - 1 : Integer.SIZE) - Integer.numberOfLeadingZeros(n);
  }

  /**
   * Compute the floor of the square root of the given integer.
   * @param n integer to take the square root of
   * @return an <code>int</code> value
   */
  public static int sqrt(final int n) {
    return (int) Math.sqrt(n);
  }

  /**
   * Test if the given value is a square.
   * @param n number to test
   * @return true iff the number is a square
   */
  public static boolean isSquare(final int n) {
    final int s = sqrt(n);
    return s * s == n;
  }

  /**
   * Convert a digit character to a value, returns <code>-1</code> if not a valid digit.
   * Understands about use of letters in higher bases.
   * @param c a character
   * @return integer value
   */
  public static int charToValue(final char c) {
    if (c < '0') {
      return -1;
    }
    if (c <= '9') {
      return c - '0';
    }
    if (c < 'A') {
      return -1;
    }
    if (c <= 'Z') {
      return c - 'A' + 10;
    }
    if (c < 'a') {
      return -1;
    }
    if (c <= 'z') {
      return c - 'a' + 10;
    }
    return -1;
  }

  private static final int N_LIMIT = sqrt(Integer.MAX_VALUE);

  /**
   * Compute <code>a^e mod n</code> for non-negative <code>a</code> and
   * <code>n &lt; sqrt(Integer.MAX_VALUE)</code>.
   *
   * @param a base
   * @param e exponent
   * @param n modulus
   * @return <code>a^e mod n</code>
   * @exception IllegalArgumentException if <code>a</code> is negative or
   * if <code>n</code> exceeds <code>sqrt(Integer.MAX_VALUE)</code> or
   * <code>n</code> is negative.
   * @exception ArithmeticException if <code>n</code> is zero
   */
  public static int modPow(int a, int e, final int n) {
    if (a < 0 || n > N_LIMIT || n < 0) {
      throw new IllegalArgumentException();
    }
    // handle some special cases
    if (n == 1) {
      return 0;
    }
    if (e == 0) {
      return 1;
    }
    a %= n;
    if (a < 2 || e < 2) {
      return a;
    }
    if (e == 2) {
      return (a * a) % n;
    }

    int r = 1;
    while (e != 0) {
      if ((e & 1) != 0) {
        r *= a;
        r %= n;
      }
      a *= a;
      a %= n;
      e >>>= 1;
    }
    return r;
  }

  /**
   * Compute the greatest common denominator of two integers.
   * @param a first integer
   * @param b second integer
   * @return <code>gcd(a,b)</code>
   */
  public static int gcd(final int a, final int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  /**
   * Compute the greatest common divisor of an array of values.
   * @param a list of values
   * @return greatest common divisor
   */
  public static int gcd(final int... a) {
    int g = a[0];
    for (int k = 1; k < a.length; ++k) {
      g = gcd(g, a[k]);
    }
    return g;
  }

  /**
   * Compute the least common multiple of two integers.
   * @param a first integer
   * @param b second integer
   * @return <code>lcm(a,b)</code>
   */
  public static int lcm(final int a, final int b) {
    return (a / gcd(a, b)) * b;
  }

  /**
   * Return the least common multiple of a list of integers.
   * @param lst elements
   * @return least common multiple
   */
  public static Z lcm(final int... lst) {
    Z lcm = Z.ONE;
    for (final int v : lst) {
      lcm = lcm.lcm(Z.valueOf(v));
    }
    return lcm;
  }

  /**
   * Return the smallest power of 2 which is larger than <code>x</code>.
   * If <code>x</code> &gt;= 2<sup>30</sup>, then the result is
   * <code>Integer.MIN_VALUE</code> (which is the correct result if
   * the result is considered to be unsigned). If <code>x &lt; 0</code>,
   * then the result is 0.
   *
   * @param x value to round up
   * @return a power of 2
   */
  public static int nextPowerOf2(int x) {
    x |= x >> 1;
    x |= x >> 2;
    x |= x >> 4;
    x |= x >> 8;
    x |= x >> 16;
    return x + 1;
  }

  /**
   * Step to the next number with the same number of set bits.
   * @param x current value
   * @return next value
   */
  public static int swizzle(final int x) {
    // the swizzle function from HAKMEM 175
    final int lowestBit = x & -x;
    final int leftBits = x + lowestBit;
    final int changedBits = x ^ leftBits;
    final int rightBits = (changedBits / lowestBit) >>> 2;
    return leftBits | rightBits;
  }

  /**
   * Maximum of an array of values.
   * @param values the possible values
   * @return the maximum
   */
  public static int max(final int... values) {
    int m = Integer.MIN_VALUE;
    for (final int v : values) {
      if (v > m) {
        m = v;
      }
    }
    return m;
  }

  /**
   * Return a string representation of a two-dimensional integer array.
   * @param array array to get in string form
   * @return string representation
   */
  public static String toString(final int[][] array) {
    if (array == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder("[");
    for (final int[] a : array) {
      if (sb.length() > 1) {
        sb.append(", ");
      }
      sb.append(Arrays.toString(a));
    }
    sb.append(']');
    return sb.toString();
  }

  /**
   * Compute a hash value from two integers (e.g. two other hash values).
   * @param a first hash
   * @param b second hash
   * @return combined hash
   */
  public static int hash(final int a, final int b) {
    return (997 * a) ^ (991 * b);
  }

  /**
   * Sum the contents of an arbitrary dimensioned primitive int or Integer array.
   * @param structure array
   * @return sum of the array
   */
  public static long sum(final Object structure) {
    long sum = 0;
    if (structure.getClass().isArray()) {
      if (structure.getClass().isAssignableFrom(int[].class)) {
        for (final int v : (int[]) structure) {
          sum += v;
        }
      } else {
        final Object[] array = (Object[]) structure;
        for (final Object o : array) {
          sum += sum(o);
        }
      }
    } else {
      sum += (Integer) structure;
    }
    return sum;
  }

  /**
   * Make the array an identity map up to entry <code>n</code>.
   * @param a array
   * @param n maximum entry
   * @return the array
   */
  public static int[] identity(final int[] a, final int n) {
    for (int k = 0; k < n; ++k) {
      a[k] = k;
    }
    return a;
  }

  /**
   * Make the array an identity map up to entry <code>n</code>.
   * @param a array
   * @return the array
   */
  public static int[] identity(final int[] a) {
    return identity(a, a.length);
  }

  /**
   * Convert big integer list into an array of primitives.
   * @param list list of integers
   * @return primitive array
   */
  public static int[] toArray(final Collection<Integer> list) {
    final int[] res = new int[list.size()];
    int k = 0;
    for (final int v : list) {
      res[k++] = v;
    }
    return res;
  }

  /**
   * Read numbers from a stream into an array.  Empty lines or lines starting
   * with <code>#</code> are ignored. Behaviour on out of range numbers is
   * undefined.
   *
   * @param reader source
   * @return array of numbers
   * @throws IOException if an I/O error occurs.
   */
  public static int[] readInNumbers(final BufferedReader reader) throws IOException {
    final ArrayList<Integer> res = new ArrayList<>();
    String line;
    while ((line = reader.readLine()) != null) {
      if (!line.isEmpty() && line.charAt(0) != '#') {
        res.add(Integer.valueOf(line));
      }
    }
    final int[] r = new int[res.size()];
    for (int k = 0; k < r.length; ++k) {
      r[k] = res.get(k);
    }
    return r;
  }

  /**
   * Read numbers from a stream into an array.  Empty lines or lines starting
   * with <code>#</code> are ignored. Behaviour on out of range numbers is
   * undefined.
   *
   * @param resource reader source
   * @return array of numbers
   */
  public static int[] readInNumbers(final String resource) {
    try (final BufferedReader r = IOUtils.reader(resource)) {
      return readInNumbers(r);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * The order of m in n.
   * @param n base
   * @param m factor
   * @return number of times p divides n
   */
  public static int ord(final int n, final int m) {
    int nn = n;
    int c = 0;
    while (nn % m == 0) {
      nn /= m;
      ++c;
    }
    return c;
  }

  /**
   * Test if the array is zero.
   * @param a array
   * @return true iff every element is 0
   */
  public static boolean isZero(final int... a) {
    for (final int v : a) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  private static final String PADDING = StringUtils.rep('0', Integer.SIZE);

  /**
   * Return a 64-character string containing the binary value of <code>n</code>.
   * @param n number
   * @return padded binary form
   */
  public static String toBinaryString(final int n) {
    final String s = PADDING + Integer.toBinaryString(n);
    return s.substring(s.length() - Integer.SIZE);
  }

  /**
   * Test if the given array is a constant non-zero value.
   * @param values array
   * @return true if the array is constant but not zero.
   */
  public static int isNonzeroConstant(final int[] values) {
    int a = -1;
    for (final int v : values) {
      if (v > 0) {
        if (a == -1) {
          a = v;
        } else if (a != v) {
          return 0;
        }
      }
    }
    return a;
  }

  /**
   * Convert an integer array into a list.
   * @param a array of values
   * @return list
   */
  public static List<Integer> toList(final int... a) {
    final ArrayList<Integer> res = new ArrayList<>();
    for (final int v : a) {
      res.add(v);
    }
    return res;
  }

  /**
   * Return the number of occurrence of the value in the array.
   * @param value value to count
   * @param array array to count in
   * @return number of occurrences
   */
  public static int count(final int value, final int... array) {
    int cnt = 0;
    for (final int v : array) {
      if (v == value) {
        ++cnt;
      }
    }
    return cnt;
  }

  /**
   * Increment an array of values up to a maximum value.
   * @param a array
   * @param min minimum value
   * @param max maximum value
   * @return true if incrementing was successful
   */
  public static boolean bump(final int[] a, final int min, final int max) {
    for (int k = a.length - 1; k >= 0; --k) {
      if (++a[k] <= max) {
        return true;
      }
      a[k] = min;
    }
    return false;
  }

  /**
   * Remove any factors of 2 from the given number.
   * @param n number
   * @return number with factors of 2 removed
   */
  public static int makeOdd(int n) {
    if (n == 0) {
      return 0;
    }
    while ((n & 1) == 0) {
      n >>= 1;
    }
    return n;
  }

  /**
   * Return the product of the supplied values.
   * @param a array
   * @return product
   */
  public static Z product(final int... a) {
    Z prod = Z.ONE;
    if (a != null) {
      for (final int b : a) {
        prod = prod.multiply(b);
      }
    }
    return prod;
  }
}
