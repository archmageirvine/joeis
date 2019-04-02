package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009976 Powers of 32.
 * @author Sean A. Irvine
 */
public class A009976 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(32);
    return mA;
  }
}
