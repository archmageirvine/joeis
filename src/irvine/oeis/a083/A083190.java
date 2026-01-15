package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083190 a(1) = 1; for n&gt;1 a(n) is smallest prime not occurring earlier such that the concatenation of a(n), a(n+1), ..., a(2n-1) is a composite number.
 * @author Sean A. Irvine
 */
public class A083190 extends CachedSequence {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();

  /** Construct the sequence. */
  public A083190() {
    super(1);
  }

  @Override
  protected Z compute(final Z m) {
    final int n = m.intValue();
    if (n == 1) {
      return Z.ONE;
    }
    long p = 1;
    final StringBuilder sb = new StringBuilder();
    for (int k = n / 2 + 1; k < n; ++k) {
      sb.append(a(k));
    }
    final String s = sb.toString();
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && ((n & 1) == 0 || !new Z(s + p).isProbablePrime())) {
        mUsed.add(p);
        return Z.valueOf(p);
      }
    }
  }
}

