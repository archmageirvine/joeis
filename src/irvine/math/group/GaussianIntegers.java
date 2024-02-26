package irvine.math.group;

import java.util.Iterator;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.util.AbstractIterator;

/**
 * Integral domain of Gaussian integers.
 * @author Sean A. Irvine
 */
public final class GaussianIntegers extends AbstractIntegralDomain<Zi> {

  /** Singleton. */
  public static final GaussianIntegers SINGLETON = new GaussianIntegers();

  private GaussianIntegers() { }

  @Override
  public Zi zero() {
    return Zi.ZERO;
  }

  @Override
  public Zi one() {
    return Zi.ONE;
  }

  /**
   * The imaginary unit.
   * @return i
   */
  public Zi i() {
    return Zi.I;
  }

  /**
   * Real part.
   * @param n number
   * @return real part
   */
  public Z re(final Zi n) {
    return n.re();
  }

  /**
   * Imaginary part.
   * @param n number
   * @return imaginary part
   */
  public Z im(final Zi n) {
    return n.im();
  }

  @Override
  public boolean isCyclic() {
    return false;
  }

  @Override
  public Zi add(final Zi a, final Zi b) {
    return a.add(b);
  }

  @Override
  public Zi subtract(final Zi a, final Zi b) {
    return a.subtract(b);
  }

  @Override
  public Zi multiply(final Zi u, final Zi v) {
    return u.multiply(v);
  }

  @Override
  public Zi negate(final Zi z) {
    return z.negate();
  }

  @Override
  public Zi conjugate(final Zi z) {
    return z.conjugate();
  }

  /*
  @Override
  public Zi inverse(final Zi z) {
    final Z d = z.re() * z.re() + z.im() * z.im();
    return new Zi(z.re() / d, -z.im() / d);
  }
  */

  /**
   * Return the absolute value (modulus) of this Gaussian integer.
   * @param z Gaussian integer
   * @return <code>|z|</code>
   */
  public Z abs(final Zi z) {
    return z.abs();
  }

  @Override
  public Zi pow(final Zi z, final long n) {
    return AbstractRing.pow(this, z, n);
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final Zi element) {
    return element != null && element.re() != null && element.im() != null;
  }

  // todo this iterator could be made fairer
  private static class ComplexIterator extends AbstractIterator<Zi> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private Z mRealPart = Z.NEG_ONE;

    @Override
    public Zi next() {
      mRealPart = mRealPart.add(1);
      return new Zi(mRealPart, Z.ZERO);
    }
  }

  @Override
  public Iterator<Zi> iterator() {
    return new ComplexIterator();
  }

  @Override
  public String toString() {
    return "\\Z[i]";
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public Zi coerce(final long n) {
    return new Zi(n);
  }

  /**
   * Return true iff this Gaussian integer is a Gaussian prime.
   * @return true for a Gaussian prime
   */
  public boolean isProbablePrime(final Zi n) {
    if (n.re().isZero()) {
      final Z t = n.im().abs();
      return t.mod(4) == 3 && t.isProbablePrime();
    }
    if (n.im().isZero()) {
      final Z t = n.re().abs();
      return t.mod(4) == 3 && t.isProbablePrime();
    }
    final Z t = abs(n);
    return /*t.mod(4) != 3 &&*/ t.isProbablePrime();
  }
}
