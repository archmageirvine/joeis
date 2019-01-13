package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013844.
 * @author Sean A. Irvine
 */
public class A013844 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(343) : mA.multiply(16807);
    return mA;
  }
}
