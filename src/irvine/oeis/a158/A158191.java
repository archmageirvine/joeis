package irvine.oeis.a158;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A158191 Attach the smallest prime to the end of the string a(n-1) so a(n) is also prime.
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

