package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086082 Numbers m such that m and all of its even complements from 2 to 10 are primes. In other words, m and j^k - m (where k is the smallest power of j such that j^k &gt; m) are prime for all of the following values of j: 2, 4, 6, 8, 10.
 * @author Sean A. Irvine
 */
public class A086082 extends A000040 {

  private final Z[] mA = {Z.FOUR, Z.FOUR, Z.SIX, Z.EIGHT, Z.TEN};

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      for (int k = 0; k < mA.length; ++k) {
        if (p.compareTo(mA[k]) >= 0) {
          mA[k] = mA[k].multiply(2L * k + 2);
        }
      }
      boolean ok = true;
      for (final Z m : mA) {
        if (!m.subtract(p).isProbablePrime()) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return p;
      }
    }
  }
}
