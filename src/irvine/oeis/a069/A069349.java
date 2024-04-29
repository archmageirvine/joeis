package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A069349 Number of ways to represent primes as A069348(n)=k+A001222(k).
 * @author Sean A. Irvine
 */
public class A069349 extends A069348 {

  @Override
  public Z next() {
    final Z p = super.next();
    long cnt = 0;
    for (long k = 1; k <= p.bitLength() + 1; ++k) {
      if (Functions.BIG_OMEGA.l(p.subtract(k)) == k) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
