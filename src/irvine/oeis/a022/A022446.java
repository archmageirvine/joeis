package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.util.array.DynamicIntArray;

/**
 * A022446 Fractal sequence of the dispersion of the composite numbers.
 * @author Sean A. Irvine
 */
public class A022446 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private final Sequence mPrimePiSeq = new A000720();
  private final DynamicIntArray mPi = new DynamicIntArray();
  {
    // fillers for 0th positions
    mPi.set(0, 0);
    add(null);
  }

  private int primePi(final int n) {
    while (n >= mPi.length()) {
      mPi.set(mPi.length(), mPrimePiSeq.next().intValueExact());
    }
    return mPi.get(n);
  }

  private int compositePi(final int n) {
    return n - 1 - primePi(n);
  }

  @Override
  protected Z computeNext() {
    int n = size();
    return n != 1 && !mPrime.isPrime(n) ? get(compositePi(n)) : Z.valueOf(primePi(n) + 1);
  }
}
