package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039768 Numbers k such that gcd(phi(k), k-1) = number of divisors of (k-1).
 * @author Sean A. Irvine
 */
public class A039768 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).gcd(Z.valueOf(mN - 1)).equals(Functions.SIGMA0.z(mN - 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
