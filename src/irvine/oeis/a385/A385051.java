package irvine.oeis.a385;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A385051 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A385051 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(final long k) {
    if (mN >= 3) {
      final long r = k % 105;
      if (r != 68 && r != 83) {
        return false;
      }
    }
    long p = 2;
    long m = 0;
    final HashSet<Long> seen = new HashSet<>();
    while (++m <= mN) {
      p = mPrime.nextPrime(p);
      if (!seen.add(k % p)) {
        return false;
      }
      if (ZUtils.isQuadraticResidue(Z.valueOf(k), Z.valueOf(p))) {
        return false;
      }
    }
    // Check cannot extend to n + 1
    p = mPrime.nextPrime(p);
    return !seen.add(k % p) || ZUtils.isQuadraticResidue(Z.valueOf(k), Z.valueOf(p));
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
