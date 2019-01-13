package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013905.
 * @author Sean A. Irvine
 */
public class A013905 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(234256) : mA.multiply(5153632);
    return mA;
  }
}
