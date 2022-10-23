package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018119 Powers of fifth root of 2 rounded up.
 * @author Sean A. Irvine
 */
public class A018119 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return mN.root(5).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

