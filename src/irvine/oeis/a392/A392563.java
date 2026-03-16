package irvine.oeis.a392;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A392563 a(n) is the least number that can be written in exactly n ways as p + r, where p is a prime and r is an anagram of p.
 * @author Sean A. Irvine
 */
public class A392563 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = mPrime.nextPrime(mN / 10); p < mN; p = mPrime.nextPrime(p)) {
      final int[] cnts = ZUtils.digitCounts(p);
      final long q = mN - p;
      if (p * 10 > q && q * 10 > p && Arrays.equals(cnts, ZUtils.digitCounts(q))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

