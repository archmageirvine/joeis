package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004255 n(n+1)(n^2 -3n + 6)/8.
 * @author Sean A. Irvine
 */
public class A004255 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.square().subtract(mN.multiply(3)).add(6)).divide(8);
  }
}
