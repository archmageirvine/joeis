package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018183 Powers of fifth root of 24 rounded down.
 * @author Sean A. Irvine
 */
public class A018183 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(24);
    return mN.root(5);
  }
}

