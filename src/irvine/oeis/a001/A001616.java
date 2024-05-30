package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001616 Number of parabolic vertices of Gamma_0(n).
 * @author Sean A. Irvine
 */
public class A001616 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum += Functions.PHI.l(Functions.GCD.l(d, mN / d));
    }
    return Z.valueOf(sum);
  }
}
