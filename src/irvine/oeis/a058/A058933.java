package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A058933 a(1)=1; for k &gt; 0, if n is k-almost prime then a(n) = number of k-almost primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A058933 implements Sequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  protected long mN = 0;

  @Override
  public Z next() {
    final long omega = Jaguar.factor(++mN).bigOmega();
    mCounts.set(omega, mCounts.get(omega) + 1);
    return Z.valueOf(mCounts.get(omega));
  }
}
