package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013811.
 * @author Sean A. Irvine
 */
public class A013811 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(6859) : mA.multiply(130321);
    return mA;
  }
}
