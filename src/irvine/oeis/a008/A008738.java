package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008738 a(n) = floor((n^2 + 1)/5).
 * @author Sean A. Irvine
 */
public class A008738 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1).divide(5);
  }
}


