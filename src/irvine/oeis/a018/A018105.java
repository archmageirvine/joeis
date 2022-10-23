package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018105 Powers of fourth root of 21 rounded down.
 * @author Sean A. Irvine
 */
public class A018105 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return mN.root(4);
  }
}

