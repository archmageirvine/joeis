package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061795 Number of distinct sums phi(i) + phi(j) for 1 &lt;= i &lt;= j &lt;= n, phi(k) = A000010(k).
 * @author Sean A. Irvine
 */
public class A061795 extends Sequence1 {

  private final HashSet<Long> mSums = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    final long s = Functions.PHI.l(++mN);
    mSums.add(2L * s);
    for (int q = 1; q < mN; ++q) {
      mSums.add(s + Functions.PHI.l(q));
    }
    return Z.valueOf(mSums.size());
  }
}

