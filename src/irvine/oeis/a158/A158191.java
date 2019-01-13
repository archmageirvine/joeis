package irvine.oeis.a158;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A158191.
 * @author Sean A. Irvine
 */
public class A158191 implements Sequence {

  private String mN = "";
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final String t = mN + p;
      final Z k = new Z(t);
      if (mPrime.isPrime(k)) {
        mN = t;
        return k;
      }
    }
  }
}

