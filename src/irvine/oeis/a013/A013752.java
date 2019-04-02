package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013752 a(n) = 13^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013752 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13) : mA.multiply(2197);
    return mA;
  }
}
