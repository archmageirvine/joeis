package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013868.
 * @author Sean A. Irvine
 */
public class A013868 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2197) : mA.multiply(371293);
    return mA;
  }
}
