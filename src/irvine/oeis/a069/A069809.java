package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069809 Numbers k such that gcd(k, phi(k)) = tau(k).
 * @author Sean A. Irvine
 */
public class A069809 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(++mN, Functions.PHI.l(mN)) == Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

