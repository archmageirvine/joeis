package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013838.
 * @author Sean A. Irvine
 */
public class A013838 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(7776);
    return mA;
  }
}
