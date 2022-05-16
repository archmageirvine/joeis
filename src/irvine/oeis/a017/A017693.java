package irvine.oeis.a017;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017693 Numerator of sum of -15th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017693 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Jaguar.factor(mN).sigma(15), mN.pow(15)).num();
  }
}

