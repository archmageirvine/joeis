package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001003;

/**
 * A075762 A001003(p-1)/p where p runs through the odd primes.
 * @author Sean A. Irvine
 */
public class A075762 extends A001003 {

  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A075762() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN > 1 && mPrime.isPrime(mN + 1)) {
        return t.divide(mN + 1);
      }
    }
  }
}
