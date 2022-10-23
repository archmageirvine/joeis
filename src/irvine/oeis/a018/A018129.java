package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018129 Powers of fifth root of 6 rounded down.
 * @author Sean A. Irvine
 */
public class A018129 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return mN.root(5);
  }
}

