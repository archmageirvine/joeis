package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075617 Rearrangement of natural numbers so that starting with a(n) the concatenation of n numbers gives a composite number.
 * @author Sean A. Irvine
 */
public class A075617 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private final List<Long> mA = new ArrayList<>();
  private long mK = 0;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mUsed.add(4L);
      mA.add(4L);
      return Z.FOUR;
    }
    if ((mN & 1) == 1) {
      while (mUsed.remove(++mK)) {
        // do nothing
      }
      mA.add(mK);
      return Z.valueOf(mK);
    }
    final StringBuilder sb = new StringBuilder();
    for (int j = mN / 2; j < mN; ++j) {
      sb.append(mA.get(j));
    }
    long i = mK;
    while (true) {
      if (!mPrime.isPrime(new Z(sb.toString() + ++i)) && mUsed.add(i)) {
        mA.add(i);
        return Z.valueOf(i);
      }
    }
  }
}
