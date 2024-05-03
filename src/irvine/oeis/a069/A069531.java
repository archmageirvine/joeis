package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069531 Smallest positive k such that 10^k + 1 is divisible by n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069531 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    for (final Z k : Jaguar.factor(Functions.PHI.z(++mN)).divisorsSorted()) {
      if (Z.TEN.pow(k).add(1).mod(mN) == 0) {
        return k;
      }
    }
    return Z.ZERO;
  }
}
