package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018060 Powers of fourth root of 6 rounded down.
 * @author Sean A. Irvine
 */
public class A018060 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return mN.root(4);
  }
}

