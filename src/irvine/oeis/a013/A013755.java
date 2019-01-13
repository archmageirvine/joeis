package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013755.
 * @author Sean A. Irvine
 */
public class A013755 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(196) : mA.multiply(2744);
    return mA;
  }
}
