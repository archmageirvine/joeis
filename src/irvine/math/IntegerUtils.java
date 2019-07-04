package irvine.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * Utility functions for integers.
 *
 * @author Sean A. Irvine
 */
public final class IntegerUtils {

  private IntegerUtils() { }

  /**
   * Approximate binary logarithm of an integer. If the given integer is 0 then
   * 0 is the result, otherwise the result is the binary logarithm of the
   * absolute value of the given number.
   *
   * @param n integer to get logarithm of
   * @return binary logarithm
   */
  public static int lg(final int n) {
    int a = n < 0 ? -n : n;
    int i = 0;
    while (a >= 256) {
      i += 8;
      a >>= 8;
    }
    if (a >= 16) {
      i += 4;
      a >>= 4;
    }
    if (a >= 4) {
      i += 2;
      a >>= 2;
    }
    if (a >= 2) {
      i += 2;
    } else if (a >= 1) {
      ++i;
    }
    return i;
  }

  /**
   * Convert a digit character to a value, returns -1 if not a valid digit.
   * Understands about use of letters in higher bases.
   *
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

  /**
   * Compute the integer square root of the given integer.  This is
   * faster than <code>(int) Math.sqrt(n)</code>.
   *
   * @param n integer to take the square root of
   * @return an <code>int</code> value
   * @exception IllegalArgumentException if <code>r</code> is negative.
   */
  public static int sqrt(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    // Depends on the specifics of IEEE arithmetic
    final float rr = n;
    final float y = rr * 0.5F;
    float x = Float.intBitsToFloat((0xBE6F0000 - Float.floatToIntBits(rr)) >> 1);
    x = 1.5F * x - (x * x) * (x * y);
    if (n > 101123) {
      x = 1.5F * x - (x * x) * (x * y);
    }
    final int is = (int) (x * rr + 0.5F);
    return is + ((n - is * is) >> 31);
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
   * Compute the number of leading zeros in an integer.  On my machine
   * this is faster than the built-in function.
   *
   * @param x value to count leading zeros of
   * @return number of leading zeros
   */
  public static int nlz(final int x) {
    if (x < 0) {
      return 0;
    } else {
      final double d = x + 0.5;
      return 1054 - (int) (Double.doubleToRawLongBits(d) >>> 52);
    }
  }

  /**
   * Compute the greatest common denominator of two integers.
   *
   * @param a first integer
   * @param b second integer
   * @return <code>gcd(a,b)</code>
   */
  public static int gcd(final int a, final int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  /**
   * Compute the least common multiple of two integers.
   *
   * @param a first integer
   * @param b second integer
   * @return <code>lcm(a,b)</code>
   */
  public static int lcm(final int a, final int b) {
    return (a / gcd(a, b)) * b;
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
   * Return the next larger number containing exactly the same number of
   * set bits as the supplied number. Does not work for 0.
   *
   * @param x parameter
   * @return next higher value with the same population count
   */
  public static int incrementConstantPopCount(final int x) {
    assert x != 0;
    final int c = x & -x;
    final int r = x + c;
    return (((r ^ x) >> 2) / c) | r;
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
   * Return a string representation of a two dimensional integer array.
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
   * Sum the contents of an arbitrary dimensioned primitive int or Integer
   * array.
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
  public static int[] suckInNumbers(final BufferedReader reader) throws IOException {
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
  public static int[] suckInNumbers(final String resource) {
    try (final BufferedReader r = IOUtils.reader(resource)) {
      return suckInNumbers(r);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Parse a value as decimal or hexadecimal depending on <code>0x</code> prefix.
   * @param s string to parse
   * @return value
   */
  public static int parseValue(final String s) {
    if (s.startsWith("0x")) {
      return Integer.parseInt(s.substring(2), 16);
    } else {
      return Integer.parseInt(s);
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

}
