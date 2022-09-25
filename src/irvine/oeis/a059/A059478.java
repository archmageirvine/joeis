package irvine.oeis.a059;

import java.util.Iterator;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059478 Arrange irreducible polynomials over GF(2) in lexicographic order and write down the order of each polynomial.
 * @author Sean A. Irvine
 */
public class A059478 implements Sequence {

  private static final PolynomialRingField<Z> FLD = new PolynomialRingField<>(new GaloisField(2));
  private final Iterator<Polynomial<Z>> mPolys = IrreduciblePolynomials.iterator();

  @Override
  public Z next() {
    final Polynomial<Z> poly = mPolys.next();
    int k = poly.degree();
    if (k <= 1) {
      return Z.ONE;
    }
    while (true) {
      if (FLD.one().equals(IrreduciblePolynomials.powMod(FLD, FLD.x(), Z.valueOf(k), poly))) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
