package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018147 Powers of fifth root of 12 rounded down.
 * @author Sean A. Irvine
 */
public class A018147 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(12);
    return mN.root(5);
  }
}

