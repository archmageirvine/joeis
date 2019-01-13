package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013800.
 * @author Sean A. Irvine
 */
public class A013800 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(14) : mA.multiply(38416);
    return mA;
  }
}
