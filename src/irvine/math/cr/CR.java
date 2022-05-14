// Copyright (c) 1999, Silicon Graphics, Inc. -- ALL RIGHTS RESERVED 
// 
// Permission is granted free of charge to copy, modify, use and distribute
// this software  provided you include the entirety of this notice in all
// copies made.
// 
// THIS SOFTWARE IS PROVIDED ON AN AS IS BASIS, WITHOUT WARRANTY OF ANY
// KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION,
// WARRANTIES THAT THE SUBJECT SOFTWARE IS FREE OF DEFECTS, MERCHANTABLE, FIT
// FOR A PARTICULAR PURPOSE OR NON-INFRINGING.   SGI ASSUMES NO RISK AS TO THE
// QUALITY AND PERFORMANCE OF THE SOFTWARE.   SHOULD THE SOFTWARE PROVE
// DEFECTIVE IN ANY RESPECT, SGI ASSUMES NO COST OR LIABILITY FOR ANY
// SERVICING, REPAIR OR CORRECTION.  THIS DISCLAIMER OF WARRANTY CONSTITUTES
// AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY SUBJECT SOFTWARE IS
// AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.
// 
// UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING,
// WITHOUT LIMITATION, NEGLIGENCE OR STRICT LIABILITY), CONTRACT, OR
// OTHERWISE, SHALL SGI BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL,
// INCIDENTAL, OR CONSEQUENTIAL DAMAGES OF ANY CHARACTER WITH RESPECT TO THE
// SOFTWARE INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF GOODWILL, WORK
// STOPPAGE, LOSS OF DATA, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL
// OTHER COMMERCIAL DAMAGES OR LOSSES, EVEN IF SGI SHALL HAVE BEEN INFORMED OF
// THE POSSIBILITY OF SUCH DAMAGES.  THIS LIMITATION OF LIABILITY SHALL NOT
// APPLY TO LIABILITY RESULTING FROM SGI's NEGLIGENCE TO THE EXTENT APPLICABLE
// LAW PROHIBITS SUCH LIMITATION.  SOME JURISDICTIONS DO NOT ALLOW THE
// EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THAT
// EXCLUSION AND LIMITATION MAY NOT APPLY TO YOU.
// 
// These license terms shall be governed by and construed in accordance with
// the laws of the United States and the State of California as applied to
// agreements entered into and to be performed entirely within California
// between California residents.  Any litigation relating to these license
// terms shall be subject to the exclusive jurisdiction of the Federal Courts
// of the Northern District of California (or, absent subject matter
// jurisdiction in such courts, the courts of the State of California), with
// venue lying exclusively in Santa Clara County, California. 

// Copyright (c) 2001-2004, Hewlett-Packard Development Company, L.P. 
// 
// Permission is granted free of charge to copy, modify, use and distribute
// this software  provided you include the entirety of this notice in all
// copies made.
// 
// THIS SOFTWARE IS PROVIDED ON AN AS IS BASIS, WITHOUT WARRANTY OF ANY
// KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION,
// WARRANTIES THAT THE SUBJECT SOFTWARE IS FREE OF DEFECTS, MERCHANTABLE, FIT
// FOR A PARTICULAR PURPOSE OR NON-INFRINGING.   HEWLETT-PACKARD ASSUMES
// NO RISK AS TO THE QUALITY AND PERFORMANCE OF THE SOFTWARE.
// SHOULD THE SOFTWARE PROVE DEFECTIVE IN ANY RESPECT, 
// HEWLETT-PACKARD ASSUMES NO COST OR LIABILITY FOR ANY
// SERVICING, REPAIR OR CORRECTION.  THIS DISCLAIMER OF WARRANTY CONSTITUTES
// AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY SUBJECT SOFTWARE IS
// AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.
// 
// UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING,
// WITHOUT LIMITATION, NEGLIGENCE OR STRICT LIABILITY), CONTRACT, OR
// OTHERWISE, SHALL HEWLETT-PACKARD BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL,
// INCIDENTAL, OR CONSEQUENTIAL DAMAGES OF ANY CHARACTER WITH RESPECT TO THE
// SOFTWARE INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF GOODWILL, WORK
// STOPPAGE, LOSS OF DATA, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL
// OTHER COMMERCIAL DAMAGES OR LOSSES, EVEN IF HEWLETT-PACKARD SHALL
// HAVE BEEN INFORMED OF THE POSSIBILITY OF SUCH DAMAGES.
// THIS LIMITATION OF LIABILITY SHALL NOT APPLY TO LIABILITY RESULTING
// FROM HEWLETT-PACKARD's NEGLIGENCE TO THE EXTENT APPLICABLE
// LAW PROHIBITS SUCH LIMITATION.  SOME JURISDICTIONS DO NOT ALLOW THE
// EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THAT
// EXCLUSION AND LIMITATION MAY NOT APPLY TO YOU.
// 

// Added valueOf(string, radix), fixed some documentation comments.
//  Hans_Boehm@hp.com 1/12/2001
// Fixed a serious typo in inv_CR():  For negative arguments it produced
//   the wrong sign.  This affected the sign of divisions.
// Added byteValue and fixed some comments.  Hans.Boehm@hp.com 12/17/2002
// Added toStringFloatRep. Hans.Boehm@hp.com 4/1/2004

package irvine.math.cr;

import irvine.math.q.Q;
import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
* Constructive real numbers, also known as recursive, or computable reals.
* Each recursive real number is represented as an object that provides an
* approximation function for the real number.
* The approximation function guarantees that the generated approximation
* is accurate to the specified precision.
* Arithmetic operations on computable reals produce new such objects;
* they typically do not perform any real computation.
* In this sense, arithmetic computations are exact: They produce
* a description which describes the exact answer, and can be used to
* later approximate it to arbitrary precision.
* <p>
* When approximations are generated, <i>e.g.</i> for output, they are
* accurate to the requested precision; no cumulative rounding errors
* are visible.
* In order to achieve this precision, the approximation function will often
* need to approximate subexpressions to greater precision than was originally
* demanded.  Thus the approximation of a computable real number
* generated through a complex sequence of operations may eventually require
* evaluation to very high precision.  This usually makes such computations
* prohibitively expensive for large numerical problems.
* But it is perfectly appropriate for use in a desk calculator,
* for small numerical problems, for the evaluation of expressions
* computed by a symbolic algebra system, for testing of accuracy claims
* for floating point code on small inputs, or the like.
* <p>
* We expect that the vast majority of uses will ignore the particular
* implementation, and the member functions <code>approximate</code>
* and <code>getAppr</code>.  Such applications will treat <code>CR</code> as
* a conventional numerical type, with an interface modelled on
* <code>irvine.math.z.Z</code>.  No subclasses of <code>CR</code>
* will be explicitly mentioned by such a program.
* <p>
* All standard arithmetic operations, as well as a few algebraic
* and transcendental functions are provided.  Constructive reals are
* immutable; thus all of these operations return a new computable real.
* <p>
* A few uses will require explicit construction of approximation functions.
* The requires the construction of a subclass of <code>CR</code> with
* an overridden <code>approximate</code> function.  Note that <code>approximate</code>
* should only be defined, but never called.  <code>getAppr</code>
* provides the same functionality, but adds the caching necessary to obtain
* reasonable performance.
* <p>
* Any operation may throw <code>irvine.math.cr.AbortedError</code> if the thread in
* which it is executing is interrupted.  (<code>InterruptedException</code> cannot
* be used for this purpose, since CR inherits from <code>Number</code>.)
* <p>
* Any operation may also throw <code>irvine.math.cr.PrecisionOverflowError</code>
* If the precision request generated during any calculation overflows
* a 28-bit integer.  (This should be extremely unlikely, except as an
* outcome of a division by zero, or other erroneous computation.)
* 
* @author Hans.Boehm@hp.com
* @author Sean A. Irvine
*/
public abstract class CR extends Number implements Comparable<CR> {
  
  /** The real number 0. */
  public static final CR ZERO = valueOf(0);
  /** The real number 1. */
  public static final CR ONE = valueOf(1);
  /** The real number 2. */
  public static final CR TWO = valueOf(2);
  /** The real number 3. */
  public static final CR THREE = valueOf(3);
  /** The real number 4. */
  public static final CR FOUR = valueOf(4);
  /** The real number 5. */
  public static final CR FIVE = valueOf(5);
  /** The real number 6. */
  public static final CR SIX = valueOf(6);
  /** The real number 7. */
  public static final CR SEVEN = valueOf(7);
  /** The real number 8. */
  public static final CR EIGHT = valueOf(8);
  /** The real number 9. */
  public static final CR NINE = valueOf(9);
  /** The real number 10. */
  public static final CR TEN = valueOf(10);
  /** Pi, the ratio of a circle's circumference to its diameter. */
  public static final CR PI = FOUR.multiply(FOUR.multiply(atanReciprocal(5)).subtract(atanReciprocal(239)));
  // pi/4 = 4*atan(1/5) - atan(1/239)
  /** Pi over 2. */
  public static final CR HALF_PI = PI.shiftRight(1);
  /** Square root of pi. */
  public static final CR SQRT_PI = CR.PI.sqrt();
  /** The real number 1/2. */
  public static final CR HALF = CR.TWO.inverse();
  /** The real number 1/3. */
  public static final CR ONE_THIRD = CR.THREE.inverse();
  /** The real number exp(1). */
  public static final CR E = CR.ONE.exp();
  /** Tau. */
  public static final CR TAU = CR.PI.multiply(CR.TWO);
  /** Square root of two. */
  public static final CR SQRT2 = CR.TWO.sqrt();
  /** Golden ratio. */
  public static final CR PHI = CR.ONE.add(CR.FIVE.sqrt()).divide(CR.TWO);
  /** Euler-Mascheroni constant gamma A001620 = 0.57721566... */
  public static final CR GAMMA = new EulerGamma();
  /** A special half slightly larger than a real half (at any precision). */
  public static final CR BIG_HALF = new CR() {
    @Override
    protected Z approximate(final int precision) {
      return Z.ONE.shiftLeft(-precision - 1).add(1);
    }
  };

  static int boundLog2(final int n) {
    final int absN = Math.abs(n);
    return (int) Math.ceil(Math.log(absN + 1) / Constants.LN2);
  }
  
  // Check that a precision is at least a factor of 8 away from
  // overflowing the integer used to hold a precision spec.
  // We generally perform this check early on, and then convince
  // ourselves that none of the operations performed on precisions
  // inside a function can generate an overflow.
  static void checkPrecision(final int n) {
    final int high = n >> 28;
    // if n is not in danger of overflowing, then the 4 high order
    // bits should be identical.  Thus high is either 0 or -1.
    // The rest of this is to test for either of those in a way
    // that should be as cheap as possible.
    final int highShifted = n >> 29;
    if (0 != (high ^ highShifted)) {
      throw new PrecisionOverflowError();
    }
  }

  /**
   * The computable real number corresponding to an integer.
   * @param n integer
   * @return computable real
   */
  public static CR valueOf(final Z n) {
    return new CrZ(n);
  }

  /**
   * The computable real number corresponding to an rational.
   * @param n rational
   * @return computable real
   */
  public static CR valueOf(final Q n) {
    return new CrZ(n.num()).divide(new CrZ(n.den()));
  }

  /**
   * The computable real number corresponding to an integer.
   * Java <code>int</code>.
   * @param n integer
   * @return computable real
   */ 
  public static CR valueOf(final int n) {
    return valueOf(Z.valueOf(n));
  }

  /**
   * The computable real number corresponding to a long.
   * @param n integer
   * @return computable real
   */ 
  public static CR valueOf(final long n) {
    return valueOf(Z.valueOf(n));
  }

  /**
   * The computable real number corresponding to a double.
   * The result is undefined if argument is infinite or NaN.
   * @param n double
   * @return computable real
   */ 
  public static CR valueOf(final double n) {
    if (Double.isNaN(n) || Double.isInfinite(n)) {
      throw new ArithmeticException();
    }
    final boolean negative = n < 0.0;
    final long bits = Double.doubleToLongBits(Math.abs(n));
    long mantissa = bits & 0xFFFFFFFFFFFFFL;
    final int biasedExp = (int) (bits >> 52);
    final int exp = biasedExp - 1075;
    if (biasedExp != 0) {
      mantissa += 1L << 52;
    } else {
      mantissa <<= 1;
    }
    final CR result = valueOf(mantissa).shiftLeft(exp);
    return negative ? result.negate() : result;
  }

  /**
   * The computable real number corresponding to a float
   * The result is undefined if argument is infinite or NaN.
   * @param n float
   * @return computable real
   */ 
  public static CR valueOf(final float n) {
    return valueOf((double) n);
  }

  /**
   * Return the computable real number corresponding to the given
   * textual representation and radix.
   * @param str [-] digit* [. digit*]
   * @param radix base
   * @return the computable real number
   * @throws NumberFormatException if the string is malformed.
   */
  public static CR valueOf(final String str, final int radix) {
    final String s = str.trim();
    final int len = s.length(); 
    final String fraction;
    int pointPos = s.indexOf('.');
    if (pointPos == -1) {
      pointPos = len;
      fraction = "0";
    } else {
      fraction = s.substring(pointPos + 1, len);
    }
    final String whole = s.substring(0, pointPos);
    final Z scaledResult = new Z(whole + fraction, radix);
    final Z divisor = Z.valueOf(radix).pow(fraction.length());
    return CR.valueOf(scaledResult).divide(CR.valueOf(divisor));
  }

  /**
   * Return the computable real number corresponding to the given
   * textual representation and radix.
   * @param str [-] digit* [. digit*]
   * @return the computable real number
   * @throws NumberFormatException if the string is malformed.
   */
  public static CR valueOf(final String str) {
    return valueOf(str, 10);
  }

  /**
   * Multiply by <code>2^n</code> rounding the result (with Maple style semantics).
   * @param k number
   * @param n exponent
   * @return scaled form
   */
  public static Z scale(final Z k, final int n) {
    if (n >= 0) {
      return k.shiftLeft(n);
    } else if (k.signum() >= 0) {
      return k.shiftLeft(n + 1).add(1).divide2();
    } else {
      return k.add(1).shiftLeft(n + 1).subtract(1).divide2();
    }
  }

  /**
   * Must be defined in subclasses of <code>CR</code>.
   * Most users can ignore the existence of this method, and will
   * not ever need to define a <code>CR</code> subclass.
   * Returns <code>value / 2^precision</code> rounded to an integer.
   * The error in the result is strictly &lt; 1.
   * Informally, approximate(n) gives a scaled approximation
   * accurate to 2^n.
   * Implementations may safely assume that precision is
   * at least a factor of 8 away from overflow.
   * @param precision desired precision
   * @return number with desired precision
   */
  protected abstract Z approximate(final int precision);
  
  // The smallest precision value with which the above has been called.
  transient int mMinPrec = 0;
  // The scaled approximation corresponding to mMinPrec
  transient Z mMaxAppr = null;
  // mMaxAppr and mMaxAppr are valid.
  transient boolean mApprValid = false;

  // Identical to approximate(), but maintain and update cache.
  /**
   * Returns <code>value / 2^prec</code> rounded to an integer.
   * The error in the result is strictly &lt; 1.
   * Produces the same answer as <code>approximate</code>, but uses and maintains a cached approximation.
   * Normally not overridden, and called only from <code>approximate</code>
   * methods in subclasses.  Not needed if the provided operations
   * on computable reals suffice.
   * @param precision desired precision
   * @return integer approximation scaled by precision
   */ 
  public Z getApprox(final int precision) {
    checkPrecision(precision);
    if (mApprValid && precision >= mMinPrec) {
      return scale(mMaxAppr, mMinPrec - precision);
    } else {
      final Z result = approximate(precision);
      mMinPrec = precision;
      mMaxAppr = result;
      mApprValid = true;
      return result;   
    }
  }

  // Return the position of the msd.
  // If x.msd() == n then 2^(n-1) < abs(x) < 2^(n+1) 
  // This initial version assumes that maxAppr is valid and sufficiently removed from zero that the msd is determined.
  int knownMSD() {
    return mMinPrec + mMaxAppr.bitLength() - 1;
  }
 
  // This version may return Integer.MIN_VALUE if the correct answer is < n.
  int msd(final int n) {
    if (!mApprValid || (mMaxAppr.compareTo(Z.ONE) <= 0 && mMaxAppr.compareTo(Z.NEG_ONE) >= 0)) {
      getApprox(n - 1);
      if (mMaxAppr.abs().compareTo(Z.ONE) <= 0) {
        // msd could still be arbitrarily far to the right.
        return Integer.MIN_VALUE;
      }
    }
    return knownMSD();
  }

  // Functionally equivalent, but iteratively evaluates to higher precision.
  private int iterMSD(final int n) {
    for (int prec = 0; prec > n + 30; prec = (prec * 3) / 2 - 16) {
      final int msd = msd(prec);
      if (msd != Integer.MIN_VALUE) {
        return msd;
      }
      checkPrecision(prec);
    }
    return msd(n);
  }

  // This version returns a correct answer eventually, except
  // that it loops forever (or throws an exception when the
  // requested precision overflows) if this computable real is zero.
  int msd() {
    return iterMSD(Integer.MIN_VALUE);
  }

  // Natural log of 2.  Needed for some prescaling below.
  // ln(2) = 7ln(10/9) - 2ln(25/24) + 3ln(81/80)
  private CR simpleLn() {
    return new PrescaledLn(subtract(ONE));
  }
  
  private static final CR LN2 = valueOf(7).multiply(valueOf(10).divide(valueOf(9)).simpleLn())
    .subtract(TWO.multiply(valueOf(25).divide(valueOf(24)).simpleLn()))
    .add(THREE.multiply(valueOf(81).divide(valueOf(80)).simpleLn()));

  // Atan of integer reciprocal.  Used for PI.  Could perhaps be made public.
  static CR atanReciprocal(final int n) {
    return new IntegralAtan(n);
  }
  
  /**
   * Return 0 if x = y to within the indicated tolerance,
   * -1 if x &lt; y, and +1 if x &gt; y.  If x and y are indeed
   * equal, it is guaranteed that 0 will be returned.  If
   * they differ by less than the tolerance, anything
   * may happen.  The tolerance allowed is
   * the maximum of <code>(abs(this)+abs(x))*(2^r)</code> and <code>2^a</code>
   * @param x  The other computable real
   * @param r Relative tolerance in bits
   * @param a Absolute tolerance in bits
   * @return result of comparison
   */
  public int compareTo(final CR x, final int r, final int a) {
    final int thisMSD = iterMSD(a);
    final int xMSD = x.iterMSD(Math.max(thisMSD, a));
    final int maxMSD = Math.max(xMSD, thisMSD);
    final int rel = maxMSD + r;
    // This can't approach overflow, since r and a are
    // effectively divided by 2, and msds are checked.
    return compareTo(x, Math.max(rel, a));
  }

  /**
   * Approximate comparison with only an absolute tolerance.
   * Identical to the three argument version, but without a relative
   * tolerance.
   * Result is 0 if both computable reals are equal, indeterminate
   * if they differ by less than <code>2^a</code>.
   *
   * @param x the other computable real
   * @param a absolute tolerance in bits
   * @return result of comparison
   */
  public int compareTo(final CR x, final int a) {
    final int neededPrec = a - 1;
    final Z thisAppr = getApprox(neededPrec);
    final Z xAppr = x.getApprox(neededPrec);
    final int comp1 = thisAppr.compareTo(xAppr.add(Z.ONE));
    if (comp1 > 0) {
      return 1;
    }
    final int comp2 = thisAppr.compareTo(xAppr.subtract(Z.ONE));
    if (comp2 < 0) {
      return -1;
    }
    return 0;
  }

  /**
   * Return -1 if <code>this &lt; x</code>, or +1 if <code>this &gt; x</code>.
   * Should be called only if <code>this != x</code>.
   * If <code>this == x</code>, this will not terminate correctly; typically it
   * will run until it exhausts memory.
   * If the two computable reals may be equal, the two or 3 argument
   * version of <code>compareTo</code> should be used.
   * @param x number to compare with
   * @return result of comparison
   */
  @Override
  public int compareTo(final CR x) {
    if (this == x) { // == deliberate!
      return 0;
    }
    for (int a = -20; ; a *= 2) {
      checkPrecision(a);
      final int result = compareTo(x, a);
      if (0 != result) {
        return result;
      }
    }
  }
  
  @Override
  public boolean equals(final Object other) {
    // This is really tricky.  In general telling if two numbers are identical is
    // impossible.  We can return true if they are the same object and false if
    // it is not even a number.
    if (this == other) {
      return true;
    }
    if (!(other instanceof CR)) {
      return false;
    }
    // We can also tell if they are different after an arbitrary number of bits.
    // Ideally this comparison would not be done, but here we are somewhat pragmatic
    return compareTo((CR) other, -1024) == 0;
  }
  
  @Override
  public int hashCode() {
    return approximate(32).intValue();
  }

  /**
   * Equivalent to <code>compareTo(CR.ZERO, a)</code>
   * @param a tolerance (negative for numbers smaller than 0)
   * @return sign of number
   */
  public int signum(final int a) {
    if (mApprValid) {
      final int quickTry = mMaxAppr.signum();
      if (0 != quickTry) {
        return quickTry;
      }
    }
    final int neededPrec = a - 1;
    final Z thisAppr = getApprox(neededPrec);
    return thisAppr.signum();
  }

  /**
   * Return -1 if negative, +1 if positive.
   * Should be called only if <code>this != 0</code>.
   * In the 0 case, this will not terminate correctly; typically it
   * will run until it exhausts memory.
   * If the two computable reals may be equal, the one or two argument
   * version of signum should be used.
   * @return sign of the number
   */
  public int signum() {
    for (int a = -20; ; a *= 2) {
      checkPrecision(a);
      final int result = signum(a);
      if (0 != result) {
        return result;
      }
    }
  }

  /**
   * Return a textual representation accurate to <code>n</code> places
   * to the right of the decimal point.  <code>n</code> must be nonnegative.
   *
   * @param n number of digits (&gt;= 0) included to the right of decimal point
   * @param radix base (&gt;= 2, &lt;=16) for the resulting representation
   * @return string representation
   */
  public String toString(final int n, final int radix) {
    final CR scaledCR;
    if (radix == 16) {
      scaledCR = shiftLeft(4 * n);
    } else {
      final Z scaleFactor = Z.valueOf(radix).pow(n);
      scaledCR = multiply(new CrZ(scaleFactor));
    }
    final Z scaledInt = scaledCR.getApprox(0);
    String scaledString = scaledInt.abs().toString(radix);
    String result;
    if (n == 0) {
      result = scaledString;
    } else {
      int len = scaledString.length();
      if (len <= n) {
        // Add sufficient leading zeroes
        final String z = StringUtils.rep('0', n + 1 - len);
        scaledString = z + scaledString;
        len = n + 1;
      }
      final String whole = scaledString.substring(0, len - n);
      final String fraction = scaledString.substring(len - n);
      result = whole + "." + fraction;
    }
    if (scaledInt.signum() < 0) {
      result = "-" + result;
    }
    return result;
  }

  /**
   * Equivalent to <code>toString(n, 10)</code>
   *
   * @param n Number of digits included to the right of decimal point
   * @return string representation
   */
  public String toString(final int n) {
    return toString(n, 10);
  }

  /**
   * Equivalent to <code>toString(10, 10)</code>
   * @return string representation
   */
  @Override
  public String toString() {
    return toString(10);
  }

  /**
   * Return a textual scientific notation representation accurate
   * to <code>n</code> places to the right of the decimal point.
   * <code>n</code> must be nonnegative.  A value smaller than
   * <code>radix</code>**-<code>m</code> may be displayed as 0.
   * The <code>mantissa</code> component of the result is either "0"
   * or exactly <code>n</code> digits long.  The <code>sign</code>
   * component is zero exactly when the mantissa is "0".
   *
   * @param n number of digits (&gt; 0) included to the right of decimal point.
   * @param radix base ( &ge; 2, &le; 16) for the resulting representation. 
   * @param m precision used to distinguish number from zero. Expressed as a power of m.
   * @return scientific notation representation
   */
  public StringFloatRep toStringFloatRep(final int n, final int radix, final int m) {
    if (n <= 0) {
      throw new ArithmeticException();
    }
    final double log2Radix = Math.log(radix) / Constants.LN2;
    final Z bigRadix = Z.valueOf(radix);
    final long longMsdPrec = (long) (log2Radix * (double) m);
    if (longMsdPrec > (long) Integer.MAX_VALUE || longMsdPrec < (long) Integer.MIN_VALUE) {
      throw new PrecisionOverflowError();
    }
    final int msdPrec = (int) longMsdPrec;
    checkPrecision(msdPrec);
    final int msd = iterMSD(msdPrec - 2);
    if (msd == Integer.MIN_VALUE) {
      return new StringFloatRep(0, "0", radix, 0);
    }
    int exponent = (int) Math.ceil((double) msd / log2Radix);
    // Guess for the exponent.  Try to get it usually right.
    final int scaleExp = exponent - n;
    final CR scale;
    if (scaleExp > 0) {
      scale = CR.valueOf(bigRadix.pow(scaleExp)).inverse();
    } else {
      scale = CR.valueOf(bigRadix.pow(-scaleExp));
    }
    CR scaledRes = multiply(scale);
    Z scaledInt = scaledRes.getApprox(0);
    int sign = scaledInt.signum();
    String scaledString = scaledInt.abs().toString(radix);
    while (scaledString.length() < n) {
      // exponent was too large.  Adjust.
      scaledRes = scaledRes.multiply(bigRadix);
      --exponent;
      scaledInt = scaledRes.getApprox(0);
      sign = scaledInt.signum();
      scaledString = scaledInt.abs().toString(radix);
    }
    if (scaledString.length() > n) {
      // exponent was too small.  Adjust by truncating.
      exponent += scaledString.length() - n;
      scaledString = scaledString.substring(0, n);
    }
    return new StringFloatRep(sign, scaledString, radix, exponent);
  }

  /**
   * Return the floor function of this computable real accurate to the given
   * precision.  The value can be out by 1 if the value is very close to an
   * integer.
   * @param precision precision to consider
   * @return floor of the computable real
   */
  public Z floor(final int precision) {
    final int workingPrecision = toZ().bitLength() + precision;
    final Z approx = getApprox(-workingPrecision);
    if (approx.signum() >= 0) {
      return approx.shiftRight(workingPrecision);
    } else {
      return approx.subtract(Z.ONE.shiftLeft(workingPrecision).subtract(1)).shiftRight(workingPrecision);
    }
  }

  private static final int DEFAULT_FLOOR_EXTRA_BITS = 64;

  /**
   * Return the floor function of this computable real accurate to 64-bits
   * beyond the decimal point.  The value can be out by 1 if the value is
   * very close to an integer.
   * @return floor of the computable real
   */
  public Z floor() {
    return floor(DEFAULT_FLOOR_EXTRA_BITS);
  }

  /**
   * Return the ceiling function of this computable real accurate to the given
   * precision.  The value can be out by 1 if the value is very close to an
   * integer.
   * @param precision precision to consider (after the decimal point)
   * @return ceiling of the computable real
   */
  public Z ceil(final int precision) {
    final int workingPrecision = toZ().bitLength() + precision;
    final Z approx = getApprox(-workingPrecision);
    if (approx.signum() <= 0) {
      return approx.shiftRight(workingPrecision);
    } else {
      return approx.add(Z.ONE.shiftLeft(workingPrecision).subtract(1)).shiftRight(workingPrecision);
    }
  }

  /**
   * Return the ceiling function of this computable real accurate to the given
   * precision.  The value can be out by 1 if the value is very close to an
   * integer.
   * @return ceiling of the computable real
   */
  public Z ceil() {
    return ceil(DEFAULT_FLOOR_EXTRA_BITS);
  }

  /**
   * Return the nearest integer to this number.
   * @return rounded value
   */
  public Z round() {
    final int sign = toZ().signum();
    return sign < 0 ? subtract(CR.BIG_HALF).ceil() : add(CR.BIG_HALF).floor();
  }

  /**
   * Return the nearest integer to this number.
   * @param precision precision to use
   * @return rounded value
   */
  public Z round(final int precision) {
    final int sign = toZ().signum();
    return sign >= 0 ? subtract(CR.BIG_HALF).ceil(precision) : add(CR.BIG_HALF).floor(precision);
  }

  /**
   * Return the fractional part of this number.
   * @return fractional part
   */
  public CR frac() {
    return compareTo(CR.ZERO) < 0
      ? subtract(CR.valueOf(ceil()))
      : subtract(CR.valueOf(floor()));
  }

  /**
   * Return the fractional part of this number up to the specified precision.
   * @param precision precision. The value can be out by 1 if the value is very close to an integer.
   * @return fractional part
   */
  public CR frac(final int precision) {
    return compareTo(CR.ZERO) < 0
      ? subtract(CR.valueOf(ceil(precision)))
      : subtract(CR.valueOf(floor(precision)));
  }

  /**
   * Return a Z which differs by less than one from the computable real.
   * @return integer value
   */
  public Z toZ() {
    return getApprox(0);
  }

  @Override
  public int intValue() {
    return toZ().intValue();
  }

  @Override
  public byte byteValue() {
    return toZ().byteValue();
  }

  @Override
  public long longValue() {
    return toZ().longValue();
  }

  private static final double TWO48 = (double) (1L << 48);

  @Override
  public double doubleValue() {
    final int thisMSD = iterMSD(-1080 /* slightly > exp. range */);
    if (Integer.MIN_VALUE == thisMSD) {
      return 0;
    }
    final int neededPrec = thisMSD - 60;
    final double scaledInt = getApprox(neededPrec).doubleValue();
    final boolean mayUnderflow = neededPrec < -1000;
    long scaledIntRep = Double.doubleToLongBits(scaledInt);
    final long expAdj = mayUnderflow ? neededPrec + 96 : neededPrec;
    final long origExp = (scaledIntRep >> 52) & 0x7FF;
    if (((origExp + expAdj) & ~0x7FF) != 0) {
      // overflow
      if (scaledInt < 0.0) {
        return Double.NEGATIVE_INFINITY;
      } else {
        return Double.POSITIVE_INFINITY;
      }
    }
    scaledIntRep += expAdj << 52;
    final double result = Double.longBitsToDouble(scaledIntRep);
    if (mayUnderflow) {
      return result / TWO48 / TWO48;
    } else {
      return result;
    }
  }

  @Override
  public float floatValue() {
    return (float) doubleValue();
  }

  /**
   * Add two computable reals.
   * @param x addend
   * @return sum
   */
  public CR add(final CR x) {
    return new Add(this, x);
  }

  /**
   * Multiply a computable real by <code>2^n</code>.
   * @param n shift count, may be negative
   * @return left shifted value
   */
  public CR shiftLeft(final int n) {
    checkPrecision(n);
    return new Shift(this, n);
  }

  /**
   * Multiply a computable real by <code>2^(-n)</code>.
   * @param n shift count, may be negative
   * @return right shifted value
   */
  public CR shiftRight(final int n) {
    checkPrecision(n);
    return new Shift(this, -n);
  }

  /**
   * Produce a computable real equivalent to the original, assuming
   * the original was an integer.  Undefined results if the original
   * was not an integer.  Prevents evaluation of digits to the right
   * of the decimal point, and may thus improve performance.
   * @return integer value
   */
  public CR assumeInt() {
    return new AssumedInt(this);
  }

  /**
   * The additive inverse of a computable real.
   * @return additive inverse
   */
  public CR negate() {
    return new Negate(this);
  }

  /**
   * The difference between two computable reals.
   * @param x subtrahend
   * @return difference
   */
  public CR subtract(final CR x) {
    return new Add(this, x.negate());
  }

  /**
   * The product of two computable reals.
   * @param x factor
   * @return product
   */
  public CR multiply(final CR x) {
    return new Multiply(this, x);
  }

  /**
   * Convenience method to multiply a computable real by an integer.
   * @param x factor
   * @return product
   */
  public CR multiply(final Z x) {
    return new Multiply(this, CR.valueOf(x));
  }

  /**
   * Convenience method to multiply a computable real by an integer.
   * @param x factor
   * @return product
   */
  public CR multiply(final long x) {
    return new Multiply(this, CR.valueOf(x));
  }

  /**
   * Convenience method to multiply a computable real by a rational.
   * @param x factor
   * @return product
   */
  public CR multiply(final Q x) {
    return new Multiply(this, CR.valueOf(x));
  }

  /**
   * The multiplicative inverse of a computable real.
   * <code>x.inverse()</code> is equivalent to <code>CR.valueOf(1).divide(x)</code>.
   * @return multiplicative inverse
   */
  public CR inverse() {
    return new Inverse(this);
  }

  /**
   * The quotient of two computable reals.
   * @param x divisor
   * @return quotient
   */
  public CR divide(final CR x) {
    return new Multiply(this, x.inverse());
  }

  /**
   * Square a real number.
   * @return square
   */
  public CR square() {
    return new Multiply(this, this);
  }

  /**
   * Power of this computable real to another real.
   * @param e exponent
   * @return <code>this^e</code>
   */
  public CR pow(final CR e) {
    if (e instanceof CrZ && e.signum() >= 0) {
      final Z ee = e.toZ();
      if (ee.bitLength() < 63) {
        return pow(ee.longValue());
      }
    }
    return e.multiply(log()).exp();
  }

  /**
   * Power of this computable real to a long.
   * @param e exponent
   * @return <code>this^e</code>
   */
  public CR pow(final long e) {
    return e < 0 ? pow(CR.valueOf(e)) : ComputableReals.SINGLETON.pow(this, e);
  }

  /**
   * The real number <code>x</code> if <code>this</code> &lt; 0, or <code>y</code> otherwise.
   * Requires <code>x</code> = <code>y</code> if <code>this</code> = 0.
   * Since comparisons may diverge, this is often a useful alternative to conditionals.
   * @param x choice for <code>this&lt;0</code>
   * @param y choice for <code>this&gt;=0</code>
   * @return choice
   */
  public CR select(final CR x, final CR y) {
    return new Select(this, x, y);
  }

  /**
   * The maximum of two computable reals.
   * @param x other number
   * @return maximum
   */
  public CR max(final CR x) {
    return subtract(x).select(x, this);
  }

  /**
   * The minimum of two computable reals.
   * @param x other number
   * @return minimum
   */
  public CR min(final CR x) {
    return subtract(x).select(this, x);
  }

  /**
   * The absolute value of a computable reals.
   * Note that this cannot be written as a conditional.
   * @return absolute value
   */
  public CR abs() {
    return select(negate(), this);
  }

  /**
   * The exponential function, that is <code>exp(this)</code>.
   * @return exponential
   */
  public CR exp() {
    final int lowPrec = -10;
    final Z roughAppr = getApprox(lowPrec);
    if (roughAppr.signum() < 0) {
      return negate().exp().inverse();
    }
    if (roughAppr.compareTo(Z.TWO) > 0) {
      final CR squareRoot = shiftRight(1).exp();
      return squareRoot.multiply(squareRoot);
    } else {
      return new PrescaledExp(this);
    }
  }

  /**
   * The trigonometric cosine function.
   * @return cosine
   */
  public CR cos() {
    final Z roughAppr = getApprox(-1);
    final Z absRoughAppr = roughAppr.abs();
    if (absRoughAppr.compareTo(Z.SIX) >= 0) {
      // Subtract multiples of PI
      final Z multiplier = roughAppr.divide(Z.SIX);
      final CR adjustment = PI.multiply(multiplier);
      if (multiplier.and(Z.ONE).signum() != 0) {
        return subtract(adjustment).cos().negate();
      } else {
        return subtract(adjustment).cos();
      }
    } else if (absRoughAppr.compareTo(Z.TWO) >= 0) {
      // Scale further with double angle formula
      final CR cosHalf = shiftRight(1).cos();
      return cosHalf.multiply(cosHalf).shiftLeft(1).subtract(ONE);
    } else {
      return new PrescaledCos(this);
    }
  }

  /**
   * The trigonometric sine function.
   * @return sine
   */
  public CR sin() {
    return HALF_PI.subtract(this).cos();
  }

  private static final Z LOW_LN_LIMIT = Z.EIGHT; /* sixteenths, i.e. 1/2 */
  private static final Z HIGH_LN_LIMIT = Z.valueOf(16 + 8 /* 1.5 */);
  private static final Z SCALED_4 = Z.valueOf(4 * 16);

  /**
   * The natural (base e) logarithm.
   * @return logarithm
   */
  public CR log() {
    final int lowPrec = -4;
    final Z roughAppr = getApprox(lowPrec); /* In sixteenths */
    if (roughAppr.compareTo(Z.ZERO) < 0) {
      throw new ArithmeticException();
    }
    if (roughAppr.compareTo(LOW_LN_LIMIT) <= 0) {
      return inverse().log().negate();
    }
    if (roughAppr.compareTo(HIGH_LN_LIMIT) >= 0) {
      if (roughAppr.compareTo(SCALED_4) <= 0) {
        final CR quarter = sqrt().sqrt().log();
        return quarter.shiftLeft(2);
      } else {
        final int extraBits = roughAppr.bitLength() - 3;
        final CR scaledResult = shiftRight(extraBits).log();
        return scaledResult.add(CR.valueOf(extraBits).multiply(LN2));
      }
    }
    return simpleLn();
  }

  /**
   * The square root of a computable real.
   * @return square root
   */
  public CR sqrt() {
    return new Sqrt(this);
  }

  /**
   * The exponential integral of this real number.
   * @return exponential integral
   */
  public CR ei() {
    return new PrescaledEi(this).add(CR.GAMMA).add(abs().log());
  }

  /**
   * The logarithmic integral of this real number.
   * @return logarithmic integral
   */
  public CR li() {
    final CR l = log();
    return new PrescaledEi(l).add(CR.GAMMA).add(l.abs().log());
  }

  /**
   * The sine integral of this real number.
   * @return exponential integral
   */
  public CR si() {
    return new PrescaledSi(this);
  }


  private static final CR ERF_C1 = TWO.divide(SQRT_PI);

  /**
   * The error function <code>erf</code> of this real number.
   * @return error function integral
   */
  public CR erf() {
    return new PrescaledErf(this).multiply(ERF_C1);
  }

  /**
   * The complement error function <code>erfc</code> of this real number.
   * @return complement error function integral
   */
  public CR erfc() {
    return ONE.subtract(erf());
  }

  /**
   * Arithmetic geometric mean of two computable reals.
   * @param x other number
   * @return arithmetic geometric mean
   */
  public CR agm(final CR x) {
    return new Agm(this, x);
  }

  /**
   * The log gamma function of this real number.
   * @return log gamma
   */
  public CR lnGamma() {
    return new PrescaledLnGamma(this);
  }

  /**
   * Return the gamma function of this real number.
   * @return gamma function
   */
  public CR gamma() {
    return lnGamma().exp();
  }

  /**
   * Returns the hyperbolic sine.
   * @return hyperbolic sine
   */
  public CR sinh() {
    return ComputableReals.SINGLETON.sinh(this);
  }

  /**
   * Returns the hyperbolic cosine.
   * @return hyperbolic cosine
   */
  public CR cosh() {
    return ComputableReals.SINGLETON.cosh(this);
  }

  /**
   * Returns the hyperbolic tangent.
   * @return hyperbolic tangent
   */
  public CR tanh() {
    return ComputableReals.SINGLETON.tanh(this);
  }

  /**
   * Returns the hyperbolic cotangent.
   * @return hyperbolic cotangent
   */
  public CR coth() {
    return ComputableReals.SINGLETON.coth(this);
  }

  /**
   * Returns the hyperbolic secant.
   * @return hyperbolic secant
   */
  public CR sech() {
    return ComputableReals.SINGLETON.sech(this);
  }

  /**
   * Returns the hyperbolic cosecant.
   * @return hyperbolic cosecant
   */
  public CR csch() {
    return ComputableReals.SINGLETON.csch(this);
  }

  /**
   * The Bessel <code>J0</code> function of this real number.
   * @return <code>BesselJ0()</code>
   */
  public CR besselJ0() {
    return Bessel.besselJ0(this);
  }

  /**
   * The Bessel <code>I0</code> function of this real number.
   * @return <code>BesselI0()</code>
   */
  public CR besselI0() {
    return Bessel.besselI0(this);
  }

  /**
   * The Bessel <code>I_v(this)</code> function of this real number.
   * @param v index
   * @return <code>BesselI_v(this)</code>
   */
  public CR besselI(final int v) {
    return Bessel.besselI(v, this);
  }

  /**
   * The Bessel <code>K0</code> function of this real number.
   * @return <code>BesselK0()</code>
   */
  public CR besselK0() {
    return Bessel.besselK0(this);
  }

  /**
   * The Bessel <code>K_v(this)</code> function of this real number.
   * @param v index
   * @return <code>BesselK_v(this)</code>
   */
  public CR besselK(final int v) {
    return Bessel.besselK(v, this);
  }

  /**
   * The Bessel <code>Y0</code> function of this real number.
   * @return <code>BesselY0()</code>
   */
  public CR besselY0() {
    return Bessel.besselY0(this);
  }

}
