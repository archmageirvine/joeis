package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018135 Powers of fifth root of 8 rounded down.
 * @author Sean A. Irvine
 */
public class A018135 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(8);
    return mN.root(5);
  }
}

