package irvine.oeis.a017;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A017666 Denominator of sum of reciprocals of divisors of n.
 * @author Sean A. Irvine
 */
public class A017666 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Functions.SIGMA.z(mN), mN).den();
  }
}

