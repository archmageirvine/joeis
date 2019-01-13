package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014131.
 * @author Sean A. Irvine
 */
public class A014131 implements Sequence {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.multiply2().add(6 * (++mN & 1));
    return mA;
  }
}
