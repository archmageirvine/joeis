package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013802.
 * @author Sean A. Irvine
 */
public class A013802 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : mA.multiply(50625);
    return mA;
  }
}
