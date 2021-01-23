package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013816 a(n) = 22^(4*n+1).
 * @author Sean A. Irvine
 */
public class A013816 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(22) : mA.multiply(234256);
    return mA;
  }
}
