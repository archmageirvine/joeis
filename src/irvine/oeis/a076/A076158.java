package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076158 a(n) = the least positive integer k such that Omega(n+k) = Omega(k)+n, where Omega(m) (A001222) denotes the number of prime factors of m, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076158 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.BIG_OMEGA.l(mN + ++k) == Functions.BIG_OMEGA.l(k) + mN) {
        return Z.valueOf(k);
      }
    }
  }
}
