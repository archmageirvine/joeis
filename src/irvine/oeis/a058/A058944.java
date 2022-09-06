package irvine.oeis.a058;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058944 Coefficients of monic irreducible polynomials over GF(3) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058944 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final GaloisField mFld;
  private final int mMod;
  private long mN = 1;

  protected A058944(final GaloisField fld) {
    mFld = fld;
    mMod = fld.size().intValueExact();
  }

  /** Construct the sequence. */
  public A058944() {
    this(new GaloisField(3));
  }

  private Polynomial<Z> toPoly(long n) {
    final Polynomial<Z> res = RING.empty();
    while (n != 0) {
      res.add(Z.valueOf(n % mMod));
      n /= mMod;
    }
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> poly = toPoly(++mN);
      if (Z.ONE.equals(poly.coeff(poly.degree())) && IrreduciblePolynomials.isIrreducible(mFld, poly)) {
        return new Z(Long.toString(mN, mMod));
      }
    }
  }
}
