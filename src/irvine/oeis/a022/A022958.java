package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022958 a(n) = 2 - n.
 * @author Sean A. Irvine
 */
public class A022958 extends Sequence0 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.subtract(1);
    return mN;
  }
}
