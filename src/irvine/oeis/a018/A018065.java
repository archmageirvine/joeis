package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018065.
 * @author Sean A. Irvine
 */
public class A018065 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(7);
    return mN.root(4).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

