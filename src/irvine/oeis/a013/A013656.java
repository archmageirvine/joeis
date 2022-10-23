package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013656 a(n) = n*(9*n-2).
 * @author Sean A. Irvine
 */
public class A013656 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.multiply(9).subtract(2));
  }
}
