package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076136 Numbers n such that Omega(n) = Omega(n-1) + Omega(n-2), where Omega(n) (A001222) denotes the number of prime factors of n, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076136 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == Functions.BIG_OMEGA.l(mN - 1) + Functions.BIG_OMEGA.l(mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
