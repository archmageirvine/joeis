package irvine.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

  // Use system sqrt here to avoid circular dependency
  private static final int N_LIMIT = (int) Math.sqrt(Integer.MAX_VALUE);

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
   * Convert a collection to a primitive array.
   * @param c collection
   * @return long array
   */
  public static int[] toInt(final Collection<Integer> c) {
    final int[] res = new int[c.size()];
    int k = 0;
    for (final int v : c) {
      res[k++] = v;
    }
    return res;
  }

  /**
   * Modular inverse.
   * @param k number
   * @param m modulus
   * @return inverse
   */
  public static int modInverse(int k, int m) {
    if (m == 0) {
      return (k == 1 || k == -1) ? k : 0;
    }
    if (m < 0) {
      m = -m;
    }
    k %= m;
    if (k < 0) {
      k += m;
    }
    boolean neg = true;
    int p1 = 1;
    int p2 = 0;
    int k1 = k;
    int m1 = m;
    while (k1 > 0) {
      final int q = m1 / k1;
      final int r = m1 % k1;
      final int temp = q * p1 + p2;
      p2 = p1;
      p1 = temp;
      m1 = k1;
      k1 = r;
      neg = !neg;
    }
    return neg ? m - p2 : p2;
  }

  /**
   * Return the mex of a collection.
   * @param mex collection
   * @return mex value
   */
  public static int mex(final Collection<Integer> mex) {
    int m = -1;
    while (mex.contains(++m)) {
      // do nothing
    }
    return m;
  }

  /**
   * Convert an array of <code>int</code> to an array of <code>long</code>.
   * @param a array
   * @return converted array
   */
  public static long[] toLong(final int... a) {
    final long[] res = new long[a.length];
    for (int k = 0; k < res.length; ++k) {
      res[k] = a[k];
    }
    return res;
  }

}
