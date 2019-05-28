package irvine.math.z;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;

/**
 * Utility functions.
 *
 * @author Sean A. Irvine
 */
public final class ZUtils {

  private ZUtils() { }

  /**
   * Compute the sum of the digits in an integer.
   *
   * @param v integer
   * @param base the base
   * @return sum of digits
   */
  public static long digitSum(long v, final long base) {
    long sum = 0;
    while (v != 0) {
      sum += v % base;
      v /= base;
    }
    return sum;
  }


  /**
   * Compute the sum of the digits in an integer.
   *
   * @param v integer
   * @param base the base
   * @return sum of digits
   */
  public static long digitSum(Z v, final Z base) {
    long sum = 0;
    while (!Z.ZERO.equals(v)) {
      final Z[] qr = v.divideAndRemainder(base);
      sum += qr[1].longValue();
      v = qr[0];
    }
    return sum;
  }

  /**
   * Compute the sum of the digits in an integer.
   *
   * @param v integer
   * @return sum of digits
   */
  public static long digitSum(final long v) {
    return digitSum(v, 10);
  }


  /**
   * Compute the sum of the digits in an integer.
   *
   * @param v integer
   * @return sum of digits
   */
  public static long digitSum(Z v) {
    long sum = 0;
    if (v.bitLength() < Long.SIZE) {
      sum += digitSum(v.longValue());
    } else {
      while (!Z.ZERO.equals(v)) {
        sum += digitSum(v.mod(1000000000000000000L));
        v = v.divide(1000000000000000000L);
      }
    }
    return sum;
  }

  private static long digitProduct(long v) {
    long prod = 1;
    while (v != 0 && prod != 0) {
      prod *= v % 10;
      v /= 10;
    }
    return prod;
  }


  /**
   * Compute the product of the digits in an integer.
   *
   * @param v integer
   * @return product of digits
   */
  public static Z digitProduct(Z v) {
    if (Z.ZERO.equals(v)) {
      return Z.ZERO;
    }
    Z prod = Z.ONE;
    if (v.bitLength() < Long.SIZE) {
      prod = prod.multiply(digitProduct(v.longValue()));
    } else {
      while (!Z.ZERO.equals(v) && !Z.ZERO.equals(prod)) {
        prod = prod.multiply(digitProduct(v.mod(1000000000000000000L)));
        v = v.divide(1000000000000000000L);
      }
    }
    return prod;
  }

  /**
   * Test if <code>r</code> is a primitive root of <code>n</code>.
   *
   * @param r proposed root
   * @param n modulus
   * @return true if <code>r</code> is a primitive root of <code>n</code>
   */
  public static boolean testPrimitiveRoot(final Z r, final Z n) {
    final Z phi = Euler.phi(n);
    for (final Z pi : Cheetah.factor(phi).toZArray()) {
      if (Z.ONE.equals(r.modPow(phi.divide(pi), n))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Find the least primitive root of <code>n</code>.
   *
   * @param n modulus
   * @return least primitive root of <code>n</code>
   */
  public static Z leastPrimitiveRoot(final Z n) {
    if (Z.TWO.equals(n)) {
      return Z.ONE;
    }
    final Z phi = Euler.phi(n);
    Z r = Z.ONE;
    while (true) {
      r = r.add(1);
      boolean ok = true;
      for (final Z pi : Cheetah.factor(phi).toZArray()) {
        if (Z.ONE.equals(r.modPow(phi.divide(pi), n))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return r;
      }
    }
  }

  /**
   * Reverse the digits of a number in specified base.
   * @param n number to reverse
   * @param base base to use
   * @return reversed number
   */
  public static Z reverse(Z n, final long base) {
    final Z b = Z.valueOf(base);
    Z r = Z.ZERO;
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(b);
      r = r.multiply(base);
      r = r.add(qr[1]);
      n = qr[0];
    }
    return r;
  }

  /**
   * Reverse the decimal digits of a number.
   * @param n number to reverse
   * @return reversed number
   */
  public static Z reverse(final Z n) {
    return reverse(n, 10);
  }

  /**
   * Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415.
   * @param n number to describe
   * @return description of the number
   */
  public static Z describe(final Z n) {
    final String s = n.toString();
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    char b = s.charAt(0);
    for (int k = 1; k < s.length(); ++k) {
      final char d = s.charAt(k);
      if (d != b) {
        sb.append(c).append(b);
        b = d;
        c = 1;
      } else {
        ++c;
      }
    }
    sb.append(c).append(b);
    return new Z(sb);
  }

  /**
   * Return a string that has the same value independent of the permutation
   * of the digits in the number.  That is, all permutations of the same
   * digits will have the same syndrome.
   *
   * @param s string to get syndrome of
   * @return the syndrome
   */
  public static String syndrome(final String s) {
    final int[] c = new int[10];
    for (int k = 0; k < s.length(); ++k) {
      c[s.charAt(k) - '0']++;
    }
    return Arrays.toString(c);
  }

  /**
   * Return a string that has the same value independent of the permutation
   * of the digits in the number.  That is, all permutations of the same
   * digits will have the same syndrome.
   *
   * @param n number to get syndrome of
   * @return the syndrome
   */
  public static String syndrome(final Z n) {
    return syndrome(n.toString());
  }

  /**
   * Strong probable prime test.
   *
   * @param b base to try
   * @param n number to test
   * @return false if number if definitely composite
   */
  public static boolean sprpTest(final long b, final Z n) {
    final Z minusone = n.clearBit(0);
    final Z base = Z.valueOf(b);
    int s = 0;
    Z power = minusone;
    do {
      power = power.divide2();
      ++s;
    } while (power.isEven());
    Z tt = base.modPow(power, n);
    if (tt.equals(Z.ONE) || tt.equals(minusone)) {
      return true;
    }
    while (--s > 0) {
      tt = tt.multiply(tt).mod(n);
      if (tt.equals(minusone)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Convenience method for summing with respect to a Mobius value.  In particular,
   * if <code>m&gt;0</code> then compute <code>s+a</code>, if <code>m&lt;0</code>
   * then compute <code>s-a</code>; otherwise return <code>s</code>
   * @param m Mobius value
   * @param s base
   * @param a addend or subtrahend
   * @return Mobius sum
   */
  public static Z mobiusAdd(final int m, final Z s, final Z a) {
    return m == 0 ? s : s.signedAdd(m > 0, a);
  }

  /**
   * The order of a number in another.
   * @param a divisor
   * @param b number to be divided
   * @return the largest <code>n</code> such that <code>a^n</code> divides <code>b</code>
   */
  public static int ord(final Z a, Z b) {
    int d = 0;
    while (Z.ZERO.equals(b.mod(a))) {
      ++d;
      b = b.divide(a);
    }
    return d;
  }

  // Based on LiDIA
  /**
   * The smallest remainder of <code>b.mod(mod)</code>.
   * @param b number
   * @param mod modulus
   * @return best remainder
   */
  public static Z bestRemainder(final Z b, final Z mod) {
    if (Z.ONE.equals(mod) || Z.ZERO.equals(b)) {
      return Z.ZERO;
    }
    final Z mod2 = mod.divide2();
    final Z mod2neg = mod2.negate();
    if (b.compareTo(mod2neg) > 0 && b.compareTo(mod2) <= 0) {
      return b;
    }
    Z a = b.mod(mod);
    if (a.compareTo(mod2neg) <= 0) {
      a = a.add(mod);
    }
    if (a.compareTo(mod2) > 0) {
      a = a.subtract(mod);
    }
    return a;
  }

  /**
   * Return the minimum value in a collection.
   * @param s collection
   * @return minimum value or null if the collection is empty
   */
  public static Z min(final Collection<Z> s) {
    Z m = null;
    for (final Z z : s) {
      if (m == null || z.compareTo(m) < 0) {
        m = z;
      }
    }
    return m;
  }

  /**
   * Return the maximum value in a collection.
   * @param s collection
   * @return maximum value or null if the collection is empty
   */
  public static Z max(final Collection<Z> s) {
    Z m = null;
    for (final Z z : s) {
      if (m == null || z.compareTo(m) > 0) {
        m = z;
      }
    }
    return m;
  }

  /**
   * Return the maximum value if an array.
   * @param v values
   * @return maximum
   */
  public static Z max(final Z... v) {
    if (v == null || v.length == 0) {
      return null;
    }
    Z m = v[0];
    for (int k = 1; k < v.length; ++k) {
      if (v[k].compareTo(m) > 0) {
        m = v[k];
      }
    }
    return m;
  }

  /**
   * Return the minimum value if an array.
   * @param v values
   * @return minimum
   */
  public static Z min(final Z... v) {
    if (v == null || v.length == 0) {
      return null;
    }
    Z m = v[0];
    for (int k = 1; k < v.length; ++k) {
      if (v[k].compareTo(m) < 0) {
        m = v[k];
      }
    }
    return m;
  }

  /**
   * Return the product of all primes up to a number.
   * @param n index
   * @return primorial of <code>n</code>
   */
  public static Z primorial(final long n) {
    final Fast prime = new Fast();
    Z p = Z.ONE;
    for (long k = 2; k <= n; k = prime.nextPrime(k)) {
      p = p.multiply(k);
    }
    return p;
  }

  /**
   * Return the product of all primes up to a number.
   * @param n number of primes to include
   * @return primorial of <code>n</code>
   */
  public static Z primorialCount(final long n) {
    final Fast prime = new Fast();
    Z p = Z.ONE;
    for (long k = 2, j = 0; j < n; k = prime.nextPrime(k), ++j) {
      p = p.multiply(k);
    }
    return p;
  }

  /**
   * Read numbers from a stream into an array.  Empty lines or lines starting
   * with <code>#</code> are ignored. Behaviour on out of range numbers is
   * undefined.
   * @param reader source
   * @return array of numbers
   * @throws IOException if an I/O error occurs.
   */
  public static List<Z> suckInNumbers(final BufferedReader reader) throws IOException {
    final ArrayList<Z> res = new ArrayList<>();
    String line;
    while ((line = reader.readLine()) != null) {
      if (!line.isEmpty() && line.charAt(0) != '#') {
        res.add(new Z(line));
      }
    }
    return res;
  }

  private static final Random RANDOM = new Random();

  /**
   * Generate a random number in the range <code>[0,n)</code>.
   * @param random underlying source of randomness
   * @param max exclusive maximum value
   * @return random value
   */
  public static Z random(final Random random, final Z max) {
    if (max.signum() != 1) {
      throw new IllegalArgumentException();
    }
    // The following +1 is redundant for max an exact power of 2, but simpler like this
    final int bits = max.bitLength() + 1;
    final int wordCount = (bits + Z.BASE_BITS - 1) / Z.BASE_BITS;
    final int excessInLastWord = wordCount * Z.BASE_BITS - bits;
    assert excessInLastWord >= 0 && excessInLastWord < Z.BASE_BITS : String.valueOf(excessInLastWord) + " " + bits;
    //assert Z.BASE_BITS < 31;
    final int lastWordMask = -1 >>> excessInLastWord;
    final int[] words = new int[wordCount];
    // Loop until we get a number in range
    while (true) {
      for (int k = 0; k < words.length; ++k) {
        words[k] = random.nextInt(Z.BASE);
      }
      words[words.length - 1] &= lastWordMask;
      // Be careful with the case where there are leading zeros
      int u = words.length;
      while (u > 0 && words[u - 1] == 0) {
        --u;
      }
      final Z candidate = new Z(words, u);
      if (candidate.compareTo(max) < 0) {
        return candidate;
      }
    }
  }

  /**
   * Generate a random number in the range <code>[0,n)</code>.
   * @param max exclusive maximum value
   * @return random value
   */
  public static Z random(final Z max) {
    return random(RANDOM, max);
  }

  /**
   * Step to the next number with the same number of set bits.
   * @param x current value
   * @return next value
   */
  public static Z swizzle(final Z x) {
    // the swizzle function from HAKMEM 175
    final Z lowestBit = x.and(x.negate());
    final Z leftBits = x.add(lowestBit);
    final Z changedBits = x.xor(leftBits);
    final Z rightBits = changedBits.divide(lowestBit).shiftRight(2);
    return leftBits.or(rightBits);
  }

  /**
   * Return the count of each digit in the number
   * @param n number
   * @return count of each digit
   */
  public static int[] digitCounts(final Z n) {
    final int[] counts = new int[10];
    if (Z.ZERO.equals(n)) {
      ++counts[0];
    } else {
      Z m = n.abs();
      while (!Z.ZERO.equals(m)) {
        ++counts[(int) m.mod(10)];
        m = m.divide(10);
      }
    }
    return counts;
  }

  /**
   * Return longs as an array of integers.
   * @param a array
   * @return Z array
   */
  public static Z[] toZ(final long... a) {
    final Z[] res = new Z[a.length];
    for (int k = 0; k < res.length; ++k) {
      res[k] = Z.valueOf(a[k]);
    }
    return res;
  }
}
