package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061391 a(n) = t(n,3) = Sum_{d|n} tau(d^3), where tau(n) = number of divisors of n, cf. A000005.
 * @author Sean A. Irvine
 */
public class A061391 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Jaguar.factor(Z.valueOf(d).pow(3)).sigma0());
  }
}

