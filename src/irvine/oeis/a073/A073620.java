package irvine.oeis.a073;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073620 a(1) = 0; a(n) = smallest prime number which is a sum of n distinct composite numbers.
 * @author Sean A. Irvine
 */
public class A073620 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mC = 1;
  private long mSum = 0;

  private long nextComposite(long n) {
    while (mPrime.isPrime(++n)) {
      // do nothing
    }
    return n;
  }

  @Override
  public Z next() {
    // The answer will be close to the sum of the n composites
    mC = nextComposite(mC);
    mSum += mC;
    if (++mN == 1) {
      return Z.ZERO;
    }
    if (mPrime.isPrime(mSum)) {
      return Z.valueOf(mSum);
    }
    // Try replacing up to 2 composites in the sum of the first n composites
    final long q = nextComposite(mC);
    final TreeSet<Long> possibles = new TreeSet<>();
    for (long r = 4; r <= mC; r = nextComposite(r)) {
      final long s = mSum - r + q;
      if (mPrime.isPrime(s)) {
        possibles.add(s);
      }
    }
    final long u = nextComposite(q);
    for (long r = 4; r <= mC; r = nextComposite(r)) {
      final long s = mSum - r + u;
      if (mPrime.isPrime(s)) {
        possibles.add(s);
      }
    }
    for (long r = 4; r <= mC; r = nextComposite(r)) {
      for (long v = 4; v < r; v = nextComposite(v)) {
        final long s = mSum - r - v + q + u;
        if (mPrime.isPrime(s)) {
          possibles.add(s);
        }
      }
    }
    return Z.valueOf(possibles.first());
  }
}
