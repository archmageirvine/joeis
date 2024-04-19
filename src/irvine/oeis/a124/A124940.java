package irvine.oeis.a124;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A124940 Numbers n such that n and n+3 are 3-almost primes.
 * @author Georg Fischer
 */
public class A124940 extends Sequence1 {

  private final int mCount;
  private int mN;

  /** Construct the sequence. */
  public A124940() {
    this(3);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A124940(final int count) {
    mCount = count;
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.BIG_OMEGA.l(mN) == mCount && Functions.BIG_OMEGA.l(mN + mCount) == mCount) {
        return Z.valueOf(mN);
      }
    }
  }
}
