package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018176 Powers of fifth root of 21 rounded up.
 * @author Sean A. Irvine
 */
public class A018176 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return mN.root(5).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

