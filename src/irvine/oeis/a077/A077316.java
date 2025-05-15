package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077316 Triangle read by rows: T(n,k) is the k-th prime = 1 (mod n).
 * @author Sean A. Irvine
 */
public class A077316 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.TWO; // avoid need for 1 % mN below
      }
      mM = 0;
      mP = 1;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % mN == 1) {
        return Z.valueOf(mP);
      }
    }
  }
}
