package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017686 Denominator of sum of -11th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017686 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(11), mN.pow(11)).den();
  }
}

