package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018089 Powers of fourth root of 15 rounded up.
 * @author Sean A. Irvine
 */
public class A018089 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    return mN.root(4).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

