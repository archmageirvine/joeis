package irvine.oeis.a146;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A146526 a(n) = the smallest positive integer m with exactly n (no more, no fewer) distinct primes represented in binary as substrings within the binary representation of m.
 * @author Sean A. Irvine
 */
public class A146526 implements Sequence {

  private static final int MAX_TERMS = 1000;
  private final Fast mPrime = new Fast();
  private final long[] mFirst = new long[MAX_TERMS];
  private final ArrayList<String> mS = new ArrayList<>();
  private int mN = -1;
  private long mC = 0;
  private long mNextP = 2;

  private int count(final long v) {
    final String s = Long.toBinaryString(v);
    while (mNextP <= v) {
      final String ps = Long.toBinaryString(mNextP);
      mS.add(ps);
      mNextP = mPrime.nextPrime(mNextP);
    }
    int c = 0;
    for (final String t : mS) {
      if (s.contains(t)) {
        ++c;
      }
    }
    return c;
  }

  @Override
  public Z next() {
    if (++mN >= MAX_TERMS) {
      throw new UnsupportedOperationException();
    }
    if (mFirst[mN] == 0) {
      int t;
      do {
        t = count(++mC);
        if (mFirst[t] == 0) {
          mFirst[t] = mC;
        }
      } while (t != mN);
    }
    return Z.valueOf(mFirst[mN]);
  }
}
