package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063041 Image of n under Collatz-2 map, a generalization of the classical '3x+1' - function: instead of dividing an even number by 2 a nonprime will be divided by its smallest prime factor and a prime will be multiplied not by 3 but by its prime-predecessor, before one is added.
 * @author Sean A. Irvine
 */
public class A063041 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  protected Z collatz2(final Z n) {
    if (Z.TWO.equals(n)) {
      return Z.THREE;
    }
    return mPrime.isPrime(n)
      ? n.multiply(mPrime.prevPrime(n)).add(1)
      : n.divide(LeastPrimeFactorizer.lpf(n));
  }

  @Override
  public Z next() {
    return collatz2(Z.valueOf(++mN));
  }
}
