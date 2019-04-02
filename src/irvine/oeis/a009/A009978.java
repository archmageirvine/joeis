package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009978 Powers of 34.
 * @author Sean A. Irvine
 */
public class A009978 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(34);
    return mA;
  }
}
