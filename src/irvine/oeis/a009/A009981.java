package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009981 Powers of 37.
 * @author Sean A. Irvine
 */
public class A009981 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(37);
    return mA;
  }
}
