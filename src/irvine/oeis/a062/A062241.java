package irvine.oeis.a062;

import java.util.Iterator;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062241 Smallest integer &gt;= 2 that is not the sum of 2 positive integers whose prime factors are all &lt;= p(n), the n-th prime.
 * @author Sean A. Irvine
 */
public class A062241 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 0;
  private long mM = 2;

  private final class SmoothIterator implements Iterator<Long> {

    private final TreeSet<Long> mSmooth = new TreeSet<>();
    private final long mP;

    private SmoothIterator(final long p) {
      mP = p;
      mSmooth.add(1L);
    }

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Long next() {
      final long t = mSmooth.pollFirst();
      for (long q = 2; q <= mP; q = mPrime.nextPrime(q)) {
        mSmooth.add(t * q);
      }
      return t;
    }
  }

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 1;
      return Z.THREE;
    }
    final TreeSet<Long> seen = new TreeSet<>();
    mP = mPrime.nextPrime(mP);
    final SmoothIterator si = new SmoothIterator(mP);
    long t = si.next();
    while (true) {
      while (mM > t) {
        final SmoothIterator sj = new SmoothIterator(mP);
        long u;
        do {
          u = sj.next();
          final long s = t + u;
          if (s >= mM) {
            seen.add(s);
          }
        } while (u != t);
        t = si.next();
      }
      if (!seen.remove(mM)) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}

