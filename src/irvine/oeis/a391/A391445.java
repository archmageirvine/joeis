package irvine.oeis.a391;

import java.util.LinkedList;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A391445 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A391445 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mP = 9;
  private int mN = 0;

  private int getLength(final long p) {
    final LinkedList<Long> lst = new LinkedList<>();
    long q = p;
    while (q != 0) {
      lst.addFirst(q % 10);
      q /= 10;
    }
    int cnt = 1; // p is already prime
    while (true) {
      final long sum = LongUtils.sum(lst);
      if (!mPrime.isPrime(sum)) {
        return cnt;
      }
      ++cnt;
      lst.removeFirst();
      lst.add(sum);
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final int len = getLength(mP);
      if (mFirsts.get(len) == 0) {
        mFirsts.set(len, mP);
        if (mVerbose) {
          StringUtils.message("Solution for n=" + len + " is " + mP);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
