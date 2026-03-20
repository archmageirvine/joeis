package irvine.oeis.a393;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A393958 a(n) is the number of ways to write n = p + r where p is a prime and r is an anagram of p.
 * @author Sean A. Irvine
 */
public class A393958 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    long cnt = 0;
    for (long p = mPrime.nextPrime(n / 10); p < n; p = mPrime.nextPrime(p)) {
      final int[] cnts = ZUtils.digitCounts(p);
      final long q = n - p;
      if (p * 10 > q && q * 10 > p && Arrays.equals(cnts, ZUtils.digitCounts(q))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

