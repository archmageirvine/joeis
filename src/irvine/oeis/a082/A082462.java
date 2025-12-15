package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082462 Let chi(k) = 1 if prime(k+1) - prime(k) = 2, = 0 otherwise; sequence gives a(n) = Sum_{k &lt;= n} chi(k).
 * @author Sean A. Irvine
 */
public class A082462 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    if (mPrime.nextPrime(p).subtract(p).equals(Z.TWO)) {
      mSum = mSum.add(1);
    }
    return mSum;
  }
}

