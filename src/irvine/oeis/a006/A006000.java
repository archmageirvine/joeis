package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006000 a(n) = (n+1)*(n^2+n+2)/2; g.f.: (1 + 2*x^2) / (1 - x)^4.
 * @author Sean A. Irvine
 */
public class A006000 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(2).multiply(mN).add(3).multiply(mN).add(2).divide2();
  }
}

