package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009966 Powers of 22.
 * @author Sean A. Irvine
 */
public class A009966 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(22);
    return mA;
  }
}
