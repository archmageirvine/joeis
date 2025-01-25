package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074701 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final long phi = Functions.PHI.l(n);
    long sum = 0;
    for (final Z dd : Jaguar.factor(phi).divisors()) {
      final long d = dd.longValue();
      final long mu = Functions.MOBIUS.i(Functions.PHI.l(d));
      sum += mu * phi / d;
    }
    return sum == n;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
