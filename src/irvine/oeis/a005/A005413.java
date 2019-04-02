package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005413 Number of non-vanishing Feynman diagrams of order 2n+1 for the electron-electron-photon proper vertex function in quantum electrodynamics (QED).
 * @author Sean A. Irvine
 */
public class A005413 extends A005412 {

  @Override
  public Z next() {
    final int n = size() - 1;
    super.next();
    if (n < 2) {
      return Z.ONE;
    }
    return get(n).add(get(n - 1).multiply(2L * n)).multiply(n - 1);
  }
}
