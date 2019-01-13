package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005560.
 * @author Sean A. Irvine
 */
public class A005560 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Binomial.binomial(mN + 3, (mN + 1) / 2).multiply(Binomial.binomial(mN + 2, mN / 2))
      .subtract(Binomial.binomial(mN + 3, mN / 2).multiply(Binomial.binomial(mN + 2, (mN - 1) / 2)));
  }
}

