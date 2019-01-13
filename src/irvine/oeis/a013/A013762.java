package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013762.
 * @author Sean A. Irvine
 */
public class A013762 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(18) : mA.multiply(5832);
    return mA;
  }
}
