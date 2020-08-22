package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033921 Largest proper substring of 2^n that is a power of 2 (0 if none).
 * @author Sean A. Irvine
 */
public class A033921 implements Sequence {

  private int mN = -1;

  private boolean isPowerOfTwo(final Z n) {
    return !Z.ZERO.equals(n) && Z.ZERO.equals(n.and(n.subtract(1)));
  }

  @Override
  public Z next() {
    final String p = Z.ONE.shiftLeft(++mN).toString();
    Z best = Z.ZERO;
    for (int k = p.length() - 1; k > 0; --k) {
      for (int j = 0; j <= p.length() - k; ++j) {
        if (p.charAt(j) != '0') {
          final Z a = new Z(p.substring(j, j + k));
          if (a.compareTo(best) > 0 && isPowerOfTwo(a)) {
            best = a;
          }
        }
      }
      if (!Z.ZERO.equals(best)) {
        return best; // No shorter prime can be bigger
      }
    }
    return best;
  }
}
