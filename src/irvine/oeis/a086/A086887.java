package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086887 a(n) = least semiprime with factors not previously used containing integers 2n and 2n+1 as substrings.
 * @author Sean A. Irvine
 */
public class A086887 extends Sequence0 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long p = mN - 1;
    final String s0 = String.valueOf(2 * ++mN);
    do {
      p = mPrime.nextPrime(p);
    } while (mUsed.contains(p) || !String.valueOf(p).contains(s0));
    long q = mN - 1;
    final String s1 = String.valueOf(2 * mN + 1);
    do {
      q = mPrime.nextPrime(q);
    } while (mUsed.contains(q) || !String.valueOf(q).contains(s1));
    mUsed.add(p);
    mUsed.add(q);
    return Z.valueOf(p).multiply(q);
  }
}
