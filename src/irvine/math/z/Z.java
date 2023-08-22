package irvine.math.z;

import java.math.BigInteger;
import java.util.Arrays;

import irvine.math.r.Constants;

/**
 * An object to hold an immutable large integer.  It provides a superset of the
 * operations provided by Java's <code>BigInteger</code> class and is faster.<p>
 * Differences from <code>BigInteger</code> include:<p>
 * This implementation uses base 2^30 (as opposed to 2^32), this means we can
 * do more operations without resorting to extended precision. We do not
 * force the underlying array to be of minimal length, this simplifies the
 * logic in certain computations, however, we do make a reasonable effort
 * to keep the array at most slightly larger than that which is required
 * to represent the number.<p>
 * It returns a value of 1 for <code>bitLength(-1)</code>.<p>
 * Shift right for negative numbers is different from <code>BigInteger</code>.<p>
 * Many of the routines here are based heavily on the LIP C package by Lenstra.<p>
 *
 * @author Sean A. Irvine
 */
public class Z extends Number implements Comparable<Z> {
  /*
   * Numbers are represented in base 2^30 (allowing a couple of spare
   * bits makes certain computations easier). The bits of the number
   * are stored in mValue which may slightly exceed the number of ints
   * actually required, the valid length is given by |mSign| and the
   * sign of mSign is the sign of the number.
   */

  /** Number of bits used internally for the number base. */
  public static final int BASE_BITS = 30;
  /** The base used to perform computation. */
  static final int BASE = 1 << BASE_BITS;
  /** Double version of the base. */
  static final double DBASE = BASE;
  /** A bit mask for BASE_BITS. */
  static final int BASE_MASK = BASE - 1;
  /** Inverse of base. */
  static final double BASE_INV = 1.0 / BASE;
  /** Number of bits in the root. */
  static final int BASE_BITS_SH = BASE_BITS >>> 1;
  /** Root of the base. */
  static final int BASE_ROOT = 1 << BASE_BITS_SH;

  /** The number with most significant bits in <code>mValue[0]</code>. */
  final int[] mValue;
  /** Holds the valid length of <code>mValue</code> multiplied by its sign. */
  int mSign;
  private int mCachedBitLength = -1;
  private int mCachedBitCount = mCachedBitLength;
  /** Cached first nonzero digit in the representation. */
  int mFirstNonzeroDigitIndex = mCachedBitLength;
  /* Holds an auxiliary long output, used by certain functions. */
  long mAuxiliary = 0;

  /**
   * Return an integer with the same value as the specified long.
   * @param val a long value
   * @return an integer with the value <code>val</code>
   */
  public static Z valueOf(final long val) {
    return Convert.valueOf(val);
  }

  /** The constant zero. */
  public static final Z ZERO = new Z(new int[0], 0);
  /** The constant one. */
  public static final Z ONE = Z.valueOf(1L);
  /** The constant two. */
  public static final Z TWO = Z.valueOf(2L);
  /** The constant three. */
  public static final Z THREE = Z.valueOf(3L);
  /** The constant four. */
  public static final Z FOUR = Z.valueOf(4L);
  /** The constant five. */
  public static final Z FIVE = Z.valueOf(5L);
  /** The constant six. */
  public static final Z SIX = Z.valueOf(6L);
  /** The constant seven. */
  public static final Z SEVEN = Z.valueOf(7L);
  /** The constant eight. */
  public static final Z EIGHT = Z.valueOf(8L);
  /** The constant eight. */
  public static final Z NINE = Z.valueOf(9L);
  /** The constant eight. */
  public static final Z TEN = Z.valueOf(10L);
  /** The constant negative one. */
  public static final Z NEG_ONE = Z.valueOf(-1L);

  /**
   * Directly construct the number.  Performs no error checking, assumes user
   * is being careful and knows what is right. Also, very bad things could
   * happen if the user modifies the array after calling this function.
   * @param value number bits
   * @param sign sign*length value
   */
  public Z(final int[] value, final int sign) {
    assert sign == 0 || value[(sign > 0 ? sign : -sign) - 1] != 0 : "Bad construction";
    mValue = value;
    mSign = sign;
  }

  /**
   * Construct a new integer from a string.  The digits are interpreted
   * in the specified base with either lower or upper case letters for
   * numerals with value greater than nine. The number may be preceded
   * by a `-' sign to denote a negative value.
   * @param val number represented as a string
   * @param radix the radix in the range 2 to 36 inclusive
   * @exception IllegalArgumentException if the radix is outside the range
   * 2 to 36 inclusive.
   * @exception NullPointerException if <code>val</code> is null.
   */
  public Z(final CharSequence val, final int radix) {
    // this is ugly!!!!
    final Z a = Convert.valueOf(val, radix);
    mSign = a.mSign;
    mValue = a.mValue;
  }

  /**
   * Construct a new integer from a decimal string. The number may be preceded
   * by a `-' sign to denote a negative value.
   * @param val number represented as a string
   * @exception NullPointerException if <code>val</code> is null.
   */
  public Z(final CharSequence val) {
    this(val, 10);
  }

  /**
   * Retrieve an auxiliary result after an operation.  For example,
   * the remainder when using <code>divide()</code> or <code>divide2()</code>,
   * the exponent reduction when using <code>makeOdd()</code>.
   * @return auxiliary result
   */
  public long auxiliary() {
    return mAuxiliary;
  }

  @Override
  public boolean equals(final Object n) {
    return Compare.equals(this, n);
  }

  @Override
  public int hashCode() {
    int hashCode = 0;
    final int len = mSign < 0 ? -mSign : mSign;
    for (int i = 0; i < len; ++i) {
      hashCode = 31 * hashCode + mValue[i];
    }
    return hashCode * mSign;
  }

  Z copy() {
    return new Z(Arrays.copyOf(mValue, mSign > 0 ? mSign : -mSign), mSign);
  }

  /**
   * Return the sign of this integer.  That is 1 for positive
   * integers, 0 for zero, and -1 for negative integers.
   * @return sign
   */
  public int signum() {
    return (-mSign >>> 31) | (mSign >> 31);
  }

  /**
   * The number of bits needed to represent this number excluding a sign bit.
   * @return bit length of this number
   */
  public int bitLength() {
    if (mCachedBitLength == -1) {
      mCachedBitLength = Bit.bitLength(this);
    }
    return mCachedBitLength;
  }

  /**
   * Returns the number of bits in the two's complement representation of this
   * number which differ from the sign bit. For positive numbers this is a
   * population count.
   * @return numbers of bits differing from the sign
   */
  public int bitCount() {
    if (mCachedBitCount == -1) {
      mCachedBitCount = Bit.bitCount(this);
    }
    return mCachedBitCount;
  }

  /**
   * Convert this number into a Java BigInteger of the same value.
   * @return BigInteger version of this number
   */
  public BigInteger bigIntegerValue() {
    return Convert.bigIntegerValue(this);
  }

  @Override
  public long longValue() {
    return Convert.longValue(this);
  }

  @Override
  public int intValue() {
    return (int) longValue();
  }

  @Override
  public double doubleValue() {
    return Convert.doubleValue(this);
  }

  @Override
  public float floatValue() {
    return (float) doubleValue();
  }

  /**
   * Convert this integer to a byte with bounds checking.
   * @return byte value
   * @throws ArithmeticException if the value will not fit in a byte
   */
  public byte byteValueExact() {
    if (bitLength() > 7) {
      throw new ArithmeticException();
    }
    return byteValue();
  }

  /**
   * Convert this integer to a short with bounds checking.
   * @return short value
   * @throws ArithmeticException if the value will not fit in a short
   */
  public short shortValueExact() {
    if (bitLength() > 15) {
      throw new ArithmeticException();
    }
    return shortValue();
  }

  /**
   * Convert this integer to an int with bounds checking.
   * @return int value
   * @throws ArithmeticException if the value will not fit in an int
   */
  public int intValueExact() {
    if (bitLength() > 31) {
      throw new ArithmeticException();
    }
    return intValue();
  }

  /**
   * Convert this integer to a long with bounds checking.
   * @return long value
   * @throws ArithmeticException if the value will not fit in a long
   */
  public long longValueExact() {
    if (bitLength() > 63) {
      throw new ArithmeticException();
    }
    return longValue();
  }

  /**
   * Convert a Java <code>BigInteger</code> to Z format.
   * @param val integer to convert
   * @return Z version of this number
   */
  public static Z valueOf(final BigInteger val) {
    return Convert.valueOf(val);
  }

  /**
   * Return an integer whose value is the absolute value of this integer.
   * @return absolute value
   */
  public Z abs() {
    return mSign >= 0 ? this : new Z(mValue, -mSign);
  }

  /**
   * Return an integer whose value is the negation of this integer.
   * @return negated value
   */
  public Z negate() {
    return mSign == 0 ? this : new Z(mValue, -mSign);
  }

  /**
   * Compares this integer with the specified integer. This method is provided in
   * preference to individual methods for each of the six boolean comparison operators
   * (&lt;, ==, &gt;, &gt;=, !=, &lt;=). The suggested idiom for performing these
   * comparisons is: <code>(x.compareTo(y) <i>op</i> 0)</code>, where <i>op</i> is one
   * of the six comparison operators.
   * @param n integer to compare against
   * @return -1, 0 or 1 as this integer is numerically less than, equal to, or greater
   *         than <code>n</code>.
   */
  @Override
  public int compareTo(final Z n) {
    return Compare.compare(this, n);
  }

  /**
   * Convenience method for adding a long to an integer.
   * @param val value to add
   * @return <code>this + val</code>
   */
  public Z add(final long val) {
    return add(Z.valueOf(val));
  }

  /**
   * Return the sum of this integer and <code>n</code>.
   * @param n number to add
   * @return sum of this and <code>n</code>.
   */
  public Z add(final Z n) {
    return Add.add(this, n);
  }

  /**
   * Convenience method for subtracting a long from an integer.
   * @param val value to subtract
   * @return <code>this - val</code>
   */
  public Z subtract(final long val) {
    return subtract(Z.valueOf(val));
  }

  /**
   * Return an integer which is this integer minus the integer <code>n</code>.
   * @param n integer to subtract
   * @return <code>this-n</code>
   */
  public Z subtract(final Z n) {
    return Sub.subtract(this, n);
  }

  /**
   * Return the bitwise not of this integer. Returns a negative value
   * if and only if this number is non-negative. This computation is
   * arranged so that <code>this=~~this</code>.
   * @return <code>~this</code>
   */
  public Z not() {
    return Logical.not(this);
  }

  /**
   * Return the bitwise and of this integer with <code>n</code>.
   * The sign bits are also anded; thus the result is negative
   * if and only if both inputs are negative.
   * @param n number to and
   * @return <code>this &amp; n</code>
   */
  public Z and(final Z n) {
    return Logical.and(this, n);
  }

  /**
   * Return the bitwise and of this integer with <code>~n</code>.
   * The result is negative if and only if this number is negative
   * and <code>n</code> is positive.
   * @param n number to <code>andNot</code> with
   * @return <code>this &amp; ~n</code>
   */
  public Z andNot(final Z n) {
    return Logical.andNot(this, n);
  }

  /**
   * Return the bitwise or of this integer with <code>n</code>.
   * The sign bits are also ored; thus the result is negative if either input is negative
   * @param n number to or
   * @return <code>this or n</code>
   */
  public Z or(final Z n) {
    return Logical.or(this, n);
  }

  /**
   * Return the bitwise xor of this integer with <code>n</code>. The sign bits are
   * also xored; thus the result is negative if and only if one of the inputs is negative.
   * @param n number to and
   * @return <code>this ^ n</code>
   */
  public Z xor(final Z n) {
    return Logical.xor(this, n);
  }

  /**
   * Return this integer with the specified bit cleared. This operation
   * never changes the sign unless the result becomes zero.
   * @param bitNumber bit number to clear
   * @return integer with the bit cleared
   * @exception ArithmeticException if <code>bitNumber</code> is negative.
   */
  public Z clearBit(final int bitNumber) {
    return Logical.clearBit(this, bitNumber);
  }

  /**
   * Return this integer with the specified bit set. This operation
   * never changes the sign unless the result becomes zero.
   * @param bitNumber bit number to set
   * @return integer with the bit set
   * @exception ArithmeticException if <code>bitNumber</code> is negative.
   */
  public Z setBit(final int bitNumber) {
    return Logical.setBit(this, bitNumber);
  }

  /**
   * Toggle the designated bit on an integer.
   * @param n bit position to toggle
   * @return integer with toggled bit
   * @exception ArithmeticException if <code>n</code>&lt;0.
   */
  public Z flipBit(final int n) {
    return Logical.flipBit(this, n);
  }

  /**
   * Return bit <code>n</code> as a boolean. Numbers have implicit sign extension.
   * @param n bit position
   * @return value of the bit
   * @exception ArithmeticException if <code>n</code> is negative.
   */
  public boolean testBit(final int n) {
    return Logical.testBit(this, n);
  }

  /**
   * Compute the product of this integer with another integer.
   * @param val integer to multiply by
   * @return the product <code>this*val</code>
   */
  public Z multiply(final Z val) {
    return Mul.multiply(this, val);
  }

  /**
   * Multiply an integer by a long.  Provided the long is smaller than the
   * base this is more efficient than first converting the long into an integer.
   * @param val multiplicand
   * @return <code>this * val</code>
   */
  public Z multiply(final long val) {
    return Mul.multiply(this, val);
  }

  /**
   * Convenience method to multiply by 2. More efficient than other ways of
   * achieving this result.
   * @return integer multiplied by 2.
   */
  public Z multiply2() {
    return Mul2.mul2(this);
  }

  /**
   * Convenience method to divide by 2. More efficient than other ways of
   * achieving this result.  Also sets the auxiliary variable.
   * @return integer divided by 2.
   */
  public Z divide2() {
    return Div2.div2(this);
  }

  /**
   * Compute the quotient and remainder of this integer divided by <code>n</code>.
   * The first element of the returned array is the quotient and the second
   * element is the remainder.
   * @param n number to divide by
   * @return quotient and remainder
   * @exception ArithmeticException if <code>n</code> is 0.
   */
  public Z[] divideAndRemainder(final Z n) {
    return Div.divideAndRemainder(this, n);
  }

  /**
   * Divide this integer by the specified long and return the
   * quotient. After this call, it is possible to call <code>auxiliary()</code>
   * to retrieve the corresponding remainder.
   * @param d divisor
   * @return quotient
   */
  public Z divide(final long d) {
    return Div.divide(this, d);
  }

  /**
   * Return the quotient of this integer divided by <code>n</code>.
   * @param n integer to divide by
   * @return quotient
   */
  public Z divide(final Z n) {
    return divideAndRemainder(n)[0];
  }

  /**
   * Return the remainder of this integer divided by <code>n</code>.
   * @param n integer to divide by
   * @return remainder
   */
  public Z remainder(final Z n) {
    return divideAndRemainder(n)[1];
  }

  /**
   * Perform a left shift on this integer.  Conceptually does
   * <code>this &lt;&lt; k</code> for <code>k&gt;=0</code>.
   * @param k shift
   * @return integer left-shifted by <code>k</code>.
   */
  public Z shiftLeft(final long k) {
    return Shift.shiftLeft(this, k);
  }

  /**
   * Perform a right shift on this integer.  Conceptually does
   * <code>this &gt;&gt; k</code> for <code>k&gt;=0</code>.
   * Unlike <code>BigInteger</code> does not copy down the sign bit into the result.
   * The answer always has the same sign as the argument unless the result becomes zero.
   * @param k shift
   * @return integer right-shifted by <code>k</code>.
   */
  public Z shiftRight(final long k) {
    return Shift.shiftRight(this, k);
  }

  /**
   * Return an odd version of this number.  If this integer is zero then no change
   * occurs but the auxiliary is set to -1; otherwise shifts the number right
   * repeatedly until the right-most bit is 1. After the operation the
   * <code>auxiliary()</code> contains the number of positions shifted.  Thus,
   * <code>this=2^auxiliary()*makeOdd()</code>.
   * @return odd version of this
   */
  public Z makeOdd() {
    return Bit.makeOdd(this);
  }

  /**
   * Return the index of the lowest set bit in this integer. Returns
   * -1 if there are no set bits (i.e. this integer is zero).
   * @return index of lowest set bit.
   */
  public int getLowestSetBit() {
    return Bit.getLowestSetBit(this);
  }

  /**
   * Return the square of this integer.
   * @return <code>this^2</code>
   */
  public Z square() {
    return Sqr.square(this);
  }

  /**
   * Compute the <code>n</code>th root of this integer. In addition, the
   * auxiliary is set to 1 for a perfect <code>n</code>th root and 0 otherwise.
   * @param n root number
   * @return <code>n</code>th root
   * @exception ArithmeticException for n zero or even root of
   * negative number or negative root of zero.
   */
  public Z root(final int n) {
    return Root.root(this, n);
  }

  /**
   * Return the square root of this integer.  The value of sqrt()[0]
   * is the floor of the square root and sqrt()[1] is the difference
   * such that <code>this=r[0]^2+r[1]</code> where <code>r</code> is
   * the result of calling this function.  In addition, the auxiliary
   * is set to 1 if this integer is a perfect square and 0 otherwise.
   * This is more efficient than calling <code>root(2)</code>.
   * @return root and difference
   * @exception ArithmeticException for an attempt to take the square
   * root of a negative number.
   */
  public Z[] sqrtAndRemainder() {
    return Sqrt.sqrt(this);
  }

  /**
   * Return the square root of this integer. Sets auxiliary to 1
   * for a perfect square and 0 otherwise.
   * @return square root
   * @exception ArithmeticException for an attempt to take the square
   * root of a negative number.
   */
  public Z sqrt() {
    return Sqrt.sqrt(this)[0];
  }

  /**
   * Test if this number is a square.
   * @return true iff this number is a perfect square
   */
  public boolean isSquare() {
    return signum() >= 0 && Sqrt.sqrt(this)[1].isZero();
  }

  /**
   * Compute this integer modulo another integer.  The sign of
   * result is the sign of the moduli unless the result is 0.
   * @param n moduli
   * @return <code>this%n</code>
   * @exception ArithmeticException if <code>n</code> is 0.
   */
  public long mod(final long n) {
    divide(n);
    return mAuxiliary;
  }

  /**
   * Compute this integer modulo a long.
   * @param n moduli
   * @return <code>this%n</code>
   * @exception ArithmeticException if <code>n</code> is 0.
   */
  public Z mod(final Z n) {
    return Mod.mod(this, n);
  }

  /**
   * Return the greatest common divisor of this integer with another integer.
   * @param n other integer
   * @return the gcd
   */
  public Z gcd(final Z n) {
    return Gcd.gcd(this, n);
  }

  /**
   * Return the greatest common divisor of this integer with another integer.
   * @param n other integer
   * @return the gcd
   */
  public Z gcd(final long n) {
    return Gcd.gcd(this, Z.valueOf(n));
  }

  /**
   * Return the least common multiple of this integer with another integer.
   * @param n other integer
   * @return the lcm
   */
  public Z lcm(final Z n) {
    return multiply(n.divide(gcd(n)));
  }

  /**
   * Return the least common multiple of this integer with another integer.
   * @param n other integer
   * @return the lcm
   */
  public Z lcm(final long n) {
    return lcm(Z.valueOf(n));
  }

  /**
   * Returns the maximum of this integer and <code>val</code>.
   * @param  val value with with the maximum is to be computed.
   * @return the integer whose value is the greater of this and
   * <code>val</code>.  If they are equal, either may be returned.
   */
  public Z max(final Z val) {
    return compareTo(val) > 0 ? this : val;
  }

  /**
   * Returns the minimum of this integer and <code>val</code>.
   * @param  val value with with the minimum is to be computed.
   * @return the integer whose value is the lesser of this integer and
   * <code>val</code>.  If they are equal, either may be returned.
   */
  public Z min(final Z val) {
    return compareTo(val) < 0 ? this : val;
  }

  /**
   * Compute the natural logarithm of the absolute value of this integer.
   * @return <code>ln(abs(this))</code>
   * @exception ArithmeticException if this integer is zero.
   */
  public double ln() {
    if (mSign == 0) {
      throw new ArithmeticException("ln(0) undefined");
    }
    final int sa = mSign < 0 ? -mSign : mSign;
    if (sa == 1) {
      return Math.log(mValue[0]);
    }
    return (sa - 2) * BASE_BITS * Constants.LN2 + Math.log(DBASE * mValue[sa - 1] + mValue[sa - 2]);
  }

  /**
   * Compute the base <code>base</code> logarithm of the absolute value of this integer.
   * @param base logarithm base
   * @return <code>log(abs(this))</code> in the specified base
   * @exception ArithmeticException if this integer is zero or if base &lt;= 1.
   */
  public double log(final long base) {
    return log((double) base);
  }

  /**
   * Compute the base <code>base</code> logarithm of the absolute value of this integer.
   * @param base logarithm base
   * @return <code>log(abs(this))</code> in the specified base
   * @exception ArithmeticException if this integer is zero or if base &lt;= 1.
   */
  public double log(final double base) {
    if (base <= 1.0) {
      throw new ArithmeticException("Base " + base + " for log");
    }
    return ln() / Math.log(base);
  }

  /**
   * Powering.  Computes this integer to the power of <code>exponent</code>.
   * @param exponent exponent
   * @return <code>this^exponent</code>
   * @exception ArithmeticException if <code>exponent</code> is negative
   * and power would entail a non-integral result.
   */
  public Z pow(final Z exponent) {
    return Pow.pow(this, exponent);
  }

  /**
   * Convenience method for powering by an integer.  Computes this
   * integer to the power of <code>exponent</code>.
   * @param exponent exponent
   * @return <code>this^exponent</code>
   * @exception ArithmeticException is <code>exponent</code> is negative
   * since this would entail a non-integral result.
   */
  public Z pow(final long exponent) {
    return Pow.pow(this, exponent);
  }

  /**
   * If this integer and <code>n</code> are coprime, then returns
   * an integer <code>inv</code> such that <code>(inv*this)(mod n)=1</code>
   * and sets the auxiliary variable to 0.  Otherwise the result is
   * <code>gcd(this,n)</code> and the auxiliary is set to 1.  The
   * computation is done using Lehmer's trick.
   *
   * @param n modulus
   * @return inverse
   * @exception ArithmeticException if this integer is zero, the
   * modulus is zero, or either input is negative.
   */
  public Z modInverse(final Z n) {
    if (mSign <= 0 || n.mSign <= 0) {
      throw new ArithmeticException("Inverse of " + this + " (mod " + n + ") not defined.");
    } else if (n.mSign == 1 && n.mValue[0] == 1) {
      throw new ArithmeticException("Modulus 1 not supported.");
    }
    final Z[] r = Euclid.euclid(this, n);
    if (Z.ONE.equals(r[1])) {
      mAuxiliary = 0L;
      return r[0];
    } else {
      mAuxiliary = 1L;
      return r[1];
    }
  }

  /**
   * Compute the square of this integer modulo the given modulus.
   *
   * @param modulus the modulus
   * @return <code>this^2(mod modulus)</code>
   * @exception ArithmeticException if <code>modulus</code> is zero.
   */
  public Z modSquare(final Z modulus) {
    return square().mod(modulus);
  }

  /**
   * Convenience method for multiplication with a modulus. An
   * abbreviation for <code>multiply(n).mod(modulus)</code>.
   *
   * @param n number to multiply by
   * @param modulus modulus
   * @return <code>(this*n)(mod modulus)</code>
   */
  public Z modMultiply(final Z n, final Z modulus) {
    return multiply(n).mod(modulus);
  }

  /**
   * Convenience method for multiplication with a modulus. An
   * abbreviation for <code>multiply(n).mod(modulus)</code>.
   *
   * @param n number to multiply by
   * @param modulus modulus
   * @return <code>(this*n)(mod modulus)</code>
   */
  public Z modMultiply(final long n, final Z modulus) {
    if (modulus.mSign == 0) {
      throw new ArithmeticException("Zero modulus");
    } else if (n == 0 || mSign == 0) {
      return Z.ZERO;
    }
    return multiply(n).mod(modulus);
  }

  /**
   * Compute powers with a modulus.  This is generally more efficient
   * than calling pow(exponent).mod(modulus) and prevents the intermediate
   * result becoming excessively large. Permits negative exponents where
   * it makes sense.
   *
   * @param exponent exponent
   * @param modulus modulus
   * @return <code>this^exponent(mod modulus)</code>
   * @exception IllegalArgumentException for zero modulus.
   * @exception ArithmeticException for non-invertible quotients when
   * using negative exponents.
   */
  public Z modPow(final Z exponent, final Z modulus) {
    return ModPow.modPow(this, exponent, modulus);
  }

  /**
   * Addition modulo a number. Computes this + b modulo n. Assumes
   * both a and b are in the range 0 to n.
   *
   * @param b addend
   * @param n modulus
   * @return <code>this + a modulo n</code>
   * @exception ArithmeticException if the modulus is 0.
   */
  public Z modAdd(final Z b, final Z n) {
    if (n.mSign == 0) {
      throw new ArithmeticException("Zero modulus");
    } else if (b.mSign == 0) {
      return this;
    } else if (mSign == 0) {
      return b;
    }
    final Z c = add(b);
    return c.compareTo(n) >= 0 ? Sub.sub(c, n) : c;
  }

  /**
   * Subtraction modulo a number.  Computes this - b modulo n. Assumes
   * both a and b are in the range 0 to n.
   *
   * @param b subtrahend
   * @param n modulus
   * @return <code>this - b modulo n</code>
   * @exception ArithmeticException if the modulus is 0.
   */
  public Z modSubtract(final Z b, final Z n) {
    if (n.mSign == 0) {
      throw new ArithmeticException("Zero modulus");
    } else if (b.mSign == 0) {
      return this;
    } else if (mSign == 0) {
      return Sub.subtract(n, b);
    }
    final Z c = subtract(b);
    return c.mSign < 0 ? c.add(n) : c;
  }

  /**
   * Test if this integer is a perfect power.  If it is then returns the base
   * of the power and sets the auxiliary to the relevant exponent.  Otherwise,
   * return null.  Returns null for all inputs &lt;= 1.
   * @return x such that x^a=this or null if no such x exists.
   */
  public Z isPower() {
    return IsPower.isPower(this);
  }

  @Override
  public String toString() {
    return ZString.toString(this);
  }

  /**
   * Return this integer as a string in the specified base.  The result
   * will be prefixed by a minus sign if appropriate.
   * @param base base
   * @return string representation.
   * @exception IllegalArgumentException if base is less than 2 or more than 36.
   */
  public String toString(final int base) {
    return ZString.toString(this, base);
  }

  /**
   * Return this integer as a string in the specified base,
   * where each digit in base is represented by two decimal digits.
   * The result will be prefixed by a minus sign if appropriate,
   * and has no leading zero.
   * @param base base
   * @return string representation.
   * @exception IllegalArgumentException if base is less than 11 or more than 99.
   */
  public String toTwoDigits(final int base) {
    return ZString.toTwoDigits(this, base);
  }

  /**
   * Return this integer as a two-complement byte array with the
   * most significant byte of the integer in the zeroth array
   * position (that is, big-endian order).
   * @return byte array representation
   */
  public byte[] toByteArray() {
    return ZByteArray.toByteArray(this);
  }

  /**
   * Test if this integer is zero.
   * @return true for zero
   */
  public boolean isZero() {
    return mSign == 0;
  }

  /**
   * Test if this integer is even.
   * @return true for even numbers
   */
  public boolean isEven() {
    return mSign == 0 || (mValue[0] & 1) == 0;
  }

  /**
   * Test if this integer is odd.
   * @return true for odd numbers
   */
  public boolean isOdd() {
    return mSign != 0 && (mValue[0] & 1) == 1;
  }

  /**
   * Compute the Jacobi symbol of this and n.
   * @param n second argument
   * @return the Jacobi symbol of m and n
   * @exception ArithmeticException if <code>n</code> in non-positive.
   */
  public int jacobi(final Z n) {
    return Jacobi.jacobi(this, n);
  }

  /**
   * Primality test. A false return indicates the number is definitely
   * composite. A true result is highly indicative of the number
   * being prime.  The result is always correct for numbers below
   * 341550071728321 and various other special forms.  In the general
   * case the probability of an incorrect true result is approximately
   * 1-1/2^certainty.
   * @param certainty certainty level
   * @return false if number is definitely composite.
   */
  public boolean isProbablePrime(final int certainty) {
    return Prime.primeTest(this, certainty, false);
  }

  /**
   * Primality test. A false return indicates the number is definitely
   * composite. A true result is highly indicative of the number
   * being prime.  The result is always correct for numbers below
   * 341550071728321 and various other special forms.  In the general
   * case the probability of an incorrect true result is approximately
   * 1-1/2^20.
   * @return false if number is definitely composite.
   */
  public boolean isProbablePrime() {
    return Prime.primeTest(this, 20, false);
  }

  /**
   * Primality test.  Always gives the correct answer can be much
   * slower than <code>isProbablePrime</code>.
   * @return true if the number is prime, false otherwise
   */
  public boolean isPrime() {
    return Prime.primeTest(this, 30, true);
  }

  /**
   * Compute square roots modulo a prime.  Finds x such that <code>
   * x^2 = this(mod p)</code>.  When no solution is possible null
   * is returned.  The solution is computed using the Shanks-Tonelli
   * algorithm.  The argument given should be prime, if a composite
   * is given the algorithm may infinite loop.
   *
   * @param p prime modulus
   * @return root or null
   */
  public Z modSqrt(final Z p) {
    return ModSqrt.modSqrt(this, p);
  }

  /**
   * Return the underlying array of this integer.  Callers should never change
   * the content of the returned array.
   * @return the underlying representation
   */
  int[] getValue() {
    return mValue;
  }

  /**
   * Return the underlying size; will be negative for negative numbers.
   * @return size
   */
  int getSize() {
    return mSign;
  }

  /**
   * Apply the extended Euclidean algorithm.  Returns the gcd of <code>this</code>
   * and <code>b</code>, together with numbers <code>u</code> and
   * <code>v</code> such that <code>d=this*u + b*v</code>.
   * @param b second number
   * @return three integers <code>(gcd, u, v)</code>
   */
  public Z[] extendedGcd(final Z b) {
    return ExtendedEuclid.extendedEuclid(this, b);
  }

  /**
   * If the condition is true add the value <code>a</code> otherwise subtract it.
   * @param condition true for addition, false for subtraction
   * @param a value to add or subtract
   * @return this integer plus or minus the given integer
   */
  public Z signedAdd(final boolean condition, final Z a) {
    return condition ? add(a) : subtract(a);
  }
}
