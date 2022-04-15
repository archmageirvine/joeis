package irvine.oeis.a124;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A124940 Numbers n such that n and n+3 are 3-almost primes.
 * @author Georg Fischer
 */
public class A124940 implements Sequence {

  private int mCount;
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
      if (Cheetah.factor(mN).bigOmega() == mCount && Cheetah.factor(mN + mCount).bigOmega() == mCount) {
        return Z.valueOf(mN);
      }
    }
  }
}
