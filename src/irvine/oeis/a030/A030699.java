package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008289;

/**
 * A030699 Maximal value of Q(n,m) (number of partitions of n into m distinct summands) for given n.
 * @author Sean A. Irvine
 */
public class A030699 extends A008289 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ZERO;
    for (int k = 1; k <= (Functions.SQRT.l(8 * mN + 1) - 1) / 2; ++k) {
      m = m.max(get(mN, k));
    }
    return m;
  }
}
