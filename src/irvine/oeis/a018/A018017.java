package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018017 Powers of cube root of 14 rounded up.
 * @author Sean A. Irvine
 */
public class A018017 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(14);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

