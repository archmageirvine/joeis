package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013728.
 * @author Sean A. Irvine
 */
public class A013728 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(529);
    return mA;
  }
}
