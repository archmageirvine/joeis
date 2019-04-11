package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007518 <code>a(n) = floor(n*(n+2)*(2*n-1)/8)</code>.
 * @author Sean A. Irvine
 */
public class A007518 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(2)).multiply(mN.multiply2().subtract(1)).shiftRight(3);
  }
}
