package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013751.
 * @author Sean A. Irvine
 */
public class A013751 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(144) : mA.multiply(1728);
    return mA;
  }
}
