package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018171 Powers of fifth root of 20 rounded down.
 * @author Sean A. Irvine
 */
public class A018171 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(20);
    return mN.root(5);
  }
}

