package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162700 Numbers k which are concatenations k = x//y such that y^2 - x^2 = k.
 * @author Sean A. Irvine
 */
public class A162700 extends Sequence1 {

  private long mN = 47;

  private boolean test(final long n) {
    final String s = String.valueOf(n);
    for (int pivot = 1; pivot < s.length(); ++pivot) {
      if (s.charAt(pivot) != '0') {
        final long right = Long.parseLong(s.substring(pivot));
        final long rightSquared = right * right;
        final long left = Long.parseLong(s.substring(0, pivot));
        final long leftSquared = left * left;
        if (n == rightSquared - leftSquared) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (!test(++mN)) {
    }
    return Z.valueOf(mN);
  }
}

