package irvine.oeis.a385;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A385050 a(n) is the least positive number k such that n is the greatest m such that k is a quadratic residue mod prime(i) for i=1..m and {k mod prime(i): i=1..m} are all distinct.
 * @author Sean A. Irvine
 */
public class A385050 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long k) {
    if (mN >= 4) {
      final long r = k % 105;
      if (r != 9 && r != 79) {
        return false;
      }
    }
    long p = 1;
    long m = 0;
    final HashSet<Long> seen = new HashSet<>();
    while (++m <= mN) {
      p = mPrime.nextPrime(p);
      if (!seen.add(k % p)) {
        return false;
      }
      if (!ZUtils.isQuadraticResidue(Z.valueOf(k), Z.valueOf(p))) {
        return false;
      }
    }
    // Check cannot extend to n + 1
    p = mPrime.nextPrime(p);
    return !seen.add(k % p) || !ZUtils.isQuadraticResidue(Z.valueOf(k), Z.valueOf(p));
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
