package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * A058242 Numbers n such that x^n + x^7 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058242 extends A058059 {

  private int mN = 2;

  @Override
  public Z next() {
    if (mN == 2) {
      mN = 15;
      return Z.TWO;
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k < 7; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^7
      for (int k = 8; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

