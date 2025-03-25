package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076155 Omega(n) = Omega(n-1)^3, where Omega(m) (A001222) denotes the number of prime factors of m, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076155 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    if (mN == 1) {
      return Z.valueOf(++mN);
    }
    while (true) {
      if (Functions.BIG_OMEGA.z(mN).pow(3).equals(Functions.BIG_OMEGA.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
