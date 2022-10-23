package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008767 a(n) = floor(n/7)*ceiling(n/7).
 * @author Sean A. Irvine
 */
public class A008767 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(7).multiply(mN.add(6).divide(7));
  }
}


