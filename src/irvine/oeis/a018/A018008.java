package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018008.
 * @author Sean A. Irvine
 */
public class A018008 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

