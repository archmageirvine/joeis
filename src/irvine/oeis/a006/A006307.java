package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006307.
 * @author Sean A. Irvine
 */
public class A006307 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z m = mN;
    mN = mN.equals(Z.ZERO) ? Z.ONE : mN.multiply2();
    long c = 0;
    for (Z p = Z.TWO; p.compareTo(m) <= 0; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mN.subtract(p))) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

