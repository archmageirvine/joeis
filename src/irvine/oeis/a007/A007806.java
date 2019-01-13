package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007806.
 * @author Sean A. Irvine
 */
public class A007806 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(new Q(mN, k).pow(k).multiply(Binomial.binomial(mN, k)));
    }
    return sum.toZ();
  }
}
