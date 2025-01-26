package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074705 a(1)=4; for n&gt;1: number of primes between squares of (n-1)-th and (n+1)-th primes.
 * @author Sean A. Irvine
 */
public class A074705 extends A000040 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.FOUR;
    }
    final Z p = super.next();
    final Z q = mPrime.nextPrime(mPrime.nextPrime(p));
    long cnt = 0;
    for (Z r = mPrime.nextPrime(p.square()); r.compareTo(q.square()) < 0; r = mPrime.nextPrime(r)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
