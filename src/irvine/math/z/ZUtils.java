package irvine.math.z;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.function.Function1;
import irvine.math.function.Functions;
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

  /**
   * Largest power of a base that fits in a long.
   * @param base the base
   * @return the power
   */
  public static Z basePower(final int base) {
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
    assert v >= 0 : String.valueOf(v);
    while (v != 0) {
      ++counts[(int) (v % base)];
      v /= base;
    }
  }

  /**
   * Return the count of each digit in the number when written in the specified base.
   * @param n number
   * @param base base to use
   * @return array of the count of each digit
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
   * Return the count of each digit in the number when written in the specified base.
   * @param n number
   * @param base base to use
   * @return array of the count of each digit
   */
  public static int[] digitCounts(final long n, final int base) {
    final int[] counts = new int[base];
    if (n == 0) {
      ++counts[0];
    } else {
      digitCounts(counts, Math.abs(n), base);
    }
    return counts;
  }

  /**
   * Return the count of each digit in the number
   * @param n number
   * @return array of the count of each digit
   */
  public static int[] digitCounts(final Z n) {
    return digitCounts(n, 10);
  }

  /**
   * Return the count of each digit in the number
   * @param n number
   * @return array of the count of each digit
   */
  public static int[] digitCounts(final long n) {
    return digitCounts(n, 10);
  }

  /**
   * Compute the sum of the given powers of the digits in an integer.
   * @param v integer
   * @param base the base
   * @param power power to apply to each digit
   * @return sum of squares of digits
   */
  public static long digitSumPower(long v, final long base, final int power) {
    long sum = 0;
    while (v != 0) {
      final long t = v % base;
      sum += LongUtils.pow(t, power);
      v /= base;
    }
    return sum;
  }

  /**
   * Compute the sum of the squares of the digits in an integer.
   * @param v integer
   * @param base the base
   * @param power power to apply to each digit
   * @return sum of squares of digits
   */
  public static long digitSumPower(Z v, final int base, final int power) {
    final Z bp = basePower(base);
    long sum = 0;
    while (!v.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      sum += digitSumPower(qr[1].longValue(), base, power);
      v = qr[0];
    }
    return sum;
  }

  /**
   * Test if <code>r</code> is a primitive root of <code>n</code>.
   * @param r proposed root
   * @param n modulus
   * @return true if <code>r</code> is a primitive root of <code>n</code>
   */
  public static boolean isPrimitiveRoot(final Z r, final Z n) {
    final Z phi = Functions.PHI.z(n);
    for (final Z pi : Jaguar.factor(phi).toZArray()) {
      if (Z.ONE.equals(r.modPow(phi.divide(pi), n))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415.
   * @param counts number to describe
   * @return description of the number
   */
  public static Z describe(final int[] counts) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < counts.length; ++k) {
      if (counts[k] != 0) {
        sb.append(counts[k]).append(k);
      }
    }
    return new Z(sb);
  }

  /**
   * Return a string that has the same value independent of the permutation
   * of the digits in the number.  That is, all permutations of the same
   * digits will have the same syndrome.
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
   * @param n number to get syndrome of
   * @return the syndrome
   */
  public static String syndrome(final Z n) {
    return Arrays.toString(digitCounts(n));
  }

  /**
   * Strong probable prime test.
   * @param b base to try
   * @param n number to test
   * @return false if number is definitely composite
   */
  public static boolean sprpTest(final Z b, final Z n) {
    // Note: This function is used by Z.isProbablePrime among other things.
    final Z minusone = n.clearBit(0);
    final Z power = minusone.makeOdd();
    long s = minusone.auxiliary();
    Z tt = b.modPow(power, n);
    if (tt.equals(Z.ONE) || tt.equals(minusone)) {
      return true;
    }
    while (--s > 0) {
      tt = tt.modSquare(n);
      if (tt.equals(minusone)) {
        return true;
      }
    }
    return false;
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
   * Read numbers from a stream into an array.  Empty lines or lines starting
   * with <code>#</code> are ignored. Behaviour on out of range numbers is
   * undefined.
   * @param reader source
   * @return list of numbers
   * @throws IOException if an I/O error occurs.
   */
  public static List<Z> read(final BufferedReader reader) throws IOException {
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
   * @return list of numbers
   * @throws IOException if an I/O error occurs.
   */
  public static List<Z> read(final BufferedReader reader, final int column) throws IOException {
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
   * Return integers as an array of longs.
   * @param a array
   * @return Z array
   */
  public static long[] toLong(final Z... a) {
    final long[] res = new long[a.length];
    for (int k = 0; k < res.length; ++k) {
      res[k] = a[k].longValueExact();
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
      if (!Z.ONE.equals(mods[k])) {
        p = product.divide(mods[k]);
        sm = sm.add(divs[k].multiply(p.modInverse(mods[k])).multiply(p));
      }
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

    final FactorSequence fs = Jaguar.factor(mod);
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

  private static List<Z> baseFunction(final Function1 fn, final Z n) {
    int b = 1;
    while (fn.z(b).compareTo(n) <= 0) {
      ++b;
    }
    final List<Z> res = new ArrayList<>();
    Z m = n;
    do {
      final Z[] qr = m.divideAndRemainder(fn.z(--b));
      res.add(qr[0]);
      m = qr[1];
    } while (b > 1);
    return res;
  }

  /**
   * Convert a number into a list of digits in factorial base.
   * @param n number to convert
   * @return factorial base digits
   */
  public static List<Z> factorialBaseList(final Z n) {
    return baseFunction(Functions.FACTORIAL, n);
  }

  /**
   * Convert a number into a list of digits in superfactorial base.
   * @param n number to convert
   * @return superfactorial base digits
   */
  public static List<Z> superfactorialBaseList(final Z n) {
    return baseFunction(Functions.SUPERFACTORIAL, n);
  }

  /**
   * The concatenation of the base expansion of a function from lo to hi inclusive.
   * @param lo lower bound
   * @param hi upper bound
   * @param function the function
   * @param base number base for the expansion
   * @return new integer
   */
  public static Z concatenate(final int lo, final int hi, final Function<Integer, Z> function, final int base) {
    final StringBuilder sb = new StringBuilder();
    for (int k = lo; k <= hi; ++k) {
      sb.append(function.apply(k).toString(base));
    }
    return new Z(sb.toString(), base);
  }

  /**
   * The concatenation of the decimal expansion of a function from lo to hi inclusive.
   * @param lo lower bound
   * @param hi upper bound
   * @param function the function
   * @return new integer
   */
  public static Z concatenate(final int lo, final int hi, final Function<Integer, Z> function) {
    return concatenate(lo, hi, function, 10);
  }
}
