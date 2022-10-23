package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008724 a(n) = floor(n^2/12).
 * @author Sean A. Irvine
 */
public class A008724 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide(12);
  }
}


