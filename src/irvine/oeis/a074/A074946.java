package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074946 Positive integers n for which the sum of the prime-factorization exponents of n (bigomega(n) = A001222(n)) divides n.
 * @author Sean A. Irvine
 */
public class A074946 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.BIG_OMEGA.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
