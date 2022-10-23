package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018111 Powers of fourth root of 23 rounded down.
 * @author Sean A. Irvine
 */
public class A018111 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(23);
    return mN.root(4);
  }
}

