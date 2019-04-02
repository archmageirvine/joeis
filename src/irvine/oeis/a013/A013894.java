package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013894 a(n) = 20^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013894 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(20) : mA.multiply(3200000);
    return mA;
  }
}
