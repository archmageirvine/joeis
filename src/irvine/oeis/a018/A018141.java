package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018141 Powers of fifth root of 10 rounded down.
 * @author Sean A. Irvine
 */
public class A018141 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return mN.root(5);
  }
}

