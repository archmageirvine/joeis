package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035239 Smallest number that contains the numbers from 1 to n as substrings.
 * @author Sean A. Irvine
 */
public class A035239 implements Sequence {

  // This is brute force, not very smart

  private long mStart = 0;
  private long mN = 0;

  private boolean isOk(final long m) {
    final String s = String.valueOf(m);
    for (long k = mN; k >= 1; --k) {
      if (!s.contains(String.valueOf(k))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    mStart = mStart == 0 ? 1 : mStart * 10L;
    long m = mStart;
    while (true) {
      if (isOk(m)) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}

