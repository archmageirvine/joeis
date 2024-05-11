package irvine.oeis.a064;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064816 Numbers which are the sums of two positive triangular numbers (A000217) in exactly two different ways.
 * @author Sean A. Irvine
 */
public class A064816 extends Sequence1 {

  private final long mWays;
  private long mN = 15;

  protected A064816(final long ways) {
    mWays = ways;
  }

  /** Construct the sequence. */
  public A064816() {
    this(2);
  }

  private boolean is(final long n) {
    long k = 0;
    long cnt = 0;
    while (true) {
      final long t = ++k * (k + 1) / 2;
      if (2 * t > n) {
        break;
      }
      if (Predicates.TRIANGULAR.is(n - t) && ++cnt > mWays) {
        break;
      }
    }
    return cnt == mWays;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

