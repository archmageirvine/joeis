package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A060197 Start at n, repeatedly apply pi(x) until reach 0; a(n) = number of steps to reach 0.
 * @author Sean A. Irvine
 */
public class A060197 extends Sequence1 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1;
    int t = mN;
    while (t != 0) {
      ++cnt;
      t = mPi.a(t - 1).intValueExact();
    }
    return Z.valueOf(cnt);
  }
}
