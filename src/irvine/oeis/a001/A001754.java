package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001754 Lah numbers: a(n) = n!*binomial(n-1,2)/6.
 * @author Sean A. Irvine
 */
public class A001754 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 2).multiply(mN - 1).divide(12);
  }
}
