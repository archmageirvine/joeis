package irvine.oeis.a007;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A007546.
 * @author Sean A. Irvine
 */
public class A007546 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mP = new LongDynamicLongArray();
  private long mPP = 1;

  {
    add(null);
    mP.set(0, 0);
  }

  private long p(final long n) {
    while (n >= mP.length()) {
      mPP = mPrime.nextPrime(mPP);
      mP.set(mP.length(), mPP);
    }
    return mP.get(n);
  }

  private Z f(final long n) {
    final Z[] divisors = Cheetah.factor(n).divisors();
    Arrays.sort(divisors);
    final long b = divisors[divisors.length - 2].longValue();
    Z sum = Z.ZERO;
    for (long d = b; d < n; ++d) {
      sum = sum.add(n / d);
    }
    sum = sum.multiply2();
    return sum.add(n - 1).add(Z.valueOf(n - b).multiply(6 * n + 2));
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return f(2);
    }
    Z sum = get(n - 1);
    for (long i = p(n - 1) + 1; i <= p(n); ++i) {
      sum = sum.add(f(i));
    }
    return sum;
  }

  /*
  with(numtheory):
  f:= proc(n) local l, b, d; l:= sort([divisors (n)[]]); b:= l[nops(l)-1]; n-1 +(6*n+2)*(n-b) +2*add(floor(n/d), d=b..n-1) end:
   a:= proc(n) option remember; `if`(n=1, f(2), a(n-1) +add(f(i), i=ithprime(n-1)+1..ithprime(n))) end: seq(a(n), n=1..40);
   */
}
