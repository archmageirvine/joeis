package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008578;

/**
 * A058009 a(n) is obtained by applying the map k -&gt; prime(k) n times, starting at n.
 * @author Sean A. Irvine
 */
public class A058009 extends Sequence1 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  private int mN = 0;

  @Override
  public Z next() {
    int t = ++mN;
    for (int k = 0; k < mN; ++k) {
      t = mPrimes.a(t).intValueExact();
    }
    return Z.valueOf(t);
  }
}
