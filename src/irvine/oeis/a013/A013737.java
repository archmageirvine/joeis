package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013737.
 * @author Sean A. Irvine
 */
public class A013737 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(25) : mA.multiply(125);
    return mA;
  }
}
