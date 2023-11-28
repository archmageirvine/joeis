package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000001;
import irvine.oeis.memory.MemorySequence;

/**
 * A072410 Number of iterations of the map k -&gt; A000001(k) needed to reach 1 starting at n, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A072410 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000001());
  private int mN = 0;

  @Override
  public Z next() {
    int t = ++mN;
    long cnt = 0;
    while (t != 1) {
      t = mA.a(t).intValueExact();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
