package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A046931 Prime islands: for n &gt;= 2, a(n) = least prime whose adjacent primes are exactly 2n apart; a(1) = 3 by convention.
 * @author Sean A. Irvine
 */
public class A046931 extends A000040 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private int mN = 0;

  private long sea(final Z p) {
    long sea = 0;
    Z q = p.subtract(1);
    while (!q.isProbablePrime()) {
      ++sea;
      q = q.subtract(1);
    }
    q = p.add(3);
    while (!q.isProbablePrime()) {
      ++sea;
      q = q.add(1);
    }
    return sea;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.THREE;
    }
    while (mFirsts.get(mN) == null) {
      final Z p = super.next();
      final long t = mFast.nextPrime(p).subtract(mFast.prevPrime(p)).divide2().longValueExact();
      if (mFirsts.get(t) == null) {
        mFirsts.set(t, p);
      }
    }
    return mFirsts.get(mN);
  }
}

