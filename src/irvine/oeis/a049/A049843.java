package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A049843 Triangular array T read by rows: T(n,k)=number of nonzero remainders when Euclidean algorithm acts on primes p(n) and p(k), k=1,2,...,n-1; n=2,3,4,...
 * @author Sean A. Irvine
 */
public class A049843 extends A049816 {

  /** Construct the sequence. */
  public A049843() {
    super(2);
  }

  private final Fast mPrime = new Fast();
  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    mM = mPrime.nextPrime(mM);
    if (mM >= mN) {
      mN = mPrime.nextPrime(mN);
      mM = 2;
    }
    return Z.valueOf(t(mN, mM));
  }
}
