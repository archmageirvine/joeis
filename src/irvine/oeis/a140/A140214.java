package irvine.oeis.a140;
// manually prodsim/prodsid at 2021-11-28 10:55

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A140214 a(n) = Product_{h == 5 (mod 6) and h|n} h.
 * @author Georg Fischer
 */
public class A140214 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (d % 6 == 5) {
        prod = prod.multiply(Z.valueOf(d));
      }
    }
    return prod;
  }
}
