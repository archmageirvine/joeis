package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009973 Powers of 29.
 * @author Sean A. Irvine
 */
public class A009973 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(29);
    return mA;
  }
}
