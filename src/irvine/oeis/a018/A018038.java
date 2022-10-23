package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018038 Powers of cube root of 21 rounded up.
 * @author Sean A. Irvine
 */
public class A018038 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

