package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013857.
 * @author Sean A. Irvine
 */
public class A013857 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(10000) : mA.multiply(100000);
    return mA;
  }
}
