package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018162 Powers of fifth root of 17 rounded down.
 * @author Sean A. Irvine
 */
public class A018162 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(17);
    return mN.root(5);
  }
}

