package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018122 Powers of fifth root of 3 rounded up.
 * @author Sean A. Irvine
 */
public class A018122 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return mN.root(5).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

