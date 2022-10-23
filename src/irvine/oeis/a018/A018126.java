package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018126 Powers of fifth root of 5 rounded down.
 * @author Sean A. Irvine
 */
public class A018126 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    return mN.root(5);
  }
}

