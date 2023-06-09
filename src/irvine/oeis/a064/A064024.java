package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064024 a(n) = value of k such that absolute difference of 2^n and 3^k is minimized.
 * @author Sean A. Irvine
 */
public class A064024 extends Sequence0 {

  private Z mN = null;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    Z t = mT;
    while (t.compareTo(mN) <= 0) {
      mT = t;
      t = t.multiply(3);
    }
    final Z a = mN.subtract(mT);
    final Z b = t.subtract(mN);
    return a.min(b);
  }
}
