package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018027 Powers of cube root of 18 rounded down.
 * @author Sean A. Irvine
 */
public class A018027 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(18);
    return mN.root(3);
  }
}

