package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086338 Numbers n such that the trinomial x^n + x + 1 is irreducible over GF(11).
 * @author Sean A. Irvine
 */
public class A086338 extends Sequence1 {

  private static final GaloisField GF11 = new GaloisField(11);
  private static final PolynomialRingField<Z> GF11X = new PolynomialRingField<>(GF11);
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN <= 1) {
        return Z.valueOf(mN);
      }
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.ONE);
      coeffs.add(Z.ONE);
      for (int k = 2; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF11, GF11X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

