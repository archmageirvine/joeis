package irvine.oeis.a080;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080370 Number of distinct values among the differences prime(j)-prime(i), 1 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A080370 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> diffs = new HashSet<>();
    for (long k = 1, p = 3; k < mN; ++k, p = mPrime.nextPrime(p)) {
      for (long q = 2; q != p; q = mPrime.nextPrime(q)) {
        diffs.add(p - q);
      }
    }
    return Z.valueOf(diffs.size());
  }
}
