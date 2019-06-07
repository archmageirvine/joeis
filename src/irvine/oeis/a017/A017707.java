package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017707 Numerator of sum of -22nd powers of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A017707 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(22), mN.pow(22)).num();
  }
}

