package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059872 Solutions to the equation given in A059871, encoded as binary vectors and converted to decimal.
 * @author Sean A. Irvine
 */
public class A059872 implements Sequence {

  protected final TreeSet<Long> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private int mN = 0;

  private void search(final long sum, final long p, final long k, final long pattern) {
    if (k == 0) {
      if (sum == 0) {
        mA.add(pattern);
      }
      return;
    }
    final long q = Math.max(mPrime.prevPrime(p), 1); // Take p_0=1
    search(sum + q, q, k - 1, (pattern << 1) + 1);
    search(sum - q, q, k - 1, pattern << 1);
  }

  protected void step() {
    mA.clear();
    ++mN;
    final long q = mP;
    mP = mPrime.nextPrime(mP);
    search(q * (1 + (mN & 1)) - mP, q, mN - 1, 1L);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      step();
    }
    return Z.valueOf(mA.pollFirst());
  }
}
