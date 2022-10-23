package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008454 Tenth powers: a(n) = n^10.
 * @author Sean A. Irvine
 */
public class A008454 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(10);
  }
}
