package irvine.oeis.a073;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073621 extends Sequence1 {

  private final Fast mPrime = new Fast();
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
    if (!mPrime.isPrime(mSum)) {
      return Z.valueOf(mSum);
    }
    // Try replacing up to 2 composites in the sum of the first n composites
    final long q = nextComposite(mC);
    final TreeSet<Long> possibles = new TreeSet<>();
    for (long r = 4; r <= mC; r = nextComposite(r)) {
      final long s = mSum - r + q;
      if (!mPrime.isPrime(s)) {
        possibles.add(s);
      }
    }
    final long u = nextComposite(q);
    for (long r = 4; r <= mC; r = nextComposite(r)) {
      final long s = mSum - r + u;
      if (!mPrime.isPrime(s)) {
        possibles.add(s);
      }
    }
    for (long r = 4; r <= mC; r = nextComposite(r)) {
      for (long v = 4; v < r; v = nextComposite(v)) {
        final long s = mSum - r - v + q + u;
        if (!mPrime.isPrime(s)) {
          possibles.add(s);
        }
      }
    }
    return Z.valueOf(possibles.first());
  }
}
