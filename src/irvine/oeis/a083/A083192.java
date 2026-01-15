package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083192 a(1) = 1, then the rearrangement of composite numbers such that the concatenation of n terms from the n-th term is a prime. (Concatenation of n-th term to (2n-1)th term is a prime number).
 * @author Sean A. Irvine
 */
public class A083192 extends CachedSequence {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();

  /** Construct the sequence. */
  public A083192() {
    super(1);
  }

  @Override
  protected Z compute(final Z m) {
    final int n = m.intValue();
    if (n == 1) {
      return Z.ONE;
    }
    long c = 3;
    final StringBuilder sb = new StringBuilder();
    for (int k = n / 2 + 1; k < n; ++k) {
      sb.append(a(k));
    }
    final String s = sb.toString();
    while (true) {
      if (mPrime.isPrime(++c)) {
        ++c;
      }
      if (!mUsed.contains(c) && ((n & 1) == 0 || new Z(s + c).isProbablePrime())) {
        mUsed.add(c);
        return Z.valueOf(c);
      }
    }
  }
}

