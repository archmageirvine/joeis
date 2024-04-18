package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.group.IntegersModMul;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066589 Let u_n be the group of units mod n (invertible elements in the ring Z_n); a(n) is the number of cyclic subgroups in u_n.
 * @author Sean A. Irvine
 */
public class A066589 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final IntegersModMul ring = new IntegersModMul(++mN);
    Q sum = Q.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add(new Q(Z.ONE, Functions.PHI.z(ring.order(Z.valueOf(k)))));
      }
    }
    return sum.toZ();
  }
}
