package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073672 Rearrangement of natural numbers such that sum of n (n&gt;1) terms starting from the n-th term (included) is a prime.
 * @author Sean A. Irvine
 */
public class A073672 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private final List<Long> mA = new ArrayList<>();
  private long mK = 0;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mUsed.add(2L);
      mA.add(2L);
      return Z.TWO;
    }
    if ((mN & 1) == 1) {
      while (!mUsed.add(++mK)) {
        // do nothing
      }
      mA.add(mK);
      return Z.valueOf(mK);
    }
    long s = 0;
    for (int j = mN / 2; j < mN; ++j) {
      s += mA.get(j);
    }
    long i = mK;
    while (true) {
      if (mPrime.isPrime(s + ++i) && mUsed.add(i)) {
        mA.add(i);
        return Z.valueOf(i);
      }
    }
  }
}
