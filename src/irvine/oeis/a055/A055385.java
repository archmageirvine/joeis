package irvine.oeis.a055;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055385 Smallest prime factor of n^n + 1.
 * @author Sean A. Irvine
 */
public class A055385 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(Z.valueOf(++mN).pow(mN).add(1));
  }
}
