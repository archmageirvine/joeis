package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004467 a(n) = n*(11*n^2 - 5)/6.
 * @author Sean A. Irvine
 */
public class A004467 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.square().multiply(11).subtract(5)).divide(6);
  }
}

