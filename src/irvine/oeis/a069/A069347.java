package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A069347 Number of ways to represent primes as A069346(n)=k-A001222(k).
 * @author Sean A. Irvine
 */
public class A069347 extends A069346 {

  @Override
  public Z next() {
    final Z p = super.next();
    long cnt = 0;
    for (long k = 1; k <= p.bitLength() + 1; ++k) {
      if (Functions.BIG_OMEGA.l(p.add(k)) == k) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
