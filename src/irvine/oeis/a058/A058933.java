package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A058933 Let k be bigomega(n) (i.e., n is a k-almost-prime). a(n) = number of k-almost-primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A058933 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  protected long mN = 0;

  @Override
  public Z next() {
    final long omega = Jaguar.factor(++mN).bigOmega();
    mCounts.set(omega, mCounts.get(omega) + 1);
    return Z.valueOf(mCounts.get(omega));
  }
}
