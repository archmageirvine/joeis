package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;

/**
 * A058243 Numbers n such that x^n + x^8 + 1 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058243 extends A058059 {

  private int mN = 2;

  @Override
  public Z next() {
    if (mN <= 6) {
      return Z.valueOf(mN++);
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k < 8; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^8
      for (int k = 9; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF3, GF3X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

