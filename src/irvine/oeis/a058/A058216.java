package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.z.Z;

/**
 * A058216 Numbers n such that x^n + x^12 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058216 extends A058059 {

  private int mN = 2;

  @Override
  public Z next() {
    if (mN == 2) {
      mN = 10;
      return Z.TWO;
    } else if (mN == 10) {
      mN = 12;
      return Z.TEN;
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k <= 11; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^12
      for (int k = 13; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (IrreduciblePolynomials.isIrreducible(GF3, GF3X.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

