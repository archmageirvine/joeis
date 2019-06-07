package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017710 Denominator of sum of -23rd powers of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A017710 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(23), mN.pow(23)).den();
  }
}

