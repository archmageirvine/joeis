package irvine.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * Provides various functions operating on longs.
 * @author Sean A. Irvine
 */
public final class LongUtils {

  private LongUtils() { }

  /**
   * A hard limit for the <code>modPow</code> function
   */
  public static final long MODLIMIT = (long) Math.sqrt(Long.MAX_VALUE);

  /**
   * Compute <code>a^e mod n</code>, provided n does not exceed sqrt(Long.MAX_VALUE).
   * @param a base
   * @param e exponent
   * @param n modulus
   * @return <code>a^e mod n</code>
   */
  public static long modPow(long a, long e, final long n) {
    if (n <= 0 || n > MODLIMIT) {
      throw new IllegalArgumentException("Modulus cannot be nonpositve or greater than " + MODLIMIT);
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
      // if (r == 0) return 0;
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

  // two less than the number of bits in a long
  private static final int BITS = 62;

  /**
   * Return the integer square root of a positive long. If <code>n&lt;0</code> then an
   * arithmetic exception is thrown.
   * @param n number
   * @return <code>floor(sqrt(n))</code>
   * @throws ArithmeticException if <code>n&lt;0</code>.
   */
  public static long sqrt(final long n) {
    if (n <= 8L) {
      if (n < 0) {
        throw new ArithmeticException();
      } else if (n == 0L) {
        return 0L;
      } else if (n <= 3L) {
        return 1L;
      }
      return 2L;
    } else if (n >= (1L << BITS)) {
      return Z.valueOf(n).sqrt().longValue();
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
   * Compute the number of bits in <code>a</code>. The
   * absolute value of <code>a</code> is considered.
   * @param a number to take logarithm of.
   * @return base 2 logarithm of <code>a</code>
   */
  public static long lg(final long a) {
    if (a > 0) {
      return (Double.doubleToLongBits((double) a) >>> 52) - 1023;
    } else if (a == 0) {
      return 0;
    } else {
      return (Double.doubleToLongBits((double) -a) >>> 52) - 1023;
    }
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
    return (a / gcd(a, b)) * b;
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

  private static final Fast PRIME = new Fast();

  /**
   * Return Euler phi function of a positive long.
   * @param n parameter
   * @return phi(n)
   * @throws IllegalArgumentException if <code>n</code> is less than 1.
   */
  public static long phi(long n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }

    // Handle powers of 2
    if ((n & -n) == n) {
      return n == 1 ? 1 : n / 2;
    }

    // Handle even part
    long two = 1;
    while ((n & 1) == 0) {
      two <<= 1;
      n >>>= 1;
    }
    if (two > 1) {
      two >>>= 1;
    }

    // Handle 3
    long three = 1;
    while (n % 3 == 0) {
      three *= 3;
      n /= 3;
    }
    if (three > 1) {
      three /= 3;
      three <<= 1;
    }

    // Handle 5
    long five = 1;
    while (n % 5 == 0) {
      five *= 5;
      n /= 5;
    }
    if (five > 1) {
      five /= 5;
      five <<= 2;
    }

    long r;
    if (PRIME.isPrime(n)) {
      // Handle prime
      r = n - 1;
    } else {
      // Otherwise exhaustive search whatever is left
      r = 0;
      for (long k = 1; k <= n; ++k) {
        if (gcd(k, n) == 1) {
          ++r;
        }
      }
    }
    return r * two * three * five;
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

  // Faster heuristic algorithms are known

  /**
   * Algorithm 5.3.5 in Cohen, A Course in Computational Algebraic Number Theory
   * @param discriminant the discriminant
   * @return the class number
   */
  public static long classNumber(final long discriminant) {
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

  private static final Random RANDOM = new Random(42);

  /**
   * Fill the array for random long values.  The seed for the first call to this
   * function is always 42.  Hence a deterministic sequence of random values
   * can be produced if this method is called in the same order in a different
   * execution.
   * @param v array to fill
   */
  public static void random(final long[] v) {
    for (int i = 0; i < v.length; ++i) {
      v[i] = RANDOM.nextLong();
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
    return Cheetah.factor(n).maxExponent() <= 1;
  }

  /**
   * Step to the next number with the same number of set bits.
   * @param x current value
   * @return next value
   */
  public static long swizzle(final long x) {
    // the swizzle function from HAKMEM 175
    final long lowestBit = x & -x;
    final long leftBits = x + lowestBit;
    final long changedBits = x ^ leftBits;
    final long rightBits = (changedBits / lowestBit) >>> 2;
    return leftBits | rightBits;
  }

  private static final String PADDING = StringUtils.rep('0', Long.SIZE);

  /**
   * Return a 64-character string containing the binary value of <code>n</code>.
   *
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
   * Return the decimal reverse of a number. For example, reverse 24 is 42.
   * Only for nonnegative.  Might overflow without warning for large inputs.
   * @param n number to reverse
   * @return reverse
   */
  public static long reverse(long n) {
    long r = 0;
    while (n != 0) {
      r *= 10;
      r += n % 10;
      n /= 10;
    }
    return r;
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
   * Return the syndrome of a number; that is, a number with a bit set for each
   * distinct digit of the given number.
   * @param n number to get syndrome of
   * @return syndrome
   */
  public static int syndrome(long n) {
    int s = 0;
    while (n != 0) {
      s |= 1 << (n % 10);
      n /= 10;
    }
    return s;
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
}
