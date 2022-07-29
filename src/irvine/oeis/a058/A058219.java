package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * A058219 Numbers n such that x^n + x^13 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058219 extends A058059 {

  private int mN = 4;

  @Override
  public Z next() {
    if (mN == 4) {
      mN = 6;
      return Z.FOUR;
    } else if (mN == 6) {
      mN = 12;
      return Z.SIX;
    } else if (mN == 12) {
      mN = 13;
      return Z.valueOf(12);
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k <= 12; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^13
      for (int k = 14; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

