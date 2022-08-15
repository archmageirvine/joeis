package irvine.math.group;

import java.util.Iterator;

import irvine.math.z.Z;
import irvine.util.AbstractIterator;
import irvine.util.Pair;

/**
 * Integral domain of Gaussian integers.
 * @author Sean A. Irvine
 */
public final class GaussianIntegers extends AbstractIntegralDomain<Pair<Z, Z>> {

  /** Singleton. */
  public static final GaussianIntegers SINGLETON = new GaussianIntegers();
  private static final Pair<Z, Z> ZERO = new Pair<>(Z.ZERO, Z.ZERO);
  private static final Pair<Z, Z> ONE = new Pair<>(Z.ONE, Z.ZERO);
  private static final Pair<Z, Z> I = new Pair<>(Z.ZERO, Z.ONE);

  private GaussianIntegers() { }

  @Override
  public Pair<Z, Z> zero() {
    return ZERO;
  }

  @Override
  public Pair<Z, Z> one() {
    return ONE;
  }

  /**
   * The imaginary unit.
   * @return i
   */
  public Pair<Z, Z> i() {
    return I;
  }

  /**
   * Real part.
   * @param n number
   * @return real part
   */
  public Z re(final Pair<Z, Z> n) {
    return n.left();
  }

  /**
   * Imaginary part.
   * @param n number
   * @return imaginary part
   */
  public Z im(final Pair<Z, Z> n) {
    return n.right();
  }

  @Override
  public boolean isCyclic() {
    return false;
  }

  @Override
  public Pair<Z, Z> add(final Pair<Z, Z> a, final Pair<Z, Z> b) {
    return new Pair<>(a.left().add(b.left()), a.right().add(b.right()));
  }

  @Override
  public Pair<Z, Z> subtract(final Pair<Z, Z> a, final Pair<Z, Z> b) {
    return new Pair<>(a.left().subtract(b.left()), a.right().subtract(b.right()));
  }

  @Override
  public Pair<Z, Z> multiply(final Pair<Z, Z> u, final Pair<Z, Z> v) {
    final Z a = u.left();
    final Z b = u.right();
    final Z c = v.left();
    final Z d = v.right();
    return new Pair<>(a.multiply(c).subtract(b.multiply(d)), a.multiply(d).add(b.multiply(c)));
  }

  @Override
  public Pair<Z, Z> negate(final Pair<Z, Z> z) {
    return new Pair<>(z.left().negate(), z.right().negate());
  }

  @Override
  public Pair<Z, Z> conjugate(final Pair<Z, Z> z) {
    return new Pair<>(z.left(), z.right().negate());
  }

  /*
  @Override
  public Pair<Z, Z> inverse(final Pair<Z, Z> z) {
    final Z d = z.left() * z.left() + z.right() * z.right();
    return new Pair<Z, Z>(z.left() / d, -z.right() / d);
  }
  */

  /**
   * Return the absolute value (modulus) of this Gaussian integer.
   * @param z Gaussian integer
   * @return <code>|z|</code>
   */
  public Z abs(final Pair<Z, Z> z) {
    return z.left().square().add(z.right().square());
  }

  @Override
  public Pair<Z, Z> pow(final Pair<Z, Z> z, final long n) {
    return AbstractRing.pow(this, z, n);
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final Pair<Z, Z> element) {
    return element != null && element.left() != null && element.right() != null;
  }

  // todo this iterator could be made fairer
  private static class ComplexIterator extends AbstractIterator<Pair<Z, Z>> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private Z mRealPart = Z.NEG_ONE;

    @Override
    public Pair<Z, Z> next() {
      mRealPart = mRealPart.add(1);
      return new Pair<>(mRealPart, Z.ZERO);
    }
  }

  @Override
  public Iterator<Pair<Z, Z>> iterator() {
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
  public Pair<Z, Z> coerce(final long n) {
    return new Pair<>(Z.valueOf(n), Z.ZERO);
  }

  /**
   * Return true iff this Gaussian integer is a Gaussian prime.
   * @return true for a Gaussian prime
   */
  public boolean isProbablePrime(final Pair<Z, Z> n) {
    if (n.left().isZero()) {
      final Z t = n.right().abs();
      return t.mod(4) == 3 && t.isProbablePrime();
    }
    if (n.right().isZero()) {
      final Z t = n.left().abs();
      return t.mod(4) == 3 && t.isProbablePrime();
    }
    final Z t = abs(n);
    return /*t.mod(4) != 3 &&*/ t.isProbablePrime();
  }
}
