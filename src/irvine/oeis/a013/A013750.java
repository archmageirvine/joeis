package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013750.
 * @author Sean A. Irvine
 */
public class A013750 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12) : mA.multiply(1728);
    return mA;
  }
}
