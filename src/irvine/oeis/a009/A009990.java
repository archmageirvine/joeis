package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009990 Powers of 46.
 * @author Sean A. Irvine
 */
public class A009990 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(46);
    return mA;
  }
}
