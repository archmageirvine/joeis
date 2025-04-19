package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.Sequence1;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076849 extends Sequence1 {

  private long mN = 0;
  private final CachedSequence mU = new CachedSequence(1, Integer.class,
    (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n).add(self.a((n + 1) / 2).subtract(self.a(n / 2)).abs()));

  @Override
  public Z next() {
    return mU.next().subtract(++mN);
  }
}
