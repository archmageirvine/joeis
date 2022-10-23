package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058059 Numbers n such that x^n + x + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058059 extends Sequence1 {

  // Only a few terms can be generated

  protected static final GaloisField GF3 = new GaloisField(3);
  protected static final PolynomialRingField<Z> GF3X = new PolynomialRingField<>(GF3);
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      coeffs.add(Z.ONE);
      for (int k = 2; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF3, GF3X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

