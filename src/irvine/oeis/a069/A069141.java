package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069141 a(n) = n^2*(n+1)!/(n^tau(n)) where tau(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A069141 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 1);
    return mF.multiply(mN * mN).divide(Z.valueOf(mN).pow(Functions.SIGMA0.l(mN)));
  }
}

