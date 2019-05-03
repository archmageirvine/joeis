package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017712 Denominator of sum of <code>-24th</code> powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017712 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(24), mN.pow(24)).den();
  }
}

