package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059706 Smallest prime p such that p^n reversed is a prime.
 * @author Sean A. Irvine
 */
public class A059706 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Functions.REVERSE.z(p.pow(mN)).isProbablePrime()) {
        return p;
      }
    }
  }
}

