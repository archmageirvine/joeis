package irvine.oeis.a017;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017668 Denominator of sum of -2nd powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017668 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Jaguar.factor(mN).sigma(2), mN.square()).den();
  }
}

