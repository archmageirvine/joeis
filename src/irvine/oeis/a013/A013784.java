package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013784.
 * @author Sean A. Irvine
 */
public class A013784 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(1296);
    return mA;
  }
}
