package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034883 Maximum length of Euclidean algorithm starting with n and any nonnegative i&lt;n.
 * @author Sean A. Irvine
 */
public class A034883 implements Sequence {

  private long mN = 0;

  private long countGcdSteps(long a, long b) {
    long steps = 0;
    while (a != 0) {
      final long t = a;
      a = b % a;
      b = t;
      ++steps;
    }
    return steps;
  }

  @Override
  public Z next() {
    ++mN;
    long best = 0;
    for (long k = 1; k < mN; ++k) {
      final long steps = countGcdSteps(k, mN);
      if (steps > best) {
        best = steps;
      }
    }
    return Z.valueOf(best);
  }
}

