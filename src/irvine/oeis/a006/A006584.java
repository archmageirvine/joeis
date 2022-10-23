package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006584 If n mod 2 = 0 then n*(n^2-4)/12 else n*(n^2-1)/12.
 * @author Sean A. Irvine
 */
public class A006584 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.square().subtract(mN.isEven() ? 4 : 1)).divide(12);
  }
}
