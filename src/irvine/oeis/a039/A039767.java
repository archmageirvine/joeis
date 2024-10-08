package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039767 Numbers k such that gcd(phi(k), k-1) = number of distinct prime factors of (k-1).
 * @author Sean A. Irvine
 */
public class A039767 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GCD.l(Functions.PHI.l(++mN), mN - 1) == Functions.OMEGA.i(mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
