package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;
import irvine.util.array.LongDynamicLongArray;

/**
 * A087271 Least number x such that gcd(x, pi(x)) = n.
 * @author Sean A. Irvine
 */
public class A087271 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mPi = new A000720();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long v = Functions.GCD.l(++mM, mPi.next());
      if (mFirsts.get(v) == 0) {
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
