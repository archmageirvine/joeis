package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032319 Shifts left 2 places under "EGJ" (unordered, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032319 extends A032318 {

  private Z mF = Z.ONE;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    }
    mF = mF.multiply(n - 2);
    return egj(this).coeff(n - 2).multiply(mF).toZ();
  }
}
