package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005559.
 * @author Sean A. Irvine
 */
public class A005559 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Binomial.binomial(mN + 1, mN / 2).multiply(Binomial.binomial(mN, (mN - 1) / 2))
      .subtract(Binomial.binomial(mN + 1, (mN - 1) / 2).multiply(Binomial.binomial(mN, (mN - 2) / 2)));
  }
}
