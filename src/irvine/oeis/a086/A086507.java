package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086507 If n is even, a(n) = smallest prime == 1 (mod n), If n is odd, a(n) = smallest prime == -1 (mod n).
 * @author Sean A. Irvine
 */
public class A086507 extends Sequence1 {

  private final Fast mFast = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long p = 1;
    if ((++mN & 1) == 0) {
      while (true) {
        p = mFast.nextPrime(p);
        if (p % mN == 1) {
          return Z.valueOf(p);
        }
      }
    } else {
      while (true) {
        p = mFast.nextPrime(p);
        if (p % mN == mN - 1) {
          return Z.valueOf(p);
        }
      }
    }
  }
}

