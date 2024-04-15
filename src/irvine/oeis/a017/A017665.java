package irvine.oeis.a017;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A017665 Numerator of sum of reciprocals of divisors of n.
 * @author Sean A. Irvine
 */
public class A017665 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z sigma = Functions.SIGMA.z(mN);
    return sigma.divide(sigma.gcd(mN));
  }
}

