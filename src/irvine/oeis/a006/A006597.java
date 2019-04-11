package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006597 <code>a(n) = n^2*(5*n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A006597 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(mN.multiply(5).subtract(3)).divide2();
  }
}
