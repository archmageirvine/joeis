package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005559 Number of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A005559 extends Sequence1 {

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
