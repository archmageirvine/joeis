package irvine.oeis.a005;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005419.
 * @author Sean A. Irvine
 */
public class A005419 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = new Q(Binomial.binomial(6 * mN, mN), Z.valueOf(5 * mN + 1).multiply(5 * mN + 2));
    if ((mN & 1) == 1) {
      sum = sum.add(new Q(Binomial.binomial(3 * mN, (mN - 1) / 2), Z.valueOf(mN)));
    } else {
      sum = sum.add(new Q(Binomial.binomial(3 * mN, mN / 2).multiply(3), Z.valueOf(5 * mN + 2)));
    }
    final long g = LongUtils.gcd(7, mN - 1);
    for (long k = 3; k <= g; ++k) {
      if (g % k == 0) {
        sum = sum.add(new Q(Binomial.binomial((6 * mN + 1) / k, (mN - 1) / k).multiply(LongUtils.phi(k)), Z.valueOf(6 * mN + 1)));
      }
    }
    return sum.toZ().divide2();
  }
}
