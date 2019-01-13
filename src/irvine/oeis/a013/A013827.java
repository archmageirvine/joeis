package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013827.
 * @author Sean A. Irvine
 */
public class A013827 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(243);
    return mA;
  }
}
