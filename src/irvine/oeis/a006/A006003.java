package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006003 <code>a(n) = n*(n^2 + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A006003 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1).multiply(mN).divide2();
  }
}
