package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018168 Powers of fifth root of 19 rounded down.
 * @author Sean A. Irvine
 */
public class A018168 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(19);
    return mN.root(5);
  }
}

