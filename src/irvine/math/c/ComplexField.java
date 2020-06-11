package irvine.math.c;

import java.util.Iterator;

import irvine.math.api.Ei;
import irvine.math.api.Exp;
import irvine.math.api.Gamma;
import irvine.math.api.HyperbolicTrigonometric;
import irvine.math.api.Hypergeometric;
import irvine.math.api.Pow;
import irvine.math.api.Sqrt;
import irvine.math.api.Trigonometric;
import irvine.math.generic.HyperbolicTrigonometricImpl;
import irvine.math.group.AbstractField;
import irvine.math.group.AbstractRing;
import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Field of complex numbers.
 * @author Sean A. Irvine
 */
public final class ComplexField extends AbstractField<C> implements Exp<C>, HyperbolicTrigonometric<C>, Pow<C>, Sqrt<C>, Trigonometric<C>, Gamma<C>, Ei<C>, Hypergeometric<C> {

  /** Singleton. */
  public static final ComplexField SINGLETON = new ComplexField();

  private ComplexField() { }

  @Override
  public C zero() {
    return C.ZERO;
  }

  @Override
  public C one() {
    return C.ONE;
  }

  /**
   * The imaginary unit.
   * @return i
   */
  public C i() {
    return C.I;
  }
  
  @Override
  public boolean isCyclic() {
    return false;
  }

  @Override
  public boolean isCommutative() {
    return true;
  }

  @Override
  public C add(final C a, final C b) {
    return new C(a.re() + b.re(), a.im() + b.im());
  }

  /**
   * Convenience method to add a real number to a complex number.
   * @param a complex value
   * @param b real value
   * @return <code>a+b</code>
   */
  public C add(final C a, final double b) {
    return new C(a.re() + b, a.im());
  }

  @Override
  public C subtract(final C a, final C b) {
    return new C(a.re() - b.re(), a.im() - b.im());
  }

  /**
   * Convenience method to subtract a real number to a complex number.
   * @param a complex value
   * @param b real value
   * @return <code>a-b</code>
   */
  public C subtract(final C a, final double b) {
    return new C(a.re() - b, a.im());
  }

  @Override
  public C multiply(final C u, final C v) {
    final double a = u.re();
    final double b = u.im();
    final double c = v.re();
    final double d = v.im();
    return new C(a * c - b * d, a * d + b * c);
  }

  /**
   * Convenience to multiply a complex number by a real number.
   * @param u complex number
   * @param v real number
   * @return <code>u*v</code>
   */
  public C multiply(final C u, final double v) {
    return new C(u.re() * v, u.im() * v);
  }

  @Override
  public C divide(final C u, final C v) {
    final double a = u.re();
    final double b = u.im();
    final double c = v.re();
    final double d = v.im();
    /*
    // Naive way has accuracy issues
    final double x = c * c + d * d;
    return new C((a * c + b * d) / x, (b * c - a * d) / x);
    */
    if (Math.abs(c) >= Math.abs(d)) {
      final double t = d / c;
      final double x = c + t * d;
      return new C((a + b * t) / x, (b - a * t) / x);
    } else {
      final double t = c / d;
      final double x = d + t * c;
      return new C((a * t + b) / x, (b * t - a) / x);
    }
  }

  @Override
  public C negate(final C z) {
    return new C(-z.re(), -z.im());
  }

  /**
   * Return the conjugate of the given number.
   * @param z complex number
   * @return conjugate
   */
  public C conjugate(final C z) {
    return new C(z.re(), -z.im());
  }

  @Override
  public C inverse(final C z) {
    final double d = z.re() * z.re() + z.im() * z.im();
    return new C(z.re() / d, -z.im() / d);
  }

  /**
   * Return the absolute value (modulus) of this complex number.
   * @param z complex number
   * @return <code>|z|</code>
   */
  public double abs(final C z) {
    return z.doubleValue();
  }

  /**
   * Return the argument of this complex number.
   * @param z complex number
   * @return argument of <code>z</code>
   */
  public double arg(final C z) {
    return Math.atan2(z.im(), z.re());
  }

  /**
   * Complex power.
   * @param z complex number
   * @param n power
   * @return <code>z^n</code>
   */
  public C pow(final C z, final double n) {
    final double mod = abs(z);
    final double arg = arg(z);
    final double a = Math.pow(mod, n);
    final double b = n * arg;
    return new C(a * Math.cos(b), a * Math.sin(b));
  }

  @Override
  public C pow(final C z, final long n) {
    return AbstractRing.pow(this, z, n);
  }

  /**
   * Compute the power of a complex number to a complex number,
   * returning the principal value.
   * @param base real base
   * @param exponent complex exponent
   * @return value of <code>base^exponent</code>
   */
  public C pow(final double base, final C exponent) {
    final double c = exponent.im();
    final double b = exponent.re();
    final double ab = Math.pow(base, b);
    if (c == 0) {
      // Avoid trig in case where both values are real
      return new C(ab);
    }
    final double ln = c * Math.log(base);
    return new C(ab * Math.cos(ln), ab * Math.sin(ln));
  }

  /**
   * Compute the power of a complex number to a complex number,
   * returning a principal value.
   * @param base complex base
   * @param exponent complex exponent
   * @return value of <code>base^exponent</code>
   */
  @Override
  public C pow(final C base, final C exponent) {
    final double a = base.re();
    final double b = base.im();
    if (b == 0) {
      return pow(a, exponent);
    }
    final double arg = arg(base);
    final double c = exponent.re();
    final double d = exponent.im();
    final double s = a * a + b * b;
    final double e = Math.pow(s, 0.5 * c) * Math.exp(-d * arg);
    final double theta = c * arg + 0.5 * d * Math.log(s);
    return new C(e * Math.cos(theta), e * Math.sin(theta));
  }

  @Override
  public C sqrt(final C z) {
    if (C.ZERO.equals(z)) {
      return z;
    }
    final double x = Math.abs(z.re());
    final double y = Math.abs(z.im());
    final double r, w;
    if (x >= y) {
      r = y / x;
      w = Math.sqrt(x) * Math.sqrt(0.5 * (1 + Math.sqrt(1 + r * r)));
    } else {
      r = x / y;
      w = Math.sqrt(y) * Math.sqrt(0.5 * (r + Math.sqrt(1 + r * r)));
    }
    if (z.re() >= 0) {
      return new C(w, z.im() / (2 * w));
    } else {
      final double im = z.im() >= 0 ? w : -w;
      return new C(z.im() / (2 * im), im);
    }
  }

  @Override
  public C exp(final C z) {
    final double a = z.re();
    final double b = z.im();
    final double e = Math.exp(a);
    if (b == 0) {
      // Avoid doing trig for pure real case
      return new C(e);
    }
    return new C(e * Math.cos(b), e * Math.sin(b));
  }

  /**
   * The principal logarithm of a complex number.
   * @param z complex number
   * @return <code>Log(z)</code>
   */
  public C log(final C z) {
    return new C(Math.log(abs(z)), arg(z));
  }

  @Override
  public C sin(final C z) {
    final double a = z.re();
    final double b = z.im();
    return new C(Math.sin(a) * Math.cosh(b), Math.cos(a) * Math.sinh(b));
  }

  @Override
  public C cos(final C z) {
    final double a = z.re();
    final double b = z.im();
    return new C(Math.cos(a) * Math.cosh(b), -Math.sin(a) * Math.sinh(b));
  }

  @Override
  public C tan(final C z) {
    final double a = z.re();
    final double b = z.im();
    final double c = Math.cos(a);
    final double s = Math.sinh(b);
    final double d = c * c + s * s;
    return new C(Math.sin(a) * c / d, s * Math.cosh(b) / d);
  }

  @Override
  public C cot(final C z) {
    return inverse(tan(z));
  }

  @Override
  public C sec(final C z) {
    return inverse(cos(z));
  }

  @Override
  public C csc(final C z) {
    return inverse(sin(z));
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final C element) {
    return element != null;
  }

  // todo this iterator could be made fairer
  private static class ComplexIterator extends AbstractIterator<C> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private double mRealPart = -1;

    @Override
    public C next() {
      return new C(++mRealPart, 0);
    }
  }

  @Override
  public Iterator<C> iterator() {
    return new ComplexIterator();
  }

  @Override
  public String toString() {
    return "\\C";
  }

  private static final C GAMMA0 = new C(1.000000000190015);
  private static final C[] GAMMA_COEFF = {
    new C(76.18009172947146),
    new C(-86.50532032941677),
    new C(24.01409824083091),
    new C(-1.231739572450155),
    new C(1.208650973866179E-3),
    new C(-5.395239384953E-6)
  };

  /**
   * Logarithm of gamma function.
   * @param z argument
   * @return the gamma function
   */
  public C lgamma(final C z) {
    C sum = GAMMA0;
    for (int k = 0; k < GAMMA_COEFF.length; ++k) {
      sum = add(sum, divide(GAMMA_COEFF[k], add(z, k)));
    }
    sum = log(multiply(sum, Constants.SQRT_TAU));
    final C z45 = add(z, 4.5);
    sum = add(sum, multiply(log(z45), subtract(z, 0.5)));
    return subtract(sum, z45);
  }

  @Override
  public C sinh(final C n) {
    return HyperbolicTrigonometricImpl.sinh(this, C.HALF, n);
  }
  
  @Override
  public C cosh(final C n) {
    return HyperbolicTrigonometricImpl.cosh(this, C.HALF, n);
  }
  
  @Override
  public C tanh(final C n) {
    return HyperbolicTrigonometricImpl.tanh(this, n);
  }
  
  @Override
  public C coth(final C n) {
    return HyperbolicTrigonometricImpl.coth(this, n);
  }
  
  @Override
  public C sech(final C n) {
    return HyperbolicTrigonometricImpl.sech(this, C.TWO, n);
  }
  
  @Override
  public C csch(final C n) {
    return HyperbolicTrigonometricImpl.csch(this, C.TWO, n);
  }
  
  @Override
  public C asin(final C z) {
    final double x = z.re();
    final double y = z.im();
    final double y2 = y * y;
    final double r = 0.5 * Math.sqrt((x + 1) * (x + 1) + y2);
    final double s = 0.5 * Math.sqrt((x - 1) * (x - 1) + y2);
    final double a = r + s;
    final double asinb = Math.asin(r - s);
    final double alog = Math.log(a + Math.sqrt(a * a - 1));
    return new C(asinb, y < 0 || (y == 0 && x > 1) ? -alog : alog);
  }
  
  @Override
  public C acos(final C z) {
    final double x = z.re();
    final double y = z.im();
    final double y2 = y * y;
    final double r = 0.5 * Math.sqrt((x + 1) * (x + 1) + y2);
    final double s = 0.5 * Math.sqrt((x - 1) * (x - 1) + y2);
    final double a = r + s;
    final double asinb = Math.asin(r - s);
    final double alog = Math.log(a + Math.sqrt(a * a - 1));
    return new C(Constants.HALF_PI - asinb, y < 0 || (y == 0 && x > 1) ? alog : -alog);
  }
  
  @Override
  public C atan(final C z) {
    final double x = z.re();
    final double y = z.im();
    final double x2 = x * x;
    final double r = 0.5 * Math.atan2(2 * x, 1 - x2 - y * y);
    final double s = 0.25 * Math.log((x2 + (y + 1) * (y + 1)) / (x2 + (y - 1) * (y - 1)));
    return new C(r, s);
  }

  @Override
  public C acot(final C z) {
    return subtract(new C(Constants.HALF_PI), atan(z));
  }

  @Override
  public C gamma(final C z) {
    return ComplexGamma.gamma(z);
  }
  @Override
  public C ei(final C z) {
    return ComplexEi.ei(z);
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public C hypergeometric(final C[] upperParameters, final C[] lowerParameters, final C z) {
    return ComplexHypergeometric.hypergeometric(upperParameters, lowerParameters, z);
  }

  @Override
  public C hypergeometric(final C a, final C b, final C z) {
    return ComplexHypergeometric.hypergeometric(a, b, z);
  }

  @Override
  public C hypergeometric(final C a, final C b, final C c, final C z) {
    return ComplexHypergeometric.hypergeometric(a, b, c, z);
  }

  @Override
  public C coerce(final long n) {
    return new C(n);
  }
}
