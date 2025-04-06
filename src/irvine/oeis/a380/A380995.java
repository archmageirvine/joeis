package irvine.oeis.a380;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A380995 Integers k that are the product of 3 distinct primes, the smallest of which is larger than the 4th root of k: k = p*q*r, where p, q, r are primes and k^(1/4) &lt; p &lt; q &lt; r.
 * @author Sean A. Irvine
 */
public class A380995 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    return Functions.BIG_OMEGA.l(n) == 3
      && Functions.OMEGA.l(n) == 3
      && Functions.LPF.z(n).pow(4).compareTo(n) > 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
