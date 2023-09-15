package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A065770 Number of prime cascades to reach 1, where a prime cascade (A065769) is multiplicative with a(p(m)^k) = p(m-1) * p(m)^(k-1).
 * @author Sean A. Irvine
 */
public class A065770 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A065769());
  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    int t = ++mN;
    while (t != 1) {
      ++cnt;
      t = mA.a(t - 1).intValueExact();
    }
    return Z.valueOf(cnt);
  }
}
