package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000720;

/**
 * A060197 Start at n, repeatedly apply pi(x) until reach 0; a(n) = number of steps to reach 0.
 * @author Sean A. Irvine
 */
public class A060207 extends Sequence0 {

  // Only good for a few terms

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    long cnt = 1;
    int t = mN.intValueExact();
    while (t != 0) {
      ++cnt;
      t = mPi.a(t - 1).intValueExact();
    }
    return Z.valueOf(cnt);
  }
}
