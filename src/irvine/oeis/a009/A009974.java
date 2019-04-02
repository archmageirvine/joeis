package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009974 Powers of 30.
 * @author Sean A. Irvine
 */
public class A009974 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(30);
    return mA;
  }
}
