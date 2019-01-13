package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013837.
 * @author Sean A. Irvine
 */
public class A013837 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(625) : mA.multiply(3125);
    return mA;
  }
}
