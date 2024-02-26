package irvine.math.c;

/**
 * An object to hold an immutable complex number.
 *
 * @author Sean A. Irvine
 */
public class C extends Number implements Comparable<C> {

  // Note this is primarily a container object and does not contain the code or
  // methods for actually operating on complex numbers.  The actual implementation
  // is in the ComplexField class.

  static final int DOUBLE_PRECISION = 52;

  /** Constant zero. */
  public static final C ZERO = new C(0);
  /** Constant one. */
  public static final C ONE = new C(1);
  /** Constant two. */
  public static final C TWO = new C(2);
  /** Constant <code>i</code>. */
  public static final C I = new C(0, 1);
  /** Constant 1/2. */
  public static final C HALF = new C(0.5);

  private final double mRe;
  private final double mIm;

  /**
   * Construct a complex number from a point in the plane specified in polar
   * form. That is, construct a complex number from a radius and angle.
   * @param radius absolute value of the number
   * @param angleInRadians argument of the number
   * @return complex number <code>radius * cis(angleInRadians)</code>
   */
  public static C cis(final double radius, final double angleInRadians) {
    return new C(radius * Math.cos(angleInRadians), radius * Math.sin(angleInRadians));
  }

  /**
   * Construct a complex number with specified real and imaginary
   * parts.
   * @param re real part
   * @param im imaginary part
   */
  public C(final double re, final double im) {
    mRe = re;
    mIm = im;
  }

  /**
   * Construct the complex number <code>n+0i</code>.
   * @param x double value
   */
  public C(final double x) {
    this(x, 0);
  }

  /**
   * The real part of this complex number.
   * @return real part
   */
  public double re() {
    return mRe;
  }


  /**
   * The imaginary part of this complex number.
   * @return imaginary part
   */
  public double im() {
    return mIm;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof C)) {
      return false;
    }
    final C z = (C) obj;
    return re() == z.re() && im() == z.im();
  }

  /**
   * Test if this complex number is within the specified tolerance of another
   * number testing real and imaginary parts independently.
   * @param z other number
   * @param tolerance tolerance per part
   * @return true if equal up to tolerance
   */
  public boolean equals(final C z, final double tolerance) {
    return Math.abs(re() - z.re()) <= tolerance && Math.abs(im() - z.im()) <= tolerance;
  }

  @Override
  public int hashCode() {
    final long h = Double.doubleToLongBits(re()) ^ (17 * Double.doubleToLongBits(im()));
    return (int) (h ^ (h >>> 32));
  }

  @Override
  public int compareTo(final C z) {
    if (z == this) {
      return 0;
    }
    final int c = Double.compare(re(), z.re());
    if (c == 0) {
      return Double.compare(im(), z.im());
    }
    return c;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    if (re() != 0 || im() == 0) {
      sb.append(re());
    }
    if (im() != 0) {
      if (!(im() < 0)) {
        if (sb.length() > 0) {
          sb.append('+');
        }
      }
      sb.append(im());
      sb.append('i');
    }
    return sb.toString();
  }

  // Uses ideas from Hull, Fairgrieve, Tang, "Implementing Complex Elementary Functions Using Exception Handling"
  @Override
  public double doubleValue() {
    final double re = re();
    final double im = im();
    final double abs = Math.sqrt(re * re + im * im);
    if (Double.isFinite(abs)) {
      return abs;
    }
    // If the naive calculation above (which works most of the time) fails to give a sensible
    // answer, then try some more tricks to get a precise answer.
    if (im == 0) {
      return Math.abs(re);
    }
    if (re == 0) {
      return Math.abs(im);
    }
    final int logRe = Math.getExponent(re);
    final int logIm = Math.getExponent(im);
    if (2 * Math.abs(logRe - logIm) > DOUBLE_PRECISION + 1) {
      // Exponents are so different that the smaller one can be ignored
      return Math.max(Math.abs(re), Math.abs(im));
    }
    // Rescale so that abs(x) is near 1
    final double scaledRe = Math.scalb(re, -logRe);
    final double scaledIm = Math.scalb(im, -logRe);
    final double scaledRes = Math.sqrt(scaledRe * scaledRe + scaledIm * scaledIm);
    // Unscale and reture the result
    return Math.scalb(scaledRes, logRe);
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
