package irvine.oeis.a140;
// manually prodsim/prodsid at 2021-11-28 10:55

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A140211 a(n) = Product_{d == 3 (mod 4) and d|n} d.
 * @author Georg Fischer
 */
public class A140211 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (d % 4 == 3) {
        prod = prod.multiply(Z.valueOf(d));
      }
    }
    return prod;
  }
}
