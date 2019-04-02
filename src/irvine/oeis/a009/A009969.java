package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009969 Powers of 25.
 * @author Sean A. Irvine
 */
public class A009969 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(25);
    return mA;
  }
}
