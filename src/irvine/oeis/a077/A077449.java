package irvine.oeis.a077;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077449 Numbers k such that Sum_{d|k} mu(phi(d)) = 0.
 * @author Sean A. Irvine
 */
public class A077449 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        sum = sum.add(Functions.MOBIUS.l(Functions.PHI.l(d)));
      }
      if (sum.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
