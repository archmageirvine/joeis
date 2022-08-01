package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * A058240 Numbers n such that x^n + x^6 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058240 extends A058059 {

  private int mN = 1;

  @Override
  public Z next() {
    if (mN == 1) {
      mN = 5;
      return Z.ONE;
    } else if (mN == 5) {
      mN = 6;
      return Z.FIVE;
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k < 6; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^6
      for (int k = 7; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

