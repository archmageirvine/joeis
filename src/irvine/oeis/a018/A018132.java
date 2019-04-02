package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018132 Powers of fifth root of 7 rounded down.
 * @author Sean A. Irvine
 */
public class A018132 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(7);
    return mN.root(5);
  }
}

