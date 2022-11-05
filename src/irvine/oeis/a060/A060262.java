package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060262 a(n) is the smallest k such that prime(k), prime(k+1), ..., prime(k+n-1) all have 10 as a primitive root, but prime(k-1) and prime(k+n) do not.
 * @author Sean A. Irvine
 */
public class A060262 extends Sequence1 {

  private final Fast mPrime = new Fast();
  protected int mN = 0;

  protected boolean is(final Z p) {
    Z r = p;
    for (int j = 0; j < mN; ++j, r = mPrime.nextPrime(r)) {
      if (!ZUtils.isPrimitiveRoot(Z.TEN, r)) {
        return false;
      }
    }
    return !ZUtils.isPrimitiveRoot(Z.TEN, r);
  }

  protected Z select(final long n, final Z p) {
    return Z.valueOf(n);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return select(4, null);
    }
    Z p = Z.FIVE;
    long k = 3;
    while (true) {
      ++k;
      final Z q = p;
      p = mPrime.nextPrime(p);
      if (!ZUtils.isPrimitiveRoot(Z.TEN, q) && is(p)) {
        return select(k, p);
      }
    }
  }
}
