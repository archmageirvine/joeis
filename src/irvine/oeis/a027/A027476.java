package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A027476 Third column of A027467.
 * @author Sean A. Irvine
 */
public class A027476 extends Sequence3 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mT = mT.multiply(15);
    }
    return mT.multiply(Binomial.binomial(mN + 1, 2));
  }
}
