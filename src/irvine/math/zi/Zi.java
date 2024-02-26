package irvine.math.zi;

import irvine.math.c.C;
import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;

/**
 * An object to hold an immutable Gaussian integer.
 * @author Sean A. Irvine
 */
public class Zi extends Number implements Comparable<Zi> {

  /** Constant zero. */
  public static final Zi ZERO = new Zi(0);
  /** Constant one. */
  public static final Zi ONE = new Zi(1);
  /** Constant two. */
  public static final Zi TWO = new Zi(2);
  /** Constant <code>i</code>. */
  public static final Zi I = new Zi(0, 1);

  private final Z mRe;
  private final Z mIm;

  /**
   * Construct a Gaussian integer.
   * @param re real part
   * @param im imaginary part
   */
  public Zi(final Z re, final Z im) {
    mRe = re;
    mIm = im;
  }

  /**
   * Construct a Gaussian integer.
   * @param re real part
   * @param im imaginary part
   */
  public Zi(final long re, final long im) {
    this(Z.valueOf(re), Z.valueOf(im));
  }

  /**
   * Construct a Gaussian integer.
   * @param re real part
   */
  public Zi(final long re) {
    this(Z.valueOf(re), Z.ZERO);
  }

  /**
   * Construct a Gaussian integer.
   * @param x real part
   */
  public Zi(final Z x) {
    this(x, Z.ZERO);
  }

  /**
   * The real part of this Gaussian integer.
   * @return real part
   */
  public Z re() {
    return mRe;
  }

  /**
   * The imaginary part of this Gaussian integer.
   * @return imaginary part
   */
  public Z im() {
    return mIm;
  }

  /**
   * Test if this number is zero.
   * @return true iff this number is zero
   */
  public boolean isZero() {
    return re().isZero() && im().isZero();
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Zi)) {
      return false;
    }
    final Zi z = (Zi) obj;
    return re().equals(z.re()) && im().equals(z.im());
  }

  @Override
  public int hashCode() {
    final long h = re().hashCode() ^ (17L * im().hashCode());
    return (int) (h ^ (h >>> 32));
  }

  @Override
  public int compareTo(final Zi z) {
    if (z == this) {
      return 0;
    }
    final int c = re().compareTo(z.re());
    if (c == 0) {
      return im().compareTo(z.im());
    }
    return c;
  }

  @Override
  public String toString() {
    if (isZero()) {
      return "0";
    }
    final StringBuilder sb = new StringBuilder();
    if (!re().isZero()) {
      sb.append(re());
    }
    if (!im().isZero()) {
      if (im().signum() >= 0 && sb.length() > 0) {
        sb.append('+');
      }
      if (!Z.ONE.equals(im())) {
        sb.append(im());
      }
      sb.append('i');
    }
    return sb.toString();
  }

  @Override
  public double doubleValue() {
    return new C(re().doubleValue(), im().doubleValue()).doubleValue();
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

  /**
   * Add another Gaussian integer to this Gaussian integer.
   * @param n number to add
   * @return sum
   */
  public Zi add(final Zi n) {
    return new Zi(re().add(n.re()), im().add(n.im()));
  }

  /**
   * Add an integer to this Gaussian integer.
   * @param n number to add
   * @return sum
   */
  public Zi add(final Z n) {
    return new Zi(re().add(n), im());
  }

  /**
   * Subtract another Gaussian integer from this Gaussian integer.
   * @param n number to subtract
   * @return difference
   */
  public Zi subtract(final Zi n) {
    return new Zi(re().subtract(n.re()), im().subtract(n.im()));
  }

  /**
   * Add an integer from this Gaussian integer.
   * @param n number to subtract
   * @return difference
   */
  public Zi subtract(final Z n) {
    return new Zi(re().subtract(n), im());
  }

  /**
   * Multiply this Gaussian integer by another Gaussian integer.
   * @param n number to multiply by
   * @return product
   */
  public Zi multiply(final Zi n) {
    final Z a = re();
    final Z b = im();
    final Z c = n.re();
    final Z d = n.im();
    return new Zi(a.multiply(c).subtract(b.multiply(d)), a.multiply(d).add(b.multiply(c)));
  }

  /**
   * Multiply this Gaussian integer by an integer.
   * @param n number to multiply by
   * @return product
   */
  public Zi multiply(final Z n) {
    return new Zi(re().multiply(n), im().multiply(n));
  }

  /**
   * Negate this Gaussian integer.
   * @return negation
   */
  public Zi negate() {
    return new Zi(re().negate(), im().negate());
  }

  /**
   * Return the complex conjugate of this Gaussian integer.
   * @return conjugate
   */
  public Zi conjugate() {
    return new Zi(re(), im().negate());
  }

  /**
   * Return the absolute value (modulus) of this Gaussian integer.
   * @return absolute value
   */
  public Z abs() {
    return re().square().add(im().square());
  }

  /**
   * Compute a power of this Gaussian integer.
   * @param n power
   * @return power
   */
  public Zi pow(final long n) {
    return GaussianIntegers.SINGLETON.pow(this, n);
  }

}
