package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054437 Maximal subscripts within generalized Fibonacci sequence containing n.
 * @author Sean A. Irvine
 */
public class A054437 implements Sequence {

  private long mN = 0;

  private long findTarget(long a, long b, final long target) {
    if (a == target) {
      return 0;
    }
    if (b == target) {
      return 1;
    }
    long res = 1;
    while (b < target) {
      ++res;
      final long t = a + b;
      if (t == target) {
        return res;
      }
      a = b;
      b = t;
    }
    return 0; // does not occur in sequence
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.valueOf(mN + 1);
    }
    long max = 0;
    for (long a = 1; a < mN; ++a) {
      for (long b = 2 * a; b < mN; ++b) {
        final long m = findTarget(b - a, a, mN) + (b == 2 * a ? 1 : 0);
        if (m > max) {
          max = m;
        }
      }
    }
    return Z.valueOf(max);
  }
}
