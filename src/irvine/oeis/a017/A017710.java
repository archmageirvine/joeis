package irvine.oeis.a017;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A017710 Denominator of sum of -23rd powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017710 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Jaguar.factor(mN).sigma(23), mN.pow(23)).den();
  }
}

