package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000447 a(n) = 1^2 + 3^2 + 5^2 + 7^2 + ... + (2*n-1)^2 = n*(4*n^2 - 1)/3.
 * @author Sean A. Irvine
 */
public class A000447 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().shiftLeft(2).subtract(1).multiply(mN).divide(3);
  }
}
