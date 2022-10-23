package irvine.oeis.a059;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059006 Numbers k such that x^k + x^2 + 1 is irreducible over GF(7).
 * @author Sean A. Irvine
 */
public class A059006 extends Sequence1 {

  private static final GaloisField GF7 = new GaloisField(7);
  private static final PolynomialRingField<Z> GF7X = new PolynomialRingField<>(GF7);
  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.ONE);
      coeffs.add(Z.ZERO);
      coeffs.add(Z.ONE);
      for (int k = 3; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF7, GF7X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

