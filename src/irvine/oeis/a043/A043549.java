package irvine.oeis.a043;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043549 Least k for which the integers Floor(2k/m) for m=2,3,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A043549 implements Sequence {

  private long mK = 1;
  private long mN = 0;

  protected long multiplier() {
    return 2;
  }

  private boolean isOk(final long k) {
    final TreeSet<Long> mSeen = new TreeSet<>();
    for (int m = 2; m <= mN; ++m) {
      if (!mSeen.add(k / m)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isOk(multiplier() * mK)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}

