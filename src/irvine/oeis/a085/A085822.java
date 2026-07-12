package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A085822 Smallest prime with n exactly prime substrings (excluding the prime itself but allowing leading zeros and repeated values).
 * @author Sean A. Irvine
 */
public class A085822 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mP = 1;

  private long count(final long p) {
    long cnt = 0;
    for (long mod = 10; mod < p; mod *= 10) {
      long q = p;
      while (10 * q >= mod) {
        if (Predicates.PRIME.is(q % mod)) {
          ++cnt;
        }
        q /= 10;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = Functions.NEXT_PRIME.l(mP);
      final long cnt = count(mP);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
