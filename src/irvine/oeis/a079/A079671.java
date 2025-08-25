package irvine.oeis.a079;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079671 extends Sequence1 {

  // Quadratic is irreducible if b^2-4ac is not a square

  private long mCount = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    // a == n
    for (long b = 1; b <= mN; ++b) {
      for (long c = 1; c <= mN; ++c) {
        final long d = b * b - 4 * mN * c;
        if (!Predicates.SQUARE.is(d)) {
          ++mCount;
        }
      }
    }
    // b == n
    for (long a = 1; a < mN; ++a) { // a == n already handled
      for (long c = 1; c <= mN; ++c) {
        final long d = mN * mN - 4 * a * c;
        if (!Predicates.SQUARE.is(d)) {
          ++mCount;
        }
      }
    }
    // c == n
    for (long a = 1; a < mN; ++a) { // a == n already handled
      for (long b = 1; b < mN; ++b) { // b == n already handled
        final long d = b * b - 4 * a * mN;
        if (!Predicates.SQUARE.is(d)) {
          ++mCount;
        }
      }
    }
    return Z.valueOf(mCount);
  }
}

