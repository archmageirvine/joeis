package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056692 Number of divisors k of n with gcd(k-1, n) = 1.
 * @author Sean A. Irvine
 */
public class A056692 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Functions.GCD.l(d.longValue() - 1, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
