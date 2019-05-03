package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017692 Denominator of sum of <code>-14th</code> powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017692 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(14), mN.pow(14)).den();
  }
}

