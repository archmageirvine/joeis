package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065962 a(1) = 1, a(n) = a(n - 1) + pi(a(n - 1)) + 1.
 * @author Sean A. Irvine
 */
public class A065962 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(1).add(Functions.PRIME_PI.l(mA));
    return mA;
  }
}
