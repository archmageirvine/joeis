package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058857 Numbers n such that the trinomial x^n + x + 1 is irreducible over GF(7).
 * @author Sean A. Irvine
 */
public class A058857 implements Sequence {

  private static final GaloisField GF7 = new GaloisField(7);
  private static final PolynomialRingField<Z> GF7X = new PolynomialRingField<>(new GaloisField(5));
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
      if (IrreduciblePolynomials.isIrreducible(GF7, GF7X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

