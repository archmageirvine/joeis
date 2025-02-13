package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075240 Smallest prime whose base-n reversal is not a prime.
 * @author Sean A. Irvine
 */
public class A075240 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!Functions.REVERSE.z(mN, p).isProbablePrime()) {
        return p;
      }
    }
  }
}
