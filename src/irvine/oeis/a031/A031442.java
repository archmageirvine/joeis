package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031442 a(0) = 13; for n &gt; 0, a(n) is the greatest prime factor of PreviousPrime(a(n-1))*a(n-1)-1 where PreviousPrime(prime(k))=prime(k-1).
 * @author Sean A. Irvine
 */
public class A031442 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(13);
    } else {
      final Z[] p = Jaguar.factor(mPrime.prevPrime(mA).multiply(mA).subtract(1)).toZArray();
      mA = p[p.length - 1];
    }
    return mA;
  }
}
