package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013862.
 * @author Sean A. Irvine
 */
public class A013862 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12) : mA.multiply(248832);
    return mA;
  }
}
