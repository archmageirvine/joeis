package irvine.oeis.a017;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017696 Denominator of sum of -16th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017696 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Jaguar.factor(mN).sigma(16), mN.pow(16)).den();
  }
}

