package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064491 a(1) = 1, a(n+1) = a(n) + tau(a(n)), where tau(n) (A000005) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A064491 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.SIGMA0.z(mA));
    return mA;
  }
}
