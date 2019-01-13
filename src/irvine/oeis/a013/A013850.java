package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013850.
 * @author Sean A. Irvine
 */
public class A013850 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(59049);
    return mA;
  }
}
