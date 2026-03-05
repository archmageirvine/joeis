package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A393607 Rectangular array R read by descending antidiagonals: row n shows primes p such that (p mod n) = n-1.
 * @author Sean A. Irvine
 */
public class A393607 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mP = new DynamicLongArray();
  private final DynamicLongArray mPi = new DynamicLongArray();
  private int mN = 0;
  private int mM = -1;

  private Z t(final int row) {
    final int mod = row + 1;
    while (true) {
      final long p = mPrime.nextPrime(mP.get(row));
      mP.set(row, p);
      mPi.increment(row);
      if (p % mod == row) {
        return Z.valueOf(p);
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM);
  }
}
