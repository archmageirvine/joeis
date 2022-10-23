package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004466 a(n) = n*(5*n^2 - 2)/3.
 * @author Sean A. Irvine
 */
public class A004466 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.square().multiply(5).subtract(2)).divide(3);
  }
}

