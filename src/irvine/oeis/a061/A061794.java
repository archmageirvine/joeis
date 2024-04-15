package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061794 Number of distinct sums d(i) + d(j) for 1&lt;=i&lt;=j&lt;=n, d(k) = A000005(k) = number of divisors function.
 * @author Sean A. Irvine
 */
public class A061794 extends Sequence1 {

  private final HashSet<Z> mSums = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Functions.SIGMA0.z(++mN);
    mSums.add(s.multiply2());
    for (long q = 1; q < mN; ++q) {
      mSums.add(s.add(Functions.SIGMA0.z(q)));
    }
    return Z.valueOf(mSums.size());
  }
}

