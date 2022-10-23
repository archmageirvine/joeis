package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018140 Powers of the fifth root of 9 rounded up.
 * @author Sean A. Irvine
 */
public class A018140 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(9);
    return mN.root(5).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

