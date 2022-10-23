package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007425 d_3(n), or tau_3(n), the number of ordered factorizations of n as n = r s t.
 * @author Sean A. Irvine
 */
public class A007425 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Jaguar.factor(d).sigma0());
    }
    return sum;
  }
}
