package irvine.math.cc;

import java.util.Iterator;

import irvine.math.api.Exp;
import irvine.math.api.Pow;
import irvine.math.api.Sqrt;
import irvine.math.api.Trigonometric;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.AbstractField;
import irvine.math.group.AbstractRing;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Field of complex numbers.
 * @author Sean A. Irvine
 */
public final class ComputableComplexField extends AbstractField<CC> implements Exp<CC>, Pow<CC>, Sqrt<CC>, Trigonometric<CC> {

  /** Singleton. */
  public static final ComputableComplexField SINGLETON = new ComputableComplexField();

  private ComputableComplexField() { }

  @Override
  public CC zero() {
    return CC.ZERO;
  }

  @Override
  public CC one() {
    return CC.ONE;
  }

  /**
   * The imaginary unit.
   * @return i
   */
  public CC i() {
    return CC.I;
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
  public CC add(final CC a, final CC b) {
    return new CC(a.re().add(b.re()), a.im().add(b.im()));
  }

  /**
   * Convenience method to add a real number to a complex number.
   * @param a complex value
   * @param b real value
   * @return <code>a+b</code>
   */
  public CC add(final CC a, final CR b) {
    return new CC(a.re().add(b), a.im());
  }

  @Override
  public CC subtract(final CC a, final CC b) {
    return new CC(a.re().subtract(b.re()), a.im().subtract(b.im()));
  }

  /**
   * Convenience method to subtract a real number to a complex number.
   * @param a complex value
   * @param b real value
   * @return <code>a-b</code>
   */
  public CC subtract(final CC a, final CR b) {
    return new CC(a.re().subtract(b), a.im());
  }

  @Override
  public CC multiply(final CC u, final CC v) {
    final CR a = u.re();
    final CR b = u.im();
    final CR c = v.re();
    final CR d = v.im();
    return new CC(a.multiply(c).subtract(b.multiply(d)), a.multiply(d).add(b.multiply(c)));
  }

  /**
   * Convenience to multiply a complex number by a real number.
   * @param u complex number
   * @param v real number
   * @return <code>u*v</code>
   */
  public CC multiply(final CC u, final CR v) {
    return new CC(u.re().multiply(v), u.im().multiply(v));
  }

  @Override
  public CC divide(final CC u, final CC v) {
    final CR a = u.re();
    final CR b = u.im();
    final CR c = v.re();
    final CR d = v.im();
    final CR x = c.multiply(c).add(d.multiply(d));
    return new CC(a.multiply(c).add(b.multiply(d)).divide(x), b.multiply(c).subtract(a.multiply(d)).divide(x));
  }

  @Override
  public CC negate(final CC z) {
    return new CC(z.re().negate(), z.im().negate());
  }

  /**
   * Return the conjugate of the given number.
   * @param z complex number
   * @return conjugate
   */
  public CC conjugate(final CC z) {
    return new CC(z.re(), z.im().negate());
  }

  @Override
  public CC inverse(final CC z) {
    final CR d = z.re().multiply(z.re()).add(z.im().multiply(z.im()));
    return new CC(z.re().divide(d), z.im().negate().divide(d));
  }

  /**
   * Return the absolute value (modulus) of this complex number.
   * @param z complex number
   * @return <code>|z|</code>
   */
  public CR abs(final CC z) {
    return z.re().multiply(z.re()).add(z.im().multiply(z.im())).sqrt();
  }

  /**
   * Return the argument of this complex number.
   * @param z complex number
   * @return argument of <code>z</code>
   */
  public CR arg(final CC z) {
    final CR x = z.re();
    final CR y = z.im();
    if (y == CR.ZERO) {
      final int c = x.compareTo(CR.ZERO);
      if (c > 0) {
        return CR.ZERO;
      } else if (c < 0) {
        return CR.PI;
      } else {
        return null; // undefined
      }
    } else {
      return ComputableReals.SINGLETON.atan(abs(z).subtract(x).divide(y)).multiply(CR.TWO);
    }
    //return ComputableReals.SINGLETON.atan(z.im().divide(z.re()));
  }

  /**
   * Complex power.
   * @param z complex number
   * @param n power
   * @return <code>z^n</code>
   */
  public CC pow(final CC z, final CR n) {
    final CR mod = abs(z);
    final CR arg = arg(z);
    final CR a = ComputableReals.SINGLETON.pow(mod, n);
    final CR b = n.multiply(arg);
    return new CC(a.multiply(ComputableReals.SINGLETON.cos(b)), a.multiply(ComputableReals.SINGLETON.sin(b)));
  }

  @Override
  public CC pow(final CC z, final long n) {
    return AbstractRing.pow(this, z, n);
  }

  /**
   * Compute the power of a complex number to a complex number,
   * returning the principal value.
   * @param base real base
   * @param exponent complex exponent
   * @return value of <code>base^exponent</code>
   */
  public CC pow(final CR base, final CC exponent) {
    final CR c = exponent.im();
    final CR b = exponent.re();
    final CR ab = ComputableReals.SINGLETON.pow(base, b);
    if (c == CR.ZERO) {
      // Avoid trig in case where both values are real
      return new CC(ab);
    }
    final CR ln = c.multiply(base.log());
    return new CC(ab.multiply(ComputableReals.SINGLETON.cos(ln)), ab.multiply(ComputableReals.SINGLETON.sin(ln)));
  }

  /**
   * Compute the power of a complex number to a complex number,
   * returning a principal value.
   * @param base complex base
   * @param exponent complex exponent
   * @return value of <code>base^exponent</code>
   */
  @Override
  public CC pow(final CC base, final CC exponent) {
    final CR a = base.re();
    final CR b = base.im();
    if (b == CR.ZERO) {
      return pow(a, exponent);
    }
    final CR arg = arg(base);
    final CR c = exponent.re();
    final CR d = exponent.im();
    final CR s = a.multiply(a).add(b.multiply(b));
    final CR e = ComputableReals.SINGLETON.pow(s, CR.HALF.multiply(c)).multiply(d.negate().multiply(arg).exp());
    final CR theta = c.multiply(arg).add(CR.HALF.multiply(d).multiply(s.log()));
    return new CC(e.multiply(ComputableReals.SINGLETON.cos(theta)), e.multiply(ComputableReals.SINGLETON.sin(theta)));
  }

  @Override
  public CC sqrt(final CC z) {
    final CR r = abs(z);
    final CC n = add(z, r);
    final CR d = abs(n);
    return multiply(multiply(n, r.sqrt()), d.inverse());
  }

  @Override
  public CC exp(final CC z) {
    final CR a = z.re();
    final CR b = z.im();
    final CR e = a.exp();
    if (b == CR.ZERO) {
      // Avoid doing trig for pure real case
      return new CC(e);
    }
    return new CC(e.multiply(ComputableReals.SINGLETON.cos(b)), e.multiply(ComputableReals.SINGLETON.sin(b)));
  }

  /**
   * The principal logarithm of a complex number.
   * @param z complex number
   * @return <code>Log(z)</code>
   */
  public CC log(final CC z) {
    return new CC(abs(z).log(), arg(z));
  }

  @Override
  public CC sin(final CC z) {
    final CR a = z.re();
    final CR b = z.im();
    return new CC(ComputableReals.SINGLETON.sin(a).multiply(ComputableReals.SINGLETON.cosh(b)), ComputableReals.SINGLETON.cos(a).multiply(ComputableReals.SINGLETON.sinh(b)));
  }

  @Override
  public CC cos(final CC z) {
    final CR a = z.re();
    final CR b = z.im();
    return new CC(ComputableReals.SINGLETON.cos(a).multiply(ComputableReals.SINGLETON.cosh(b)), ComputableReals.SINGLETON.sin(a).negate().multiply(ComputableReals.SINGLETON.sinh(b)));
  }

  @Override
  public CC tan(final CC z) {
    final CR a = z.re();
    final CR b = z.im();
    final CR c = ComputableReals.SINGLETON.cos(a);
    final CR s = ComputableReals.SINGLETON.sinh(b);
    final CR d = c.multiply(c).add(s.multiply(s));
    return new CC(ComputableReals.SINGLETON.sin(a).multiply(c).divide(d), s.multiply(ComputableReals.SINGLETON.cosh(b)).divide(d));
  }

  @Override
  public CC cot(final CC z) {
    return inverse(tan(z));
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final CC element) {
    return element != null;
  }

  // todo this iterator could be made fairer
  private static class ComplexIterator extends AbstractIterator<CC> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private long mRealPart = -1;

    @Override
    public CC next() {
      return new CC(CR.valueOf(++mRealPart), CR.ZERO);
    }
  }

  @Override
  public Iterator<CC> iterator() {
    return new ComplexIterator();
  }

  @Override
  public String toString() {
    return "\\C";
  }

  @Override
  public CC asin(final CC z) {
    final CR x = z.re();
    final CR y = z.im();
    final CR y2 = y.multiply(y);
    final CR xp = x.add(CR.ONE);
    final CR r = CR.HALF.multiply(xp.multiply(xp).add(y2).sqrt());
    final CR xm = x.subtract(CR.ONE);
    final CR s = CR.HALF.multiply(xm.multiply(xm).add(y2).sqrt());
    final CR a = r.add(s);
    final CR asinb = ComputableReals.SINGLETON.asin(r.subtract(s));
    final CR alog = a.add(a.multiply(a).subtract(CR.ONE).sqrt()).log();
    return new CC(asinb, y.signum() < 0 || (y.signum() == 0 && x.compareTo(CR.ONE) > 0) ? alog.negate() : alog);
  }
  
  @Override
  public CC acos(final CC z) {
    final CR x = z.re();
    final CR y = z.im();
    final CR y2 = y.multiply(y);
    final CR xp = x.add(CR.ONE);
    final CR r = CR.HALF.multiply(xp.multiply(xp).add(y2).sqrt());
    final CR xm = x.subtract(CR.ONE);
    final CR s = CR.HALF.multiply(xm.multiply(xm).add(y2).sqrt());
    final CR a = r.add(s);
    final CR asinb = ComputableReals.SINGLETON.asin(r.subtract(s));
    final CR alog = a.add(a.multiply(a).subtract(CR.ONE).sqrt()).log();
    return new CC(CR.HALF_PI.subtract(asinb), y.signum() < 0 || (y.signum() == 0 && x.compareTo(CR.ONE) > 0) ? alog : alog.negate());
  }

  private static final CC TWO_I = new CC(CR.ZERO, CR.TWO);
  
  @Override
  public CC atan(final CC z) {
    final CC a = subtract(CC.I, z);
    final CC b = add(CC.I, z);
    final CC log = log(divide(a, b));
    return divide(log, TWO_I);
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public CC coerce(final long n) {
    return new CC(CR.valueOf(n));
  }
}
