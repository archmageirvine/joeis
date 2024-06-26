package irvine.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import irvine.math.function.Functions;
import irvine.math.z.Z;
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
    return ((n << 1) + 1) & (Functions.NEXT_POWER_OF_2.l(n) - 1);
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
   * Compute the class number for a discriminant.
   * @param discriminant the discriminant
   * @return class number
   */
  public static long classNumber(final long discriminant) {
    long h = 1;
    final long n = -discriminant / 3;
    final long bLimit = Functions.SQRT.l(n);
    for (long b = discriminant & 1; b <= bLimit; b += 2) {
      final long q = (b * b - discriminant) / 4;
      for (long a = b <= 1 ? 2 : b; a * a <= q; ++a) {
        if (q % a == 0 && Functions.GCD.l(q / a, a, b) == 1) {
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
