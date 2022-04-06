package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055776 a(n) = a(n-1)^3 + a(n-1)^2 + a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A055776 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.pow(3).add(mA.square()).add(mA).add(1);
    return mA;
  }
}
