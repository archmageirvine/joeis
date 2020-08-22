package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008857 a(n) = floor(n/9)*ceiling(n/9).
 * @author Sean A. Irvine
 */
public class A008857 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(9).multiply(mN.add(8).divide(9));
  }
}
