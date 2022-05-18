package irvine.oeis.a140;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A140213 Product_{h|n and h mod 6 = 1} h; product of divisors of n of the form 6*k + 1.
 * @author Georg Fischer
 */
public class A140213 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (d % 6 == 1) {
        prod = prod.multiply(Z.valueOf(d));
      }
    }
    return prod;
  }
}
