package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004256 a(n) = n^2*(n+1)*(n+2)^2/6.
 * @author Sean A. Irvine
 */
public class A004256 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(mN.add(1)).multiply(mN.add(2).square()).divide(6);
  }
}
