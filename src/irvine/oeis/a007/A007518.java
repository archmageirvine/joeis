package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007518 a(n) = floor(n*(n+2)*(2*n-1)/8).
 * @author Sean A. Irvine
 */
public class A007518 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(2)).multiply(mN.multiply2().subtract(1)).shiftRight(3);
  }
}
