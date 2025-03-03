package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075618 Rearrangement of natural numbers so that starting with a(n) the concatenation of n numbers is divisible by n. Choose the smallest number that has not already appeared if there is a choice.
 * @author Sean A. Irvine
 */
public class A075618 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final List<Long> mA = new ArrayList<>();
  private long mK = 0;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mUsed.add(1L);
      mA.add(1L);
      return Z.ONE;
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
      if (new Z(sb.toString() + ++i).mod(mN / 2 + 1) == 0 && mUsed.add(i)) {
        mA.add(i);
        return Z.valueOf(i);
      }
    }
  }
}
