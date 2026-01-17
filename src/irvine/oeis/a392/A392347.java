package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392347 Numbers k such that A000005(k) = A000005(k/d + d) for some d.
 * @author Sean A. Irvine
 */
public class A392347 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Functions.SIGMA0.z(++mN);
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        if (Functions.SIGMA0.z(mN / d + d).equals(s0)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
