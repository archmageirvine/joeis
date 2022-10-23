package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018026 Powers of cube root of 17 rounded up.
 * @author Sean A. Irvine
 */
public class A018026 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(17);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

