package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076753 a(n) = nearest integer to the standard deviation of the divisors of n.
 * @author Sean A. Irvine
 */
public class A076753 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Z s0 = Functions.SIGMA0.z(mN);
    return CR.valueOf(new Q(Functions.SIGMA.z(2, mN), s0).subtract(new Q(Functions.SIGMA1.z(mN), s0).square()).multiply(new Q(s0, s0.subtract(1)))).sqrt().round();
  }
}
