package irvine.math.q;

import java.io.Serializable;

import irvine.math.z.Z;

/**
 * An object to hold an immutable rational number.
 *
 * @author Sean A. Irvine
 */
public class Q implements Comparable<Q>, Serializable {

  /** Constant negative one. */
  public static final Q NEG_ONE = new Q(Z.NEG_ONE);
  /** Constant zero. */
  public static final Q ZERO = new Q(Z.ZERO);
  /** Constant one. */
  public static final Q ONE = new Q(Z.ONE);
  /** Constant two. */
  public static final Q TWO = new Q(Z.TWO);
  /** Constant three. */
  public static final Q THREE = new Q(Z.THREE);
  /** Constant four. */
  public static final Q FOUR = new Q(Z.FOUR);
  /** Constant five. */
  public static final Q FIVE = new Q(Z.FIVE);
  /** Constant six. */
  public static final Q SIX = new Q(Z.SIX);
  /** Constant seven. */
  public static final Q SEVEN = new Q(Z.SEVEN);
  /** Constant eight. */
  public static final Q EIGHT = new Q(Z.EIGHT);
  /** Constant nine. */
  public static final Q NINE = new Q(Z.NINE);
  /** Constant ten. */
  public static final Q TEN = new Q(Z.TEN);
  /** Constant half. */
  public static final Q HALF = new Q(Z.ONE, Z.TWO);
  /** Constant third. */
  public static final Q ONE_THIRD = new Q(Z.ONE, Z.THREE);
  /** Constant quarter. */
  public static final Q ONE_QUARTER = new Q(Z.ONE, Z.FOUR);


  /*
   * The rational number is stored in the lowest possible terms with numerator
   * mP and denominator mQ. The sign of the denominator is always positive,
   * so that the numerator carries the sign. Zero is represented by mP=0
   * and mQ=1.
   */
  private final Z mP;
  private final Z mQ;

  /**
   * Construct the rational integer <code>n</code>.
   * @param n integer value
   */
  public Q(final Z n) {
    mP = n;
    mQ = Z.ONE;
  }

  /**
   * Construct the rational integer <code>n</code>.
   * @param n integer value
   */
  public Q(final long n) {
    this(Z.valueOf(n));
  }

  /**
   * Construct the rational number formed by the ratio <code>p/q</code>.
   * @param p numerator
   * @param q denominator
   * @exception IllegalArgumentException if <code>q</code> is zero.
   */
  public Q(Z p, Z q) {
    if (q.isZero()) {
      throw new IllegalArgumentException();
    }
    if (p.isZero()) {
      mP = Z.ZERO;
      mQ = Z.ONE;
    } else {
      final Z d = p.gcd(q);
      p = p.divide(d);
      q = q.divide(d);
      if (q.signum() < 0) {
        q = q.negate();
        p = p.negate();
      }
      mP = p;
      mQ = q;
    }
  }

  /**
   * Construct the rational number formed by the ratio <code>p/q</code>.
   * @param p numerator
   * @param q denominator
   * @exception IllegalArgumentException if <code>q</code> is zero.
   */
  public Q(final long p, final long q) {
    this(Z.valueOf(p), Z.valueOf(q));
  }

  /**
   * Construct the rational number formed by the ratio <code>p/q</code>.
   * @param p numerator
   * @param q denominator
   */
  public Q(final Z p, final long q) {
    this(p, Z.valueOf(q));
  }

  /**
   * Construct the rational number formed by the ratio <code>p/q</code>.
   * @param p numerator
   * @param q denominator
   */
  public Q(final long p, final Z q) {
    this(Z.valueOf(p), q);
  }

  /**
   * Construct the rational number from a String of the form <code>"p/q"</code>.
   * @param val String of the form "p/q"
   * @exception IllegalArgumentException if <code>q</code> is zero.
   */
  public Q(final String val) {
    final int slashPos = val.indexOf('/');
    final Q qt = (slashPos < 0) ? new Q(new Z(val), Z.ONE) : new Q(new Z(val.substring(0, slashPos)), new Z(val.substring(slashPos + 1)));
    mP = qt.num();
    mQ = qt.den();
  }

  /**
   * Return the numerator.
   * @return numerator
   */
  public Z num() {
    return mP;
  }

  /**
   * Return the denominator.
   * @return denominator
   */
  public Z den() {
    return mQ;
  }

  @Override
  public boolean equals(final Object n) {
    return n instanceof Q && num().equals(((Q) n).num()) && den().equals(((Q) n).den());
  }

  @Override
  public int hashCode() {
    return num().hashCode() ^ den().hashCode();
  }

  @Override
  public int compareTo(final Q q) {
    if (q == this) {
      return 0;
    }
    if (q.den() == den()) {
      // Efficiency, more expensive subsequent test would still get his right
      return num().compareTo(q.num());
    }
    return num().multiply(q.den()).compareTo(q.num().multiply(den()));
  }

  /**
   * Return the sign of this number.  That is 1 for positive
   * numbers, 0 for zero, and -1 for negative numbers.
   * @return sign
   */
  public int signum() {
    return num().signum();
  }

  /**
   * Return the negation of this rational.
   * @return negation
   */
  public Q negate() {
    return new Q(num().negate(), den());
  }

  /**
   * Return the reciprocal of this rational.
   * @return reciprocal
   */
  public Q reciprocal() {
    return new Q(den(), num());
  }

  /**
   * Test if this rational is actually an integer.
   * @return true for an integer
   */
  public boolean isInteger() {
    return Z.ONE.equals(den());
  }

  @Override
  public String toString() {
    if (isInteger()) {
      return num().toString();
    } else {
      return num() + "/" + den();
    }
  }

  /**
   * Return the rational as an integer. If this rational is an integer, then the
   * result is that integer. Otherwise, if this integer is positive then it is
   * the largest integer less than this value. Finally, if this integer is
   * negative it is smallest integer larger than this value.
   *
   * @return a <code>Z</code> value
   */
  public Z toZ() {
    return num().divide(den());
  }

  /**
   * Return the floor of this rational.  This is the same as <code>toZ()</code>
   * for positive numbers, but differs for negative numbers.
   * @return floor function
   */
  public Z floor() {
    return signum() >= 0 ? toZ() : num().subtract(den()).add(1).divide(den());
  }

  /**
   * Return the ceiling of this rational.
   * @return ceiling function
   */
  public Z ceiling() {
    return negate().floor().negate();
  }

  /**
   * Round this number.
   * @return round function
   */
  public Z round() {
    return signum() < 0 ? subtract(Q.HALF).ceiling() : add(Q.HALF).floor();
  }

  /**
   * Add a rational to this rational.
   *
   * @param n rational to add
   * @return sum
   */
  public Q add(final Q n) {
    if (den().equals(n.den())) {
      return new Q(num().add(n.num()), den());
    } else {
      return new Q(num().multiply(n.den()).add(n.num().multiply(den())), den().multiply(n.den()));
    }
  }

  /**
   * Add an integer to this rational.
   *
   * @param n integer to add
   * @return sum
   */
  public Q add(final Z n) {
    return new Q(num().add(den().multiply(n)), den());
  }

  /**
   * Add an integer to this rational.
   *
   * @param n integer to add
   * @return sum
   */
  public Q add(final long n) {
    return new Q(num().add(den().multiply(n)), den());
  }

  /**
   * Subtract a rational from this rational.
   *
   * @param n rational to subtract
   * @return difference
   */
  public Q subtract(final Q n) {
    if (den().equals(n.den())) {
      return new Q(num().subtract(n.num()), den());
    } else {
      return new Q(num().multiply(n.den()).subtract(n.num().multiply(den())), den().multiply(n.den()));
    }
  }

  /**
   * Subtract an integer from this rational.
   *
   * @param n integer to subtract
   * @return difference
   */
  public Q subtract(final Z n) {
    return new Q(num().subtract(den().multiply(n)), den());
  }

  /**
   * Subtract an integer from this rational.
   *
   * @param n integer to subtract
   * @return difference
   */
  public Q subtract(final long n) {
    return new Q(num().subtract(den().multiply(n)), den());
  }

  /**
   * Multiply this rational by a rational.
   *
   * @param n multiplicand
   * @return product
   */
  public Q multiply(final Q n) {
    return new Q(num().multiply(n.num()), den().multiply(n.den()));
  }

  /**
   * Multiply this rational by an integer.
   *
   * @param n multiplicand
   * @return product
   */
  public Q multiply(final Z n) {
    return new Q(num().multiply(n), den());
  }

  /**
   * Multiply this rational by an integer.
   *
   * @param n multiplicand
   * @return product
   */
  public Q multiply(final long n) {
    return new Q(num().multiply(n), den());
  }

  /**
   * Divide this rational by a rational.
   *
   * @param n divisor
   * @return quotient
   * @exception IllegalArgumentException if <code>n</code> is zero.
   */
  public Q divide(final Q n) {
    return new Q(num().multiply(n.den()), den().multiply(n.num()));
  }

  /**
   * Divide this rational by an integer.
   *
   * @param n divisor
   * @return quotient
   * @exception IllegalArgumentException if <code>n</code> is zero.
   */
  public Q divide(final Z n) {
    return new Q(num(), den().multiply(n));
  }

  /**
   * Divide this rational by an integer.
   *
   * @param n divisor
   * @return quotient
   * @exception IllegalArgumentException if <code>n</code> is zero.
   */
  public Q divide(final long n) {
    return new Q(num(), den().multiply(n));
  }

  /**
   * Return the square of this rational.
   *
   * @return square
   */
  public Q square() {
    return new Q(num().square(), den().square());
  }

  /**
   * Return an integer power of this rational.
   *
   * @param exponent exponent
   * @return <code>this^exponent</code>
   */
  public Q pow(final long exponent) {
    if (exponent < 0) {
      return reciprocal().pow(-exponent);
    } else if (exponent == 0) {
      return Q.ONE;
    } else if (exponent == 1) {
      return this;
    } else {
      return new Q(num().pow(exponent), den().pow(exponent));
    }
  }

  /**
   * Test if this rational is a proper fraction. That is, test
   * that <code>|p|/q</code> is less than 1.
   *
   * @return true for a proper fraction
   */
  public boolean isProperFraction() {
    return num().abs().compareTo(den()) < 0;
  }

  /**
   * The absolute value of this rational.
   * @return absolute values
   */
  public Q abs() {
    return signum() >= 0 ? this : new Q(mP.negate(), mQ);
  }

  /**
   * Convert to a double.  Note this may not work well for large numerators and denominators.
   * @return double value
   */
  public double doubleValue() {
    return num().doubleValue() / den().doubleValue();
  }

  /**
   * If the condition is true add the value <code>a</code> otherwise subtract it.
   * @param condition true for addition, false for subtraction
   * @param a value to add or subtract
   * @return this integer plus or minus the given integer
   */
  public Q signedAdd(final boolean condition, final Q a) {
    return condition ? add(a) : subtract(a);
  }

  /**
   * The proper fractional part of this rational.
   * @return fractional part
   */
  public Q frac() {
    return subtract(floor());
  }

  /**
   * Test if this number is zero.
   * @return true if the number is 0.
   */
  public boolean isZero() {
    return num().isZero();
  }

  /**
   * Return the maximum of two rationals.
   * @param other other number
   * @return maximum
   */
  public Q max(final Q other) {
    return num().multiply(other.den()).compareTo(other.num().multiply(den())) >= 0 ? this : other;
  }

  /**
   * Return the maximum of two rationals.
   * @param other other number
   * @return maximum
   */
  public Q min(final Q other) {
    return num().multiply(other.den()).compareTo(other.num().multiply(den())) <= 0 ? this : other;
  }

  /**
   * Return a rational number with the same value as the specified long.
   * @param val a long value
   * @return a rational number with the value <code>val</code>
   */
  public static Q valueOf(final long val) {
    return new Q(val);
  }

  /**
   * Return a rational number with the same value as the specified integer.
   * @param val an integer.
   * @return a rational number with the value <code>val</code>
   */
  public static Q valueOf(final Z val) {
    return new Q(val);
  }
}
