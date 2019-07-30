package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024935.
 * @author Sean A. Irvine
 */
public class A024935 implements Sequence {

  // Assuming various Goldbach conjectures, a(n) <= 3.
  // In particular,
  // a(p)=1.
  // a(2*n)=2, n>1.
  // a(p+2)=2, p+2 not prime
  // a(n)=3 otherwise

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    if (mPrime.isPrime(mN)) {
      return Z.ONE;
    } else if ((mN & 1) == 0) {
      return Z.TWO;
    } else if (mPrime.isPrime(mN - 2)) {
      return Z.TWO;
    } else {
      return Z.THREE;
    }
  }
}
