package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018131.
 * @author Sean A. Irvine
 */
public class A018131 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return mN.root(5).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

