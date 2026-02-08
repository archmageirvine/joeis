package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A083684 Numbers k such that there is no nonnegative integer m such that m &lt; k*prime(k) and the concatenated decimal number fp(k,m) = prime(1).m.prime(2).m. ... .prime(k-1).m.prime(k) is prime.
 * @author Sean A. Irvine
 */
public class A083684 extends Sequence1 {

  private final DirectSequence mS = new A007504();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (++mN == 3 || (mN % 3 == 1 && mS.a(mN).mod(3) == 0)) {
        return Z.valueOf(mN);
      }
      long k = -1;
      while (true) {
        if (++k >= mP * mN) {
          return Z.valueOf(mN);
        }
        final StringBuilder sb = new StringBuilder();
        long p = 2;
        for (int j = 0; j < mN; ++j, p = mPrime.nextPrime(p)) {
          if (j != 0) {
            sb.append(k);
          }
          sb.append(p);
        }
        if (new Z(sb).isProbablePrime()) {
          break;
        }
      }
    }
  }
}
