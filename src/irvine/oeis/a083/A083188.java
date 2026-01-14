package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083128.
 * @author Sean A. Irvine
 */
public class A083188 extends CachedSequence {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();

  /** Construct the sequence. */
  public A083188() {
    super(1);
  }

  @Override
  protected Z compute(final Z m) {
    final int n = m.intValue();
    long p = 1;
    final StringBuilder sb = new StringBuilder();
    for (int k = n / 2 + 1; k < n; ++k) {
      sb.append(a(k));
    }
    final String s = sb.toString();
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && ((n & 1) == 0 || new Z(s + p).isProbablePrime())) {
        mUsed.add(p);
        return Z.valueOf(p);
      }
    }
  }
}

