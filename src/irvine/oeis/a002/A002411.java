package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002411 Pentagonal pyramidal numbers: a(n) = n^2*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A002411 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(mN.add(1)).divide2();
  }
}
