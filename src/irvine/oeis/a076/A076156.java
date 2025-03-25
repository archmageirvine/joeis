package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076156 Numbers n such that Omega(n+1) = Omega(n)+1, where Omega(m) (A001222) denotes the number of prime factors of m, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076156 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN + 1) == Functions.BIG_OMEGA.l(mN) + 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
