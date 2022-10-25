package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005412 Number of non-vanishing Feynman diagrams of order 2n for the vacuum polarization (the proper two-point function of the photon) and for the self-energy (the proper two-point function of the electron) in quantum electrodynamics (QED).
 * @author Sean A. Irvine
 */
public class A005412 extends MemorySequence {

  // After Michael Somos

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int j = 1; j < n; ++j) {
      s = s.add(a(j).multiply(a(n - j)));
    }
    return s.add(a(n - 1).multiply(2 * n - 2));
  }
}
