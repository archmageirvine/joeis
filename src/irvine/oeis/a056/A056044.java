package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a055.A055772;

/**
 * A056044 Let k be the largest number such that k^2 divides n! and let m be the largest number such that m!^2 divides n!; a(n) = k/m!.
 * @author Sean A. Irvine
 */
public class A056044 extends A055772 {

  @Override
  public Z next() {
    final Z k = super.next();
    Z f = Z.ONE;
    Z of = Z.ONE;
    long m = 1;
    while (k.mod(f).isZero()) {
      of = f;
      f = f.multiply(++m);
    }
    return k.divide(of);
  }
}
