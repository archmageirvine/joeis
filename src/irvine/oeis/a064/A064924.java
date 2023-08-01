package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064924 If n is prime then a(n) = n; for the subsequent nonprime positions a(n + k) = (k+1)*n; then at the next prime position a new subsequence begins.
 * @author Sean A. Irvine
 */
public class A064924 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private long mN = 1;
  private long mR = 0;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mN == mP) {
      mM = 0;
      mR = mP;
      mP = mPrime.nextPrime(mP);
    }
    mM += mR;
    return Z.valueOf(mM);
  }
}

