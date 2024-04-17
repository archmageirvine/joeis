package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075875 Triangular numbers that are 3-almost primes.
 * @author Georg Fischer
 */
public class A075875 extends Sequence1 {

  private long mN;
  private final int mCount;

  /** Construct the sequence. */
  public A075875() {
    this(3);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A075875(final int count) {
    mCount = count;
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z tri = Z.valueOf(mN + 1).multiply(mN).divide2();
      if (Functions.BIG_OMEGA.l(tri) == mCount) {
        return tri;
      }
    }
  }
}
