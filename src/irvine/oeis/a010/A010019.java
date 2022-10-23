package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010019 a(0) = 1, a(n) = 29*n^2 + 2 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A010019 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(29).add(2);
  }
}
