package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001608;

/**
 * A014981 <code>a(n)=c(p(n))/p(n)</code>, where c = Perrin sequence <code>A001608</code> (starting <code>0,2,3,...)</code> and <code>p(n) = n-th</code> prime.
 * @author Sean A. Irvine
 */
public class A014981 extends A001608 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN)) {
        return super.next().divide(mN);
      }
      super.next();
    }
  }
}
