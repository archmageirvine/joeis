package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005419 Number of nonequivalent dissections of a polygon into n heptagons by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A005419 extends Sequence1 {

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
    final long g = Functions.GCD.l(7, mN - 1);
    for (long k = 3; k <= g; ++k) {
      if (g % k == 0) {
        sum = sum.add(new Q(Binomial.binomial((6 * mN + 1) / k, (mN - 1) / k).multiply(Functions.PHI.l(k)), Z.valueOf(6 * mN + 1)));
      }
    }
    return sum.toZ().divide2();
  }
}
