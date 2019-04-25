package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162701 Numbers k which are concatenations <code>k = x//y</code> such that <code>x^2 - y^2</code> is a multiple of k.
 * @author Sean A. Irvine
 */
public class A162701 implements Sequence {

  private long mN = 47;

  private boolean test(final long n) {
    final String s = String.valueOf(n);
    for (int pivot = (s.length() + 1) / 2; pivot < s.length(); ++pivot) {
      if (s.charAt(pivot) != '0') {
        final long right = Long.parseLong(s.substring(pivot));
        final long left = Long.parseLong(s.substring(0, pivot));
        if (left > right) {
          final long rightSquared = right * right;
          final long leftSquared = left * left;
          if ((leftSquared - rightSquared) % mN == 0) {
            return true;
          }
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

