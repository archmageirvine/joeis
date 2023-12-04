package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A067127 Composite numbers for which phi(n) &gt;= phi(k) for all composite k from 1 to n-1.
 * @author Sean A. Irvine
 */
public class A067127 extends A000010 {

  private final Fast mPrime = new Fast();
  private Z mMax = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z phi = super.next();
      if (!mPrime.isPrime(mN) && phi.compareTo(mMax) >= 0) {
        mMax = phi;
        return Z.valueOf(mN);
      }
    }
  }
}
