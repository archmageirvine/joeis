package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039786 phi(a(n)) is equal to the multiplicative projection of (a(n)-1).
 * @author Sean A. Irvine
 */
public class A039786 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN = mN == 7 ? 9 : mPrime.nextPrime(mN);
      final FactorSequence fs = Cheetah.factor(mN - 1);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(p).multiply(fs.getExponent(p));
      }
      if (prod.equals(Cheetah.factor(mN).phi())) {
        return Z.valueOf(mN);
      }
    }
  }
}
