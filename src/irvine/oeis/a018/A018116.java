package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018116 Powers of fourth root of 24 rounded up.
 * @author Sean A. Irvine
 */
public class A018116 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(24);
    return mN.root(4).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

