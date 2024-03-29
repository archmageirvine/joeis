package irvine.oeis.a017;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A017707 Numerator of sum of -22nd powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017707 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Jaguar.factor(mN).sigma(22), mN.pow(22)).num();
  }
}

