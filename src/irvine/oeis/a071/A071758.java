package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071758 Successive minima of partial sum of harmonic series Sum (mu(n)/n) are approximately 1/a(n).
 * @author Sean A. Irvine
 */
public class A071758 extends Sequence1 {

  private Q mBest = Q.ONE;
  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(new Q(Functions.MOBIUS.i(++mN), mN));
      if (mSum.abs().compareTo(mBest.abs()) < 0) {
        mBest = mSum;
        return mSum.reciprocal().floor();
      }
    }
  }
}
