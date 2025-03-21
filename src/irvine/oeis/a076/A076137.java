package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076137 Numbers k such that Omega(k) = Omega(k-1) + Omega(k-2) + Omega(k-3), where Omega(n) denotes the number of prime factors of n, with multiplicity.
 * @author Sean A. Irvine
 */
public class A076137 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == Functions.BIG_OMEGA.l(mN - 1) + Functions.BIG_OMEGA.l(mN - 2) + Functions.BIG_OMEGA.l(mN - 3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
