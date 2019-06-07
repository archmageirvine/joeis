package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017667 Numerator of sum of -2nd powers of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A017667 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(2), mN.square()).num();
  }
}

