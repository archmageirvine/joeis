package irvine.oeis.a065;

import java.util.Collections;
import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065844 Let u be any string of n digits from {0,1,2}; let f(u) = number of distinct primes, not beginning with 0, formed by permuting the digits of u; then a(n) = max_u f(u).
 * @author Sean A. Irvine
 */
public class A065844 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final int mBase;
  private int mN = 0;

  protected A065844(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A065844() {
    this(3);
  }

  @Override
  public Z next() {
    final long lim = Z.valueOf(mBase).pow(++mN).longValueExact();
    final HashMap<Long, Long> cnts = new HashMap<>();
    for (long p = lim / mBase; p < lim; p = mPrime.nextPrime(p)) {
      cnts.merge(Functions.DIGIT_SORT_ASCENDING.l(mBase, p), 1L, Long::sum);
    }
    return Z.valueOf(Collections.max(cnts.values()));
  }
}

