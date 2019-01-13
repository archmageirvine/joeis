package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013864.
 * @author Sean A. Irvine
 */
public class A013864 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1728) : mA.multiply(248832);
    return mA;
  }
}
