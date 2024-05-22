package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061592 Smallest number &gt;= n whose product of divisors is an n-th power.
 * @author Sean A. Irvine
 */
public class A061592 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? Z.SIX : Z.ONE;
    }
    if (mPrime.isPrime(mN)) {
      return Z.ONE.shiftLeft(mN - 1);
    }
    if ((mN & 1) == 0 && mPrime.isPrime(mN / 2)) {
      final int p = mN / 2;
      return p == 2 ? Z.valueOf(24) : Z.ONE.shiftLeft((p & 3) == 1 ? p - 1 : p);
    }
    long m = mN;
    while (true) {
      final Z dp = Functions.PRODUCT.z(Jaguar.factor(m).divisors());
      dp.root(mN);
      if (dp.auxiliary() == 1) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}
