package irvine.oeis.a069;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A069272 11-almost primes (generalization of semiprimes).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A069272 implements Sequence {

  private long mN;
  private final int mCount;

  /** Construct the sequence. */
  public A069272() {
    this(11);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A069272(final int count) {
    mCount = count;
    mN = (1L << count) - 1; // start with product of 11 twos
  }

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() == mCount) {
        return Z.valueOf(mN);
      }
    }
  }
}
