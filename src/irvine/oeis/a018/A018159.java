package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018159 Powers of fifth root of 16 rounded down.
 * @author Sean A. Irvine
 */
public class A018159 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(16);
    return mN.root(5);
  }
}

