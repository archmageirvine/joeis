package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017671 Numerator of sum of -4th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017671 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(4), mN.pow(4)).num();
  }
}

