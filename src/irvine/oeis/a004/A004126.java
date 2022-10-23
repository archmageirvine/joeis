package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004126 a(n) = n*(7*n^2 - 1)/6.
 * @author Sean A. Irvine
 */
public class A004126 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.square().multiply(7).subtract(1)).divide(6);
  }
}
