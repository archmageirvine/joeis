package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009991 Powers of 47.
 * @author Sean A. Irvine
 */
public class A009991 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(47);
    return mA;
  }
}
