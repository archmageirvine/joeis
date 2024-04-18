package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039786 phi(a(n)) is equal to the multiplicative projection of (a(n)-1).
 * @author Sean A. Irvine
 */
public class A039786 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN = mN == 7 ? 9 : mPrime.nextPrime(mN);
      final FactorSequence fs = Jaguar.factor(mN - 1);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(p).multiply(fs.getExponent(p));
      }
      if (prod.equals(Functions.PHI.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
