package irvine.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.CollectionUtils;
import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * Provides various functions operating on longs.
 * @author Sean A. Irvine
 */
public final class LongUtils {

  private LongUtils() { }

  /** A hard limit for the <code>modPow</code> function */
  public static final long MODLIMIT = (long) Math.sqrt(Long.MAX_VALUE);

  /**
   * Compute <code>a^e</code>. Does not check for overflow.
   * @param a base
   * @param e exponent
   * @return <code>a^e</code>
   */
  public static long pow(long a, long e) {
    if (a == 1 || e == 0) {
      return 1;
    } else if (a == 0) {
      return 0;
    } else if (e == 1) {
      return a;
    } else if (e == 2) {
      return a * a;
    }
    long r = 1;
    while (e != 0) {
      if ((e & 1) != 0) {
        r *= a;
      }
      a *= a;
      e >>>= 1;
    }
    return r;
  }

  /**
   * Compute <code>a^e mod n</code>, provided n does not exceed sqrt(Long.MAX_VALUE).
   * @param a base
   * @param e exponent
   * @param n modulus
   * @return <code>a^e mod n</code>
   */
  public static long modPow(long a, long e, final long n) {
    if (n > MODLIMIT) {
      return Z.valueOf(a).modPow(Z.valueOf(e), Z.valueOf(n)).longValueExact();
    }
    if (n <= 0) {
      throw new IllegalArgumentException("Modulus cannot be nonpositve or greater than " + MODLIMIT + " given " + n);
    }
    if (a < 0) {
      throw new IllegalArgumentException("Base can only be nonnegative in this implementation");
    }
    // handle some special cases
    if (n == 1) {
      return 0;
    }
    a %= n;
    if (a == 1 || e == 0) {
      return 1;
    } else if (a == 0) {
      return 0;
    } else if (e == 1) {
      return a;
    } else if (e == 2) {
      return (a * a) % n;
    }
    long r = 1;
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
   * Compute the Jacobi symbol of m and n.
   * @param m first parameter
   * @param n second parameter
   * @return the Jacobi symbol of m and n
   * @throws ArithmeticException if <code>n</code> is even.
   */
  public static int jacobi(final long m, final long n) {
    if ((n & 1) == 0) {
      throw new ArithmeticException();
    }
    long m2 = Math.abs(n);
    long m1 = (m >= 0) ? m % m2 : (m2 - (-m % m2));
    int j = 1;

    while (true) {
      switch ((int) m1 & 15) {
        case 0:
          if (m1 == 0) {
            return m2 == 1 ? j : 0;
          }
          m1 >>>= 4;
          continue;
        case 8:
          m1 >>>= 2;
          continue;
        case 4:
          m1 >>>= 2;
          break;
        case 2:
        case 10:
          m1 >>>= 1;
          if ((m2 & 7) == 3 || (m2 & 7) == 5) {
            j = -j;
          }
          break;
        case 12:
          m1 >>>= 2;
          if ((m2 & 2) != 0) {
            j = -j;
          }
          break;
        case 3:
        case 7:
        case 11:
        case 15:
          if ((m2 & 2) != 0) {
            j = -j;
          }
          break;
        case 6:
        case 14:
          m1 >>>= 1;
          if ((m2 & 4) != 0) {
            j = -j;
          }
          break;
        default:
          break;
      }
      long m3 = ((((m2 + m1) & 3) == 0) ? m2 + m1 : m2 - m1) >>> 2;
      if (m3 >= m1) {
        m3 %= m1;
      }
      m2 = m1;
      m1 = m3;
    }
  }

  /**
   * Kronecker symbol.
   * @param m first argument
   * @param n second argument
   * @return Kronecker symbol
   */
  public static int kronecker(final long m, final long n) {
    if (n == -1) {
      return m >= 0 ? 1 : -1;
    } else if (n == 0) {
      return m == 1 || m == -1 ? 1 : 0;
    } else if (n == 2) {
      if ((m & 1) == 0) {
        return 0;
      }
      return (m & 7) == 1 || (m & 7) == 7 ? 1 : -1;
    } else if ((n & 1) == 0) {
      return kronecker(m, 2) * kronecker(m, n / 2);
    }
    return jacobi(m, n);
  }

  private static final int BITS = Long.SIZE - 2;

  /**
   * Return the integer square root of a positive long. If <code>n&lt;0</code> then an
   * arithmetic exception is thrown.
   * @param n number
   * @return <code>floor(sqrt(n))</code>
   * @throws ArithmeticException if <code>n&lt;0</code>.
   */
  public static long sqrt(final long n) {
    // WARNING: Simply doing (long) Math.sqrt(n) does not work for n > ~2^52.
    if (n < 1L << 52) {
      return (long) Math.sqrt(n);
    }
    long na = 3L << (2 * ((BITS >>> 1) - 1));
    long a = 1L << (BITS >>> 1);
    while ((n & na) == 0L) {
      na >>>= 2;
      a >>>= 1;
    }
    while (true) {
      final long ndiva = n / a;
      na = (ndiva + a) >>> 1;
      if (na - ndiva <= 1) {
        return na * na <= n ? na : ndiva;
      }
      a = na;
    }
  }

  /**
   * Test if the given value is a square.
   * @param n number to test
   * @return true iff the number is a square
   */
  public static boolean isSquare(final long n) {
    final long s = sqrt(n);
    return s * s == n;
  }

  /**
   * Compute the number of bits in <code>|n|</code>.
   * @param n number to take logarithm of.
   * @return base 2 logarithm of <code>|n|</code>
   */
  public static long log2(final long n) {
    return n == 0 ? 0 : Long.SIZE - 1 - Long.numberOfLeadingZeros(Math.abs(n));
  }

  /**
   * Swap the byte order of the given long.
   * @param v long value
   * @return swapped version
   */
  public static long endian(final long v) {
    final long a = (v & 0x00FF00FF00FF00FFL) << 8;
    final long b = (v >>> 8) & 0x00FF00FF00FF00FFL;
    final long c = a + b;
    final long d = (c & 0x0000FFFF0000FFFFL) << 16;
    final long e = (c >>> 16) & 0x0000FFFF0000FFFFL;
    final long f = d + e;
    return (f >>> 32) + (f << 32);
  }

  /**
   * Compute the greatest common denominator of two integers.
   * @param a first integer
   * @param b second integer
   * @return <code>gcd(a,b)</code>
   */
  public static long gcd(long a, long b) {
    while (a != 0) {
      final long t = a;
      a = b % a;
      b = t;
    }
    return b;
  }


  /**
   * Greatest common divisor of three integers.
   * @param a first number
   * @param b second number
   * @param c third number
   * @return great common divisor
   */
  public static long gcd(final long a, final long b, final long c) {
    return gcd(a, gcd(b, c));
  }

  /**
   * Compute the least common multiple of two integers.
   * @param a first integer
   * @param b second integer
   * @return <code>lcm(a,b)</code>
   */
  public static long lcm(final long a, final long b) {
    return a == 0 ? 0 : (a / gcd(a, b)) * b;
  }

  /**
   * Return the smallest power of 2 which is larger than <code>x</code>.
   * If <code>x</code> &gt;= 2<sup>62</sup>, then the result is
   * <code>Long.MIN_VALUE</code> (which is the correct result if
   * the result is considered to be unsigned). If <code>x &lt; 0</code>,
   * then the result is 0.
   *
   * @param x value to round up
   * @return a power of 2
   */
  public static long nextPowerOf2(final long x) {
    if (x > 0) {
      final long t = 1L << ((Double.doubleToLongBits(x) >> 52) - 1023);
      return t > 0 && t <= x ? t << 1 : t;
    }
    return x == 0 ? 1 : 0;
    /* // alternative implementation
    x |= x >> 1;
    x |= x >> 2;
    x |= x >> 4;
    x |= x >> 8;
    x |= x >> 16;
    x |= x >> 32;
    return x + 1;
    */
  }

  /**
   * Return the sums of the squares of the digits of a number
   * @param n the number
   * @return sum of squares of digits of <code>n</code>
   */
  public static long digitSumSquares(final long n) {
    long m = Math.abs(n);
    long sum = 0;
    while (m != 0) {
      final long r = m % 10;
      sum += r * r;
      m /= 10;
    }
    return sum;
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
  public static long[] suckInNumbers(final BufferedReader reader) throws IOException {
    final ArrayList<Long> res = new ArrayList<>();
    String line;
    while ((line = reader.readLine()) != null) {
      if (!line.isEmpty() && line.charAt(0) != '#') {
        res.add(Long.valueOf(line));
      }
    }
    final long[] r = new long[res.size()];
    for (int k = 0; k < r.length; ++k) {
      r[k] = res.get(k);
    }
    return r;
  }

  /**
   * Read numbers from a stream into an array.  Empty lines or lines starting
   * with <code>#</code> are ignored. Behaviour on out of range numbers is
   * undefined.
   * @param resource reader source
   * @return array of numbers
   */
  public static long[] suckInNumbers(final String resource) {
    try (final BufferedReader r = IOUtils.reader(resource)) {
      return suckInNumbers(r);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Sum the contents of an arbitrary dimensioned primitive int or Integer array.
   * @param structure array
   * @return sum of the array
   */
  public static Z sum(final Object structure) {
    Z sum = Z.ZERO;
    if (structure.getClass().isArray()) {
      if (structure.getClass().isAssignableFrom(long[].class)) {
        for (final long v : (long[]) structure) {
          sum = sum.add(v);
        }
      } else {
        final Object[] array = (Object[]) structure;
        for (final Object o : array) {
          sum = sum.add(sum(o));
        }
      }
    } else {
      sum = sum.add((Long) structure);
    }
    return sum;
  }

  /**
   * Maximum of an array of values.
   * @param values the possible values
   * @return the maximum
   */
  public static long max(final long... values) {
    long m = Long.MIN_VALUE;
    for (final long v : values) {
      if (v > m) {
        m = v;
      }
    }
    return m;
  }

  /**
   * Minimum of an array of values.
   * @param values the possible values
   * @return the minimum
   */
  public static long min(final long... values) {
    long m = Long.MAX_VALUE;
    for (final long v : values) {
      if (v < m) {
        m = v;
      }
    }
    return m;
  }

  /**
   * Test if the given value is square free.
   * @param n value to test
   * @return true if the number is square free
   */
  public static boolean isSquareFree(final long n) {
    return Jaguar.factor(n).maxExponent() <= 1;
  }

  private static final String PADDING = StringUtils.rep('0', Long.SIZE);

  /**
   * Return a 64-character string containing the binary value of <code>n</code>.
   * @param n number
   * @return padded binary form
   */
  public static String toBinaryString(final long n) {
    final String s = PADDING + Long.toBinaryString(n);
    return s.substring(s.length() - Long.SIZE);
  }

  /**
   * Modular inverse.
   * @param k number
   * @param m modulus
   * @return inverse
   */
  public static long modInverse(long k, long m) {
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
    long p1 = 1;
    long p2 = 0;
    long k1 = k;
    long m1 = m;
    while (k1 > 0) {
      final long q = m1 / k1;
      final long r = m1 % k1;
      final long temp = q * p1 + p2;
      p2 = p1;
      p1 = temp;
      m1 = k1;
      k1 = r;
      neg = !neg;
    }
    return neg ? m - p2 : p2;
  }

  /**
   * Make the array an identity map up to entry <code>n</code>.
   * @param a array
   * @param n maximum entry
   * @return the array
   */
  public static long[] identity(final long[] a, final int n) {
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
  public static long[] identity(final long[] a) {
    return identity(a, a.length);
  }

  /**
   * Make the array an identity map up to entry <code>n</code>.
   * @param length length of array
   * @return the array
   */
  public static long[] identity(final int length) {
    return identity(new long[length], length);
  }

  /**
   * Convert a list of integers specified as a string into an array of longs.
   * The numbers in the string can be space or comma separated.
   * @param string string containing numbers
   * @return long array
   */
  public static long[] toLong(final String string) {
    String s = string;
    if (s.startsWith("[") || s.startsWith("(") || s.startsWith("{")) {
      s = s.substring(1);
    }
    if (s.endsWith("]") || s.endsWith(")") || s.endsWith("}")) {
      s = s.substring(0, s.length() - 1);
    }
    final String[] parts = s.split("[, ]+");
    final long[] res = new long[parts.length];
    for (int k = 0; k < parts.length; ++k) {
      res[k] = Long.parseLong(parts[k]);
    }
    return res;
  }

  /**
   * Kronecker matrix product (tensor product). Suitable for relatively small integer matrices.
   * @param a first matrix
   * @param b second matrix
   * @return Kronecker product
   */
  public static long[][] kroneckerProduct(final long[][] a, final long[][] b) {
    final long[][] c = new long[a.length * b.length][a[0].length * b[0].length];
    for (int y = 0; y < a.length; ++y) {
      for (int x = 0; x < a[0].length; ++x) {
        for (int u = 0; u < b.length; ++u) {
          for (int v = 0; v < b[0].length; ++v) {
            c[y * b.length + u][x * b[0].length + v] = a[y][x] * b[u][v];
          }
        }
      }
    }
    return c;
  }

  /**
   * Kronecker matrix square.
   * @param a matrix
   * @return Kronecker product
   */
  public static long[][] kroneckerSquare(final long[][] a) {
    return kroneckerProduct(a, a);
  }

  /**
   * Compare two arrays of longs.
   * @param a first array
   * @param b second array
   * @return comparison of a and b
   */
  public static int compare(final long[] a, final long[] b) {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = 0; k < a.length; ++k) {
      final int v = Long.compare(a[k], b[k]);
      if (v != 0) {
        return v;
      }
    }
    return 0;
  }

  /**
   * Test if an array of longs is zero
   * @param a array to test
   * @return true iff the array is all zero
   */
  public static boolean isZero(final long... a) {
    for (final long v : a) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Rotate one position left in binary up to leading significant bit.
   * @param n number to rotate
   * @return rotated value
   */
  public static long rotateLeft(final long n) {
    return ((n << 1) + 1) & (LongUtils.nextPowerOf2(n) - 1);
  }

  /**
   * Rotate one position right in binary up to leading significant bit.
   * @param n number to rotate
   * @return rotated value
   */
  public static long rotateRight(final long n) {
    return (n >>> 1) | ((n & 1) << LongUtils.log2(n));
  }

  /**
   * Return the number of times a number divides into another.
   * @param n number
   * @param m divisor
   * @return valuation
   */
  public static int valuation(final long n, final long m) {
    if (m == 2) {
      return Long.numberOfTrailingZeros(n);
    }
    long t = n;
    int k = 0;
    while (t % m == 0) {
      ++k;
      t /= m;
    }
    return k;
  }

  /**
   * Return the mex of a collection.
   * @param mex collection
   * @return mex value
   */
  public static long mex(final Collection<Long> mex) {
    long m = -1;
    while (mex.contains(++m)) {
      // do nothing
    }
    return m;
  }

  /**
   * Test if the given number is a palindrome in the specified base.
   * @param n number to test
   * @param base base to use
   * @return true iff the number is a palindrome
   */
  public static boolean isPalindrome(final long n, final int base) {
    if (base <= 36) {
      return StringUtils.isPalindrome(Long.toString(n, base));
    }
    final ArrayList<Long> digits = new ArrayList<>();
    long t = n;
    while (t != 0) {
      digits.add(t % base);
      t /= base;
    }
    return CollectionUtils.isPalindrome(digits);
  }

  /**
   * Compute the class number for a discriminant.
   * @param discriminant the discriminant
   * @return class number
   */
  public static long classNumber(final long discriminant) {
    long h = 1;
    final long bLimit = sqrt(-discriminant / 3);
    for (long b = discriminant & 1; b <= bLimit; b += 2) {
      final long q = (b * b - discriminant) / 4;
      for (long a = b <= 1 ? 2 : b; a * a <= q; ++a) {
        if (q % a == 0 && gcd(q / a, a, b) == 1) {
          h += a == b || b == 0 || a * a == q ? 1 : 2;
        }
      }
    }
    return h;
  }

  // Faster heuristic algorithms are known

  /**
   * Algorithm 5.3.5 in Cohen, A Course in Computational Algebraic Number Theory
   * @param discriminant the discriminant
   * @return the class number
   */
  public static long hurwitzClassNumber(final long discriminant) {
    assert discriminant < 0; // Handling discriminant > 0 looks very hard
    long h = 1;
    long b = discriminant & 1;
    final long bound = (long) Math.sqrt(Math.abs(discriminant) / 3.0);
    while (true) {
      final long q = (b * b - discriminant) / 4;
      long a = b;
      do {
        if (a <= 1) {
          a = 1;
        } else {
          if (q % a == 0) {
            if (a == b || a * a == q || b == 0) {
              ++h;
            } else {
              h += 2;
            }
          }
        }
        ++a;
      } while (a * a <= q);
      b += 2;
      if (b > bound) {
        return h;
      }
    }
  }

  /**
   * Test if the given number is triangular.
   * @param n number
   * @return true iff the number is triangular
   */
  public static boolean isTriangular(final long n) {
    return isSquare((n << 3) + 1);
  }

  /**
   * Map from integers to natural numbers by interleaving positive and negative numbers.
   * @param n number to encode
   * @return encoding
   */
  public static long z2n(final long n) {
    return n > 0 ? 2 * n : 2 * -n + 1;
  }

  /**
   * Undo the encoding of <code>z2n</code>.
   * @param n encoded number
   * @return decoded number
   */
  public static long n2z(final long n) {
    return (n & 1) == 0 ? n / 2 : (1 - n) / 2;
  }

  /**
   * Sort the digits of a number.
   * @param n number
   * @param base base to use
   * @return sorted number
   */
  public static long sortDigitsAscending(final long n, final int base) {
    if (n == 0) {
      return 0;
    }
    final int[] counts = ZUtils.digitCounts(n, base);
    long res = 0;
    for (int k = 1; k < counts.length; ++k) {
      for (int j = counts[k]; j > 0; --j) {
        res *= base;
        res += k;
      }
    }
    return res;
  }

  /**
   * Sort the digits of a number.
   * @param n number
   * @return sorted number
   */
  public static long sortDigitsAscending(final long n) {
    return sortDigitsAscending(n, 10);
  }

  /**
   * Test if the given number if repdigit in the specified base.
   * @param n number
   * @param base base to test
   * @return true if the number is a repdigit
   */
  public static boolean isRepDigit(final long n, final long base) {
    if (n <= base) {
      return true; // single digit in base b
    }
    final long r = n % base;
    long m = n / base;
    while (m != 0) {
      if (m % base != r) {
        return false;
      }
      m /= base;
    }
    return true;
  }

  /**
   * The numbral multiply operation.
   * @param a multiplicand
   * @param b multiplier
   * @return result of multiplication
   */
  public static long numbralMultiply(long a, long b) {
    long sum = 0;
    while (b != 0) {
      if ((b & 1) == 1) {
        sum |= a;
      }
      a <<= 1;
      b >>>= 1;
    }
    return sum;
  }

  /**
   * Convert a collection to a primitive array.
   * @param c collection
   * @return long array
   */
  public static long[] toLong(final Collection<Long> c) {
    final long[] res = new long[c.size()];
    int k = 0;
    for (final long v : c) {
      res[k++] = v;
    }
    return res;
  }

}
