package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017665 Numerator of sum of reciprocals of divisors of n.
 * @author Sean A. Irvine
 */
public class A017665 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z sigma = Cheetah.factor(mN).sigma();
    return sigma.divide(sigma.gcd(mN));
  }
}

