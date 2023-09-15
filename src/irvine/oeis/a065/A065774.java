package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065774 Product of digits of n is equal to the sum of the prime factors of n, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A065774 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long prod = ZUtils.digitProduct(++mN);
      if (prod > 1 && Jaguar.factor(mN).sopfr().equals(Z.valueOf(prod))) {
        return Z.valueOf(mN);
      }
    }
  }
}
