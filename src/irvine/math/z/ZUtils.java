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
import irvine.factor.util.FactorSequence;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicIntArray;

/**
 * Utility functions.
 * @author Sean A. Irvine
 */
public final class ZUtils {

  private ZUtils() { }

  // Several functions relating to processing the digits of a number in a particular
  // base can be made faster by operating on several digits at a time.  The
  // following tables work out how many digits in a given base safely fit inside a
  // signed long.
  private static final DynamicArray<Z> BASE_POWER = new DynamicArray<>();
  private static final DynamicIntArray LOG_BASE_POWER = new DynamicIntArray();

  private static Z basePower(final int base) {
    final Z bp = BASE_POWER.get(base);
    if (bp != null) {
      return bp;
    }
    int lu = 0;
    Z t = Z.valueOf(base);
    Z u = Z.ONE;
    while (t.bitLength() < Long.SIZE) {
      u = t;
      t = t.multiply(base);
      ++lu;
    }
    BASE_POWER.set(base, u);
    LOG_BASE_POWER.set(base, lu);
    return u;
  }

  private static void digitCounts(final int[] counts, long v, final int base) {
    while (v != 0) {
      ++counts[(int) (v % base)];
      v /= base;
    }
  }

  /**
   * Return the count of each digit in the number when written in the specified base.
   * @param n number
   * @param base base to use
   * @return count of each digit
   */
  public static int[] digitCounts(final Z n, final int base) {
    final int[] counts = new int[base];
    if (n.isZero()) {
      ++counts[0];
    } else {
      Z m = n.abs();
      final Z bb = basePower(base);
      final int lu = LOG_BASE_POWER.get(base);
      while (m.compareTo(bb) >= 0) {
        final Z[] qr = m.divideAndRemainder(bb);
        long v = qr[1].longValue();
        for (int k = 0; k < lu; ++k) {
          ++counts[(int) (v % base)];
          v /= base;
        }
        m = qr[0];
      }
      digitCounts(counts, m.longValue(), base);
    }
    return counts;
  }

  /**
   * Return the count of each digit in the number
   * @param n number
   * @return count of each digit
   */
  public static int[] digitCounts(final Z n) {
    return digitCounts(n, 10);
  }

  /**
   * Compute the sum of the digits in an integer.
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
   * @param v integer
   * @param base the base
   * @return sum of digits
   */
  public static long digitSum(Z v, final int base) {
    final Z bp = basePower(base);
    long sum = 0;
    while (!v.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      sum += digitSum(qr[1].longValue(), base);
      v = qr[0];
    }
    return sum;
  }

  /**
   * Compute the sum of the digits in an integer.
   * @param v integer
   * @return sum of digits
   */
  public static long digitSum(final long v) {
    return digitSum(v, 10);
  }

  /**
   * Compute the sum of the digits in an integer.
   * @param v integer
   * @return sum of digits
   */
  public static long digitSum(final Z v) {
    return digitSum(v, 10);
  }

  /**
   * Compute the sum of the squares of the digits in an integer.
   * @param v integer
   * @param base the base
   * @return sum of squares of digits
   */
  public static long digitSumSquares(long v, final long base) {
    long sum = 0;
    while (v != 0) {
      final long t = v % base;
      sum += t * t;
      v /= base;
    }
    return sum;
  }

  /**
   * Compute the sum of the squares of the digits in an integer.
   * @param v integer
   * @param base the base
   * @return sum of squares of digits
   */
  public static long digitSumSquares(Z v, final int base) {
    final Z bp = basePower(base);
    long sum = 0;
    while (!v.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      sum += digitSumSquares(qr[1].longValue(), base);
      v = qr[0];
    }
    return sum;
  }

  /**
   * Compute the sum of the squares of the digits in an integer.
   * @param v integer
   * @return sum of squares of digits
   */
  public static long digitSumSquares(final long v) {
    return digitSumSquares(v, 10);
  }

  /**
   * Compute the sum of the squares of the digits in an integer.
   * @param v integer
   * @return sum of squares of digits
   */
  public static long digitSumSquares(final Z v) {
    return digitSumSquares(v, 10);
  }

  /**
   * Compute the product of the digits in an integer.
   * @param v integer
   * @param base the base
   * @return product of digits
   */
  public static long digitProduct(final long v, final long base) {
    long m = Math.abs(v);
    long p = 1;
    do {
      p *= m % base;
      m /= base;
    } while (m != 0 && p != 0);
    return p;
  }

  /**
   * Compute the product of the digits in an integer.
   * @param v integer
   * @return product of digits
   */
  public static long digitProduct(final long v) {
    return digitProduct(v, 10);
  }

  /**
   * Compute the product of the digits in an integer.
   * @param v integer
   * @param base the base
   * @return product of digits
   */
  public static Z digitProduct(Z v, final int base) {
    if (v.isZero()) {
      return Z.ZERO;
    }
    final Z bp = basePower(base);
    Z prod = Z.ONE;
    while (!v.isZero() && !prod.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      prod = prod.multiply(digitProduct(qr[1].longValue(), base));
      v = qr[0];
    }
    return prod;
  }

  /**
   * Compute the product of the digits in an integer.
   * @param v integer
   * @return product of digits
   */
  public static Z digitProduct(final Z v) {
    return digitProduct(v, 10);
  }

  /**
   * Sort the digits of a number.
   * @param n number
   * @param base base to use
   * @return sorted number
   */
  public static Z sortDigitsAscending(final Z n, final int base) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    final int[] counts = digitCounts(n, base);
    int numDigits = 0;
    for (int k = 1; k < counts.length; ++k) {
      numDigits += counts[k];
    }
    final char[] c = new char[numDigits];
    for (int k = 1, j = 0; k < counts.length; j += counts[k++]) {
      Arrays.fill(c, j, j + counts[k], (char) ('0' + k));
    }
    return new Z(new String(c), base);
  }

  /**
   * Sort the digits of a number.
   * @param n number
   * @return sorted number
   */
  public static Z sortDigitsAscending(final Z n) {
    return sortDigitsAscending(n, 10);
  }

  /**
   * Sort the digits of a number.
   * @param n number
   * @param base the base to use
   * @return sorted number
   */
  public static Z sortDigitsDescending(final Z n, final int base) {
    final int[] counts = digitCounts(n, base);
    int numDigits = 0;
    for (final int count : counts) {
      numDigits += count;
    }
    final char[] c = new char[numDigits];
    for (int k = counts.length - 1, j = 0; k >= 0; j += counts[k--]) {
      Arrays.fill(c, j, j + counts[k], (char) ('0' + k));
    }
    return new Z(new String(c), base);
  }

  /**
   * Sort the digits of a number.
   * @param n number
   * @return sorted number
   */
  public static Z sortDigitsDescending(final Z n) {
    return sortDigitsDescending(n, 10);
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
    while (!n.isZero()) {
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

  private static boolean isPrimitiveRoot(final Z[] primes, final Z phi, final Z n, final Z r) {
    for (final Z pi : primes) {
      if (Z.ONE.equals(r.modPow(phi.divide(pi), n))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Find the least primitive root of <code>n</code>.
   * @param n modulus
   * @return least primitive root of <code>n</code>
   */
  public static Z leastPrimitiveRoot(final Z n) {
    if (Z.TWO.equals(n)) {
      return Z.ONE;
    }
    final Z phi = Euler.phi(n);
    final Z[] primes = Cheetah.factor(phi).toZArray();
    Z r = Z.ONE;
    while (true) {
      r = r.add(1);
      if (isPrimitiveRoot(primes, phi, n, r)) {
        return r;
      }
    }
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
   * Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415.
   * @param n number to describe
   * @return description of the number
   */
  public static Z describe(final int[] cnts) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < cnts.length; ++k) {
      if (cnts[k] != 0) {
        sb.append(cnts[k]).append(k);
      }
    }
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
  public static String syndrome(final CharSequence s) {
    // Like digitCounts, but using string input
    final int[] c = new int[10];
    for (int k = 0; k < s.length(); ++k) {
      ++c[s.charAt(k) - '0'];
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
    return Arrays.toString(digitCounts(n));
  }

  /**
   * Compute a syndrome indicating which digits are present in the given number.
   * @param n number
   * @return syndrome
   */
  public static int syn(Z n) {
    if (n.isZero()) {
      return 1;
    }
    int syndrome = 0;
    while (!n.isZero() && syndrome != 0b1111111111) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      n = qr[0];
      syndrome |= 1 << qr[1].intValue();
    }
    return syndrome;
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
    Z[] qr;
    while ((qr = b.divideAndRemainder(a))[1].isZero()) {
      ++d;
      b = qr[0];
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
    if (Z.ONE.equals(mod) || b.isZero()) {
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
        res.add("?".equals(line) ? null : new Z(line));
      }
    }
    return res;
  }

  /**
   * Read numbers from a stream into an array.  Empty lines or lines starting
   * with <code>#</code> are ignored. Behaviour on out of range numbers is
   * undefined.
   * @param reader source
   * @param column column number (numbered from 0)
   * @return array of numbers
   * @throws IOException if an I/O error occurs.
   */
  public static List<Z> suckInNumbers(final BufferedReader reader, final int column) throws IOException {
    final ArrayList<Z> res = new ArrayList<>();
    String line;
    while ((line = reader.readLine()) != null) {
      if (!line.isEmpty() && line.charAt(0) != '#') {
        final String[] parts = line.split("\\s+");
        res.add(new Z(parts[column]));
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
    assert excessInLastWord >= 0 && excessInLastWord < Z.BASE_BITS : excessInLastWord + " " + bits;
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

  /**
   * Convert a list of integers specified as a string into an array of Z.
   * The numbers in the string can be space or comma separated.
   * @param string string containing numbers
   * @return Z array
   */
  public static Z[] toZ(final String string) {
    String s = string;
    if (s.startsWith("[") || s.startsWith("(") || s.startsWith("{")) {
      s = s.substring(1);
    }
    if (s.endsWith("]") || s.endsWith(")") || s.endsWith("}")) {
      s = s.substring(0, s.length() - 1);
    }
    final String[] parts = s.trim().split("[, ]+");
    final Z[] res = new Z[parts.length];
    for (int k = 0; k < parts.length; ++k) {
      res[k] = new Z(parts[k]);
    }
    return res;
  }

  /**
   * Test if the supplied integers has non-decreasing digits.
   * @param n number to test
   * @return true iff digits are non-decreasing
   */
  public static boolean isNondecreasingDigits(Z n) {
    Z t = Z.TEN;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(t) > 0) {
        return false;
      }
      t = qr[1];
      n = qr[0];
    }
    return true;
  }

  /**
   * Test if the supplied integers has non-increasing digits.
   * @param n number to test
   * @return true iff digits are non-decreasing
   */
  public static boolean isNonincreasingDigits(Z n) {
    Z t = Z.ZERO;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(t) < 0) {
        return false;
      }
      t = qr[1];
      n = qr[0];
    }
    return true;
  }

  /**
   * Test if the decimal expansion of n contain a 0.
   * @param n number to test
   * @return true iff and n contains a zero
   */
  public static boolean containsZero(Z n) {
    if (n.isZero()) {
      return true;
    }
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].isZero()) {
        return true;
      }
      n = qr[0];
    }
    return false;
  }

  /**
   * Chinese remainder theorem (CRT).
   * @param divs arguments
   * @param mods moduli
   * @return smallest solution or null if there is no solution
   */
  public static Z chineseRemainderTheorem(final Z[] divs, final Z[] mods) {
    if (divs.length != mods.length) {
      throw new IllegalArgumentException("Array lengths mismatch");
    }
    final Z product = Arrays.stream(mods).reduce(Z.ONE, Z::multiply);
    Z p;
    Z sm = Z.ZERO;
    for (int k = 0; k < mods.length; ++k) {
      p = product.divide(mods[k]);
      sm = sm.add(divs[k].multiply(p.modInverse(mods[k])).multiply(p));
    }
    return sm.mod(product);
  }

  /**
   * Test if <code>a</code> is a quadratic residue (i.e., a square) for a given modulus.
   * @param a number to test
   * @param mod modulus
   * @return true iff <code>a</code> is a quadratic residue
   */
  public static boolean isQuadraticResidue(final Z a, final Z mod) {
    if (a.mod(mod).isZero()) {
      return true; // 0^2=0
    }
    if (mod.isProbablePrime()) {
      // Avoid factorization for prime cases
      return a.jacobi(mod) == 1;
    }
    if (a.jacobi(mod) == -1) {
      return false;
    }

    final FactorSequence fs = Cheetah.factor(mod);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      Z b = a.mod(p.pow(e));
      if (b.isZero()) {
        continue;
      }
      Z[] qr;
      int k = 0;
      while ((qr = b.divideAndRemainder(p))[1].isZero()) {
        ++k;
        b = qr[0];
      }
      if ((k & 1) == 1) {
        return false;
      }
      if (Z.TWO.equals(p)) {
        if (e == 1) {
          continue;
        }
        final long r = b.mod(8);
        if ((r & 3) != 1) {
          return false;
        }
        if (e >= 3 && r != 1) {
          return false;
        }
      } else {
        if (!Z.ONE.equals(b.modPow(p.subtract(1).divide2(), p))) {
          return false;
        }
      }
    }
    return true;
  }
}
