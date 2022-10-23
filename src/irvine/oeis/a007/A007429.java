package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007429 Inverse Moebius transform applied twice to natural numbers.
 * @author Sean A. Irvine
 */
public class A007429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Jaguar.factor(d).sigma());
    }
    return sum;
  }
}
