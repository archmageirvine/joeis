package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006007 4-dimensional analog of centered polygonal numbers: a(n) = n(n+1)*(n^2+n+4)/12.
 * @author Sean A. Irvine
 */
public class A006007 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(2).multiply(mN).add(5).multiply(mN).add(4).multiply(mN).divide(12);
  }
}

