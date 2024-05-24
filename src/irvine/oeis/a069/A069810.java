package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069810 Integers k such that gcd(k, sigma(k)) = tau(k).
 * @author Sean A. Irvine
 */
public class A069810 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(++mN, Functions.SIGMA.l(mN)) == Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
