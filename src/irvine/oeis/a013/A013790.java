package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013790.
 * @author Sean A. Irvine
 */
public class A013790 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(6561);
    return mA;
  }
}
