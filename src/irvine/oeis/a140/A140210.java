package irvine.oeis.a140;
// manually prodsim/prodsid at 2021-11-28 10:55

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A140210 a(n) = Product_{h == 1 (mod 4) and h|n} h.
 * @author Georg Fischer
 */
public class A140210 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (d % 4 == 1) {
        prod = prod.multiply(Z.valueOf(d));
      }
    }
    return prod;
  }
}
