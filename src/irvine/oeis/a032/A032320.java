package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032320 Doubles (index 2+) under "EGJ" (unordered, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032320 extends A032318 {

  private Z mF = Z.ONE;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.TWO;
    }
    add(Z.ZERO);
    mF = mF.multiply(n);
    final Z res = egj(toList()).coeff(n).multiply(mF).toZ();
    remove(n);
    return res;
  }
}
