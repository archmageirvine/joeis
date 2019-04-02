package irvine.oeis.a005;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005837 Lexicographically earliest increasing sequence of positive numbers that contains no 4-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005837 implements Sequence {

  private final Set<Long> mTerms = new TreeSet<>();
  private long mN = 0;

  protected int limit() {
    return 4;
  }

  private boolean isForbidden(final long n) {
    for (final long v : mTerms) {
      final long d = n - v;
      boolean forbidden = true;
      for (int k = 2; k < limit(); ++k) {
        if (!mTerms.contains(n - k * d)) {
          forbidden = false;
          break;
        }
      }
      if (forbidden) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (!isForbidden(++mN)) {
        mTerms.add(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
