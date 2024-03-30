package irvine.oeis.a069;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069003.
 * @author Sean A. Irvine
 */
public class A069016 extends Sequence1 {

  private final HashSet<Long> mSums = new HashSet<>();
  private long mN = 0;

  private void search(final long n, final long sum, final long min) {
    if (n == 1) {
      mSums.add(sum);
    } else {
      for (long k = min; k <= n; ++k) {
        if (n % k == 0) {
          search(n / k, sum + k, k);
        }
      }
    }
  }

  @Override
  public Z next() {
    mSums.clear();
    search(++mN, 0, 2);
    return Z.valueOf(mSums.size());
  }
}

