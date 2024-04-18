package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A062820 Sum_{k=1..n} p(k)*mu(k).
 * @author Sean A. Irvine
 */
public class A062820 extends A000040 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    final long n = ++mN;
    mSum = ZUtils.mobiusAdd(Functions.MOBIUS.i(n), mSum, super.next());
    return mSum;
  }
}
