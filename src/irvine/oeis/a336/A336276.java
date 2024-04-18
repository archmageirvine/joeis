package irvine.oeis.a336;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A336276 a(n) = Sum_{k=1..n} mu(k)*k^2.
 * @author Sean A. Irvine
 */
public class A336276 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(Z.valueOf(++mN).square().multiply(Functions.MOBIUS.i(mN)));
    return mSum;
  }
}
