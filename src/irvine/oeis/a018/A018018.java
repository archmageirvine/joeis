package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018018 Powers of cube root of 15 rounded down.
 * @author Sean A. Irvine
 */
public class A018018 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    return mN.root(3);
  }
}

