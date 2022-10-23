package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018093 Powers of fourth root of 17 rounded down.
 * @author Sean A. Irvine
 */
public class A018093 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(17);
    return mN.root(4);
  }
}

