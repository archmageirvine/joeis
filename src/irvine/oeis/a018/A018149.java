package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018149 Powers of fifth root of 12 rounded up.
 * @author Sean A. Irvine
 */
public class A018149 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(12);
    return mN.root(5).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

