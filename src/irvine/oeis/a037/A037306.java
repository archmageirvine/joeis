package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037306 Triangle T(n,k) read by rows: the number of compositions of n into k parts, modulo cyclic shifts.
 * @author Sean A. Irvine
 */
public class A037306 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(LongUtils.gcd(mN, mM)).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(Binomial.binomial(mN / d.longValue(), mM / d.longValue())));
    }
    return sum.divide(mN);
  }
}

