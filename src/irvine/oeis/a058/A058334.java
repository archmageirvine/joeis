package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058334 Numbers n such that the trinomial x^n + x + 1 is irreducible over GF(5).
 * @author Sean A. Irvine
 */
public class A058334 implements Sequence {

  private static final GaloisField GF5 = new GaloisField(5);
  private static final PolynomialRingField<Z> GF5X = new PolynomialRingField<>(GF5);
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN <= 3) {
        return Z.valueOf(mN);
      }
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.ONE);
      coeffs.add(Z.ONE);
      for (int k = 2; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF5, GF5X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

