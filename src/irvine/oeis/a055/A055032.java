package irvine.oeis.a055;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055032 Denominator of (Sum(m^(n-1),m=1..n-1)+1)/n.
 * @author Sean A. Irvine
 */
public class A055032 extends Sequence1 {

  protected long mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(mN - 1));
    }
    return select(new Q(sum, Z.valueOf(mN)));
  }
}
