package irvine.math.cc;

import irvine.math.cr.CR;

/**
 * An object to hold an immutable computable complex number.
 * @author Sean A. Irvine
 */
public class CC extends Number implements Comparable<CC> {

  // Note this is primarily a container object and does not contain the code or
  // methods for actually operating on complex numbers.  The actual implementation
  // is in the ComputableComplexField class.

  /** Constant zero. */
  public static final CC ZERO = new CC(CR.ZERO);
  /** Constant one. */
  public static final CC ONE = new CC(CR.ONE);
  /** Constant two. */
  public static final CC TWO = new CC(CR.TWO);
  /** Constant <code>i</code>. */
  public static final CC I = new CC(CR.ZERO, CR.ONE);
  /** Constant 1/2. */
  public static final CC HALF = new CC(CR.HALF);

  private final CR mRe;
  private final CR mIm;

  /**
   * Construct a complex number with specified real and imaginary parts.
   * @param re real part
   * @param im imaginary part
   */
  public CC(final CR re, final CR im) {
    mRe = re;
    mIm = im;
  }

  /**
   * Construct the complex number <code>n+0i</code>.
   * @param x double value
   */
  public CC(final CR x) {
    this(x, CR.ZERO);
  }

  /**
   * Construct the complex number <code>n+0i</code>.
   * @param x double value
   */
  public CC(final long x) {
    this(CR.valueOf(x), CR.ZERO);
  }

  /**
   * The real part of this complex number.
   * @return real part
   */
  public CR re() {
    return mRe;
  }


  /**
   * The imaginary part of this complex number.
   * @return imaginary part
   */
  public CR im() {
    return mIm;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof CC)) {
      return false;
    }
    final CC z = (CC) obj;
    return re().equals(z.re()) && im().equals(z.im());
  }

  /**
   * Test if this complex number is within the specified tolerance of another
   * number testing real and imaginary parts independently.
   * @param z other number
   * @param tolerance tolerance per part in bits
   * @return true if equal up to tolerance
   */
  public boolean equals(final CC z, final int tolerance) {
    return re().compareTo(z.re(), tolerance) == 0 && im().compareTo(z.im(), tolerance) == 0;
  }

  @Override
  public int hashCode() {
    return re().hashCode() ^ (17 * im().hashCode());
  }

  @Override
  public int compareTo(final CC z) {
    if (z == this) {
      return 0;
    }
    final int c = re().compareTo(z.re());
    if (c == 0) {
      return im().compareTo(z.im());
    }
    return c;
  }

  /**
   * Return the number in string form.
   * @param n Number of digits included to the right of decimal point
   * @return string representation
   */
  public String toString(final int n) {
    final StringBuilder sb = new StringBuilder();
    sb.append(re().toString(n));
    final String ims = im().toString(n);
    if (ims.startsWith("-")) {
      sb.append(ims);
    } else {
      sb.append('+');
      sb.append(ims);
    }
    sb.append('i');
    return sb.toString();
  }

  @Override
  public String toString() {
    return toString(10);
  }

  @Override
  public double doubleValue() {
    if (im().signum(32) != 0) {
      return Double.NaN;
    }
    return re().doubleValue();
  }

  @Override
  public int intValue() {
    return (int) doubleValue();
  }

  @Override
  public long longValue() {
    return (long) doubleValue();
  }

  @Override
  public float floatValue() {
    return (float) doubleValue();
  }

}
