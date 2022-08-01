package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * A058237 Numbers n such that x^n + x^4 + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058237 extends A058059 {

  private int mN = 1;

  @Override
  public Z next() {
    if (mN <= 3) {
      return Z.valueOf(mN++);
    }
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      coeffs.add(Z.ZERO);
      coeffs.add(Z.ZERO);
      coeffs.add(Z.ZERO);
      coeffs.add(Z.ONE); // x^4
      for (int k = 5; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

