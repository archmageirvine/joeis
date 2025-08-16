package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;

/**
 * A058238 Numbers k such that x^k + x^5 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058238 extends A058059 {

  private int mN = 4;

  @Override
  public Z next() {
    if (mN == 4) {
      mN = 5;
      return Z.FOUR;
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k < 5; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^5
      for (int k = 6; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF3, GF3X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

