package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009986 Powers of 42.
 * @author Sean A. Irvine
 */
public class A009986 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(42);
    return mA;
  }
}
