package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * A058217 Numbers n such that x^n + x^11 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058217 extends A058059 {

  private int mN = 2;

  @Override
  public Z next() {
    if (mN == 2) {
      mN = 8;
      return Z.TWO;
    } else if (mN == 8) {
      mN = 17;
      return Z.EIGHT;
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      for (int k = 1; k <= 10; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE); // x^11
      for (int k = 12; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

