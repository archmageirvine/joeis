package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018120 Powers of fifth root of 3 rounded down.
 * @author Sean A. Irvine
 */
public class A018120 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return mN.root(5);
  }
}

