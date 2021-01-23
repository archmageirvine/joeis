package irvine.oeis.a325;

import irvine.math.z.Z;
import irvine.oeis.a036.A036844;

/**
 * A325307 a(n) = k / (sum of prime factors of k, counted with multiplicity) where k is the n-th number for which the ratio is an integer.
 * @author Sean A. Irvine
 */
public class A325307 extends A036844 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long ds = sumOfPrimeFactors(++mN);
      if (mN % ds == 0) {
        return Z.valueOf(mN / ds);
      }
    }
  }
}
