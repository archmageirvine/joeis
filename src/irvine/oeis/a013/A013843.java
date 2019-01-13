package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013843.
 * @author Sean A. Irvine
 */
public class A013843 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(49) : mA.multiply(16807);
    return mA;
  }
}
