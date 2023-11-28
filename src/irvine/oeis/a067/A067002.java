package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067001.
 * @author Sean A. Irvine
 */
public class A067002 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Rationals.SINGLETON.sum(0, ++mN,
      k -> new Q(Binomial.binomial(2L * mN - 2L * k, mN - k).multiply(Binomial.binomial(mN + k, mN)), Z.ONE.shiftLeft(2L * mN - k)))
      .num();
  }
}

