package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033920 Largest proper substring of n-th prime that is prime (0 if none).
 * @author Sean A. Irvine
 */
public class A033920 extends A000040 {

  @Override
  public Z next() {
    final String p = super.next().toString();
    Z best = Z.ZERO;
    for (int k = p.length() - 1; k > 0; --k) {
      for (int j = 0; j <= p.length() - k; ++j) {
        if (p.charAt(j) != '0') {
          final Z a = new Z(p.substring(j, j + k));
          if (a.compareTo(best) > 0 && a.isProbablePrime()) {
            best = a;
          }
        }
      }
      if (!best.isZero()) {
        return best;
      }
    }
    return best;
  }
}
