package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074908 Number of integers with an odd number of distinct primes (for which mu(n)=-1) between two consecutive primes prime(n) and prime(n+1).
 * @author Sean A. Irvine
 */
public class A074908 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    long cnt = 0;
    for (Z r = p; r.compareTo(q) <= 0; r = r.add(1)) {
      if (Functions.MOBIUS.i(r) == -1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
