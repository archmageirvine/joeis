package irvine.oeis.a066;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066727 Least factor of n^Phi(n) -1.
 * @author Sean A. Irvine
 */
public class A066727 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : LeastPrimeFactorizer.lpf(Z.valueOf(mN).pow(Euler.phi(mN)).subtract(1));
  }
}
