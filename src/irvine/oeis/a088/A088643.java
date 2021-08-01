package irvine.oeis.a088;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A088643 Triangle read by rows: row n &gt;= 1 is obtained as follows. Start with n, next term is always largest number m with 1 &lt;= m &lt; n which has not yet appeared in that row and such that m + previous term in the row is a prime. Stop when no further m can be found.
 * @author Sean A. Irvine
 */
public class A088643 implements Sequence {

  private long mN = 0;
  private long mA = 1;
  private final TreeSet<Long> mSeen = new TreeSet<>();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    for (long m = mN - 1; m >= 1; --m) {
      if (!mSeen.contains(m) && mPrime.isPrime(mA + m)) {
        mA = m;
        mSeen.add(mA);
        return Z.valueOf(mA);
      }
    }
    // We need to start a new row
    mA = ++mN;
    mSeen.clear();
    mSeen.add(mA);
    return Z.valueOf(mA);
  }
}
