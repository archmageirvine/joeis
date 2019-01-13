package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013747.
 * @author Sean A. Irvine
 */
public class A013747 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(100) : mA.multiply(1000);
    return mA;
  }
}
