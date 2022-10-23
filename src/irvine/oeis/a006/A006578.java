package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006578 Triangular numbers plus quarter squares: n*(n+1)/2 + floor(n^2/4) (i.e., A000217(n) + A002620(n)).
 * @author Sean A. Irvine
 */
public class A006578 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).divide2().add(mN.square().divide(4));
  }
}
