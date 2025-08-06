package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A045939 Numbers m such that the factorizations of m..m+2 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045939 extends AbstractSequence {

  private long mN = 1;
  private final int mDist; // for the range of m

  /** Construct the sequence. */
  public A045939() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param dist for the range of m
   * @param first first term
   */
  public A045939(final int offset, final int dist, final long first) {
    super(offset);
    mN = first - 1;
    mDist = dist;
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param dist for the range of m
   */
  public A045939(final int offset, final int dist) {
    this(offset, dist, 1);
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final long s = Functions.BIG_OMEGA.l(++mN);
      for (long k = 1; k <= mDist; ++k) {
        if (Functions.BIG_OMEGA.l(mN + k) != s) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
