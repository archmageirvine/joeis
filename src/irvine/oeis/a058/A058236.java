package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * A058236 Numbers n such that x^n + x^3 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058236 extends A058059 {

  private int mN = 2;

  @Override
  public Z next() {
    if (mN == 2) {
      mN = 3;
      return Z.TWO;
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      coeffs.add(Z.ZERO);
      coeffs.add(Z.ZERO);
      coeffs.add(Z.ONE); // x^3
      for (int k = 4; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

