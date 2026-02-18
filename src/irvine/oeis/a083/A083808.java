package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083808 Smallest prime == 1 (mod n-th unary number U(n) = (10^n-1)/9).
 * @author Sean A. Irvine
 */
public class A083808 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z u = Z.TEN.pow(++mN).subtract(1).divide(9);
    Z j = u.add(1);
    while (!j.isProbablePrime()) {
      j = j.add(u);
    }
    return j;
  }
}
