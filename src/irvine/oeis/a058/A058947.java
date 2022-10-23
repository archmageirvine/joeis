package irvine.oeis.a058;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058947 Coefficients of primitive irreducible polynomials over GF(2) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058947 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final GaloisField mFld;
  private final int mMod;
  private long mN = 1;

  protected A058947(final GaloisField fld) {
    mFld = fld;
    mMod = fld.size().intValueExact();
  }

  /** Construct the sequence. */
  public A058947() {
    this(new GaloisField(2));
  }

  private Polynomial<Z> toPoly(long n) {
    final Polynomial<Z> res = RING.empty();
    while (n != 0) {
      res.add(Z.valueOf(n % mMod));
      n /= mMod;
    }
    return res;
  }

  private boolean isPrimitive(final Polynomial<Z> poly) {
    if (!IrreduciblePolynomials.isIrreducible(mFld, poly)) {
      return false;
    }
    if (poly.coeff(0).isZero()) {
      return false;
    }
    final int m = poly.degree();
    final int n = mFld.characteristic().pow(m).subtract(1).intValueExact();
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(mFld);
//    final Polynomial<Z> g = ring.mod(ring.subtract(IrreduciblePolynomials.powMod(ring, ring.x(), Z.valueOf(n), poly), ring.one()), poly);
//    if (!ring.zero().equals(g)) {
//      return false;
//    }
    for (int k = poly.degree(); k < n; ++k) {
      if (ring.mod(ring.subtract(IrreduciblePolynomials.powMod(ring, ring.x(), Z.valueOf(k), poly), ring.one()), poly).equals(ring.zero())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> poly = toPoly(++mN);
      if (Z.ONE.equals(poly.coeff(poly.degree())) && isPrimitive(poly)) {
        return new Z(Long.toString(mN, mMod));
      }
    }
  }
}
