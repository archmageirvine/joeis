package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086339 Irreducible trinomials of prime degree for some k: x^p + x^k + 1 is irreducible over GF(5) for at least one k, p&gt;k&gt;0.
 * @author Sean A. Irvine
 */
public class A086339 extends A000040 {

  private static final GaloisField GF5 = new GaloisField(5);
  private static final PolynomialRingField<Z> GF5X = new PolynomialRingField<>(GF5);

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int pp = p.intValueExact();
      for (int j = 1; j <= (pp + 1) / 2; ++j) {
        final List<Z> coeffs = new ArrayList<>();
        coeffs.add(Z.ONE);
        for (int k = 1; k < pp; ++k) {
          coeffs.add(j == k ? Z.ONE : Z.ZERO);
        }
        coeffs.add(Z.ONE);
        if (IrreduciblePolynomials.isIrreducible(GF5, GF5X.create(coeffs))) {
          return p;
        }
      }
    }
  }
}

