package irvine.oeis.a384;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A384936 a(n) = Sum_{k=1..n} floor( log(A002110(n)) / log(prime(k)) ).
 * @author Sean A. Irvine
 */
public class A384936 extends A002110 {

  private long mN = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final CR logPrimorial = CR.valueOf(super.next()).log();
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      sum = sum.add(logPrimorial.divide(CR.valueOf(p).log()).floor());
    }
    return sum;
  }
}
