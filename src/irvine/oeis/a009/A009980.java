package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009980 Powers of 36.
 * @author Sean A. Irvine
 */
public class A009980 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(36);
    return mA;
  }
}
