package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009982 Powers of 38.
 * @author Sean A. Irvine
 */
public class A009982 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(38);
    return mA;
  }
}
